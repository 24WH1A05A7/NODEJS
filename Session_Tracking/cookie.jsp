<%@ page import="javax.servlet.http.*" %>

<%
    String username = request.getParameter("username");

    if (username != null) {
        Cookie c = new Cookie("user", username);
        c.setMaxAge(60 * 60); // 1 hour
        response.addCookie(c);
    }
%>

<form method="post">
    Enter Name: <input type="text" name="username">
    <input type="submit" value="Save in Cookie">
</form>

<a href="viewCookie.jsp">View Cookie</a>
