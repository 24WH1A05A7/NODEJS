import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("username");

        HttpSession session = request.getSession(); // create session
        session.setAttribute("user", user);

        response.sendRedirect("dashboard");
    }
}
