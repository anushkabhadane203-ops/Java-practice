package Com_pages;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/validate")
public class ValidationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String uname = request.getParameter("username");
        String pass = request.getParameter("password");

        if ("admin".equals(uname) && "1234".equals(pass)) {

            response.sendRedirect("account.html");

        } else if ("anushka".equals(uname) && "5678".equals(pass)) {

            response.sendRedirect("account.html");

        } else {

            response.setContentType("text/html");
            response.getWriter().println(
                    "<h2>Invalid Username or Password</h2>");
        }
    }
}