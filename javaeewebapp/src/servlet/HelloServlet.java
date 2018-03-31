package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String message;
        Integer a;
        Integer b;
        Integer sum;

        try {
            a = Integer.valueOf(request.getParameter("a"));
            b = Integer.valueOf(request.getParameter("b"));
            sum = a + b;
            message = "Calculation is " + a + "+" + b + " = " + sum;
        } catch(Exception e) {
            message = e.getMessage();
        }




        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>" +
                    "<head>" +
                    "<title>Hello Shitty Servlet</title>"+
                    "<body>" +
                    "<h1>Welcome to hello servlet</h1>" +
                    "<br>Context Path for servlet is " +
                    request.getServletPath() + "!"+
                    "<br><h2>" +
                    message +
                    "</h2>"+
                    "</body>"+
                    "</head>"+
                    "</html>");
        }
    }


}
