<%@ page import="javax.servlet.http.*" %>

<%
    Cookie[] cookies = request.getCookies();

    if (cookies != null) {
        for (Cookie c : cookies) {
            if (c.getName().equals("user")) {
                out.println("Welcome " + c.getValue());
            }
        }
    } else {
        out.println("No cookies found");
    }
%>
