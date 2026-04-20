package ebook;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import java.util.ArrayList;

import java.util.List;

public class EmployeeDAO {

		static Connection getDBConnection() {

		Connection connection = null;

		try {

			//Class.forName("com.mysql.cj.jdbc.Driver");

			//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/24WH1A05A7","root","1234");

			System.out.println("DB Connected");

		}

		catch (Exception e) {

			System.out.println("DB Failed");

			e.printStackTrace();

		}

		return connection;

	}

	List<Employee> getEmployees(){

		List<Employee> employeeList = new ArrayList<>();

		Connection connection = EmployeeDAO.getDBConnection();

		try {

			Statement statement = connection.createStatement();

			ResultSet rs = statement.executeQuery("select * from Emp");

			while(rs.next()) {

				Employee employee = new Employee(rs.getInt("id"), rs.getString("name"), rs.getInt("salary"), rs.getString("company"));

				employeeList.add(employee);

			}

			connection.close();

		} 

		catch (SQLException e) {

			e.printStackTrace();

		}

		return employeeList;

	}

}

