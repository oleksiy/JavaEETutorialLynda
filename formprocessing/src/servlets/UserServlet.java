package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        Integer age;
        try {
            age = Integer.valueOf(request.getParameter("age"));
        } catch (Exception ex) {
            response.sendRedirect("index.jsp");
            return;
        }

        if(age > 17) {
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Form Processing Via Servlet</title>");
                out.println("<body>");
                out.println("<h1>You have entered...</h1>");
                out.println("<p> First Name: " + first_name + "</p>");
                out.println("<p> Last Name: " + last_name + "</p>");
                out.println("<p> Age: " + age + "</p>");
                out.println("</body>");
                out.println("</head>");
                out.println("</html>");

            }
        } else if (age < 18) {
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Form Processing Via Servlet</title>");
                out.println("<body>");
                out.println("<h1>You have entered...</h1>");
                out.println("<p> First Name: " + first_name + "</p>");
                out.println("<p> Last Name: " + last_name + "</p>");
                out.println("<p> You have to be 18 to participate</p>");
                out.println("</body>");
                out.println("</head>");
                out.println("</html>");

            }
        }
    }
}
