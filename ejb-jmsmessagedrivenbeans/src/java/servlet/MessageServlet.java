package servlet;

import javax.annotation.Resource;
import javax.jms.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="MessageServlet", urlPatterns={"/MessageServlet"})
public class MessageServlet extends HttpServlet {
    @Resource(mappedName = "jms/dest")
    private Queue dest;

    @Resource(mappedName = "jms/__defaultConnectionFactory")
    private ConnectionFactory connectionFactory;

    Connection con = null;
    Session session = null;



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            processRequest(req, resp);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, JMSException {
        con = connectionFactory.createConnection();
        session = con.createSession(false, Session.AUTO_ACKNOWLEDGE);

        MessageProducer messageProducer = session.createProducer(dest);
        TextMessage tm = session.createTextMessage();
        tm.setText(request.getParameter("message"));
        messageProducer.send(tm);

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");

            out.println("<head>");
            out.println("<title>Servlet MessageServlet</title>");
            out.println("</head>");

            out.println("<body>");
            out.println("<h3>Message Sent!</h3>");
            out.println("</body>");

            out.println("</html>");
        }
    }
}
