package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Updation {
    public static void main(String[] args) {
    	//step 1: register the driver

        try {
        	DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			//step 2: Connect the server by supplying URL(ip address, username, password)
			//3306 is the port number
        	Connection connection = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/24WH1A05A7",
	                "root",
	                "1234"
	        );
        	
        	//step 3: create Statement object to send queries to DB
        	Statement statement = connection.createStatement();
        	
        	//step 4: execute query
	        int number = statement.executeUpdate("UPDATE Employee SET Dept = 'Research' where Eid = 106");
	        System.out.println("Number of records updated: " + number);
	        
            ResultSet rs = statement.executeQuery("SELECT * FROM Employee");
            System.out.println("\nEid\tEname\tSalary\tDept");
            System.out.println("--------------------------------");

            while (rs.next()) {
                System.out.println(rs.getInt("Eid") + "\t" + rs.getString("Ename") + "\t" + rs.getInt("Salary") + "\t" + rs.getString("Dept"));
            }
	        
	        //step 5: close the connection
	        connection.close();
	    } 
        catch (SQLException e) {
        	e.printStackTrace();
	    }
	}
}