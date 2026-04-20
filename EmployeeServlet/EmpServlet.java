package ebook;

import java.io.IOException;

import java.io.PrintWriter;

import java.util.List;

import javax.servlet.*;

import javax.servlet.http.*;

import javax.servlet.annotation.WebServlet;

@WebServlet("/employees")

public class EmpServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        EmployeeDAO dao = new EmployeeDAO();

        List<Employee> list = dao.getEmployees();

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h2>Employee List</h2>");

        for(Employee e : list) {

            out.println(e.getId() + " " + e.getName() + " " + e.getSalary() + " " + e.getCompany() + "<br>");

        }

    }

}
