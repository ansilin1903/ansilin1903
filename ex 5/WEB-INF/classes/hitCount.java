import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class hitCount extends HttpServlet {

    private int hitCount = 0;
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");

        // This method executes whenever the servlet is hit
        // increment hitCount
        hitCount++;
        PrintWriter out = response.getWriter();
        String title = "Total Number of Hits";

        out.println("<html><head><title>" + title + "</title></head><body><h1 align = 'center'>" + title + "</h1><h2 align = 'center'>" + hitCount + "</h2></body></html>");
    }

}