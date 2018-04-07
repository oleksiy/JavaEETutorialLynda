package servlets;

import beans.ConverterBeanLocal;
import beans.ConverterBeanLocal.ConvertType;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="servlets.ConverterServlet", urlPatterns = "/ConverterServlet")
public class ConverterServlet extends HttpServlet {

    @EJB
    ConverterBeanLocal converterBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        double result = converterBean.calculate(Double.valueOf(request.getParameter("temperature")), ConvertType.valueOf(request.getParameter("type")));

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");

            out.println("<head>");
            out.println("<title>Servlet Converter Servlet</title>");
            out.println("</head>");

            out.println("<body>");
            out.println("<h1>Servlet ConvertServlet @ "+request.getContextPath()+"</h1>");
            out.println("<h3>Converting "+ request.getParameter("type") +" "+ request.getParameter("temperature") +": "+ result +" degrees.</h3>");
            out.println("</body>");

            out.println("</html>");

        }
    }
}
