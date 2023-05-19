import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class hiddenForms extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Welcome</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form action='./name' method='get'>");
        out.println("<label for='name'>Name:</label>");
        out.println("<input type='text' id='name' name='name'><br>");
        out.println("<label for='location'>Location:</label>");
        out.println("<input type='text' id='location' name='location'><br>");
        out.println("<label for='age'>Age:</label>");
        out.println("<input type='hidden' id='age' name='age'><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
}