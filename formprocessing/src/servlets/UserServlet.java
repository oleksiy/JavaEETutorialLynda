package servlets;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

@WebServlet(urlPatterns = "/UserServlet")
public class UserServlet extends HttpServlet {

    static Logger log = Logger.getLogger("UserServlet");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            processRequest(req, resp);
        } catch (FileUploadException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public enum Gender {
        male, female
    }

    protected int calculateAge(LocalDate dOb){
        int realAge = LocalDate.now().getYear() - dOb.getYear();
        if(LocalDate.now().getMonthValue() >= dOb.getMonthValue()){
            if(LocalDate.now().getMonthValue() == dOb.getMonthValue() && LocalDate.now().getDayOfMonth() >= dOb.getDayOfMonth()){
                realAge++;
            }
        } else {
            realAge--;
        }
        return realAge;
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        response.setContentType("text/html; charset-UTF-8");

        //Form Fields
        String firstName ="", lastName="", plan = "";
        Integer age = new Integer(0);
        Gender gender = null;
        LocalDate dateOfBirth = null;
        Boolean agree = false;

        if (ServletFileUpload.isMultipartContent(request)) {

            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);

            List items = upload.parseRequest(request);
            Iterator iterator = items.iterator();

            while(iterator.hasNext()){
                FileItem item = (FileItem) iterator.next();
                if (item.isFormField()){
                    String fieldName = item.getFieldName().toLowerCase();
                    switch(fieldName){
                        case "first_name":
                            firstName = item.getString();
                            break;
                        case "last_name":
                            lastName = item.getString();
                            break;
                        case "gender":
                            gender = Gender.valueOf(item.getString());
                            break;
                        case "date":
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                            dateOfBirth = LocalDate.parse(item.getString(), formatter);
                            break;
                        case "plan":
                            plan = item.getString();
                            break;
                        case "agree":
                            agree = item.getString().equalsIgnoreCase("on")? true : false;
                            break;
                        case "age":
                            age = Integer.valueOf(item.getString());
                            break;
                        default:
                            log.info("Unable to parse field! " + item.getFieldName() + " - " + item.toString());
                            break;
                    }
                } else {
                    if(!item.getName().isEmpty()) {
                        item.write(new File(item.getName()));
                    }
                }
            }
        }

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Form Processing Via Servlet</title>");
            out.println("<body>");

            out.println("<p>First Name: " + firstName + "</p>");
            out.println("<p>Last Name: " + lastName + "</p>");
            out.println("<p>Gender: " + gender.toString() + "</p>");
            out.println("<p>Plan: " + plan + "</p>");
            out.println("<p>Date Of Birth: " + dateOfBirth.toString() + "</p>");
            out.println("<p>Age: "+ age +"</p>");
            out.println("<p>Your real age is: "+ calculateAge(dateOfBirth) +"</p>");
            if(agree){
                out.println("<p>You have accepted the terms and conditions</p>");
            }else{
                out.println("<p>You have not accepted the terms and conditions</p>");
            }


            out.println("</body>");
            out.println("</head>");
            out.println("</html>");

        }

        /*String first_name = request.getParameter("first_name");
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
        }*/
    }
}
