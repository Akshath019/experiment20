package example.com;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
    protected void doGet(HttpServletRequest req , HttpServletResponse res)
        throws IOException{
            res.setContentType("text/html");
            res.getWriter().println("<h1>CI/CD working</h1>");
        }
}