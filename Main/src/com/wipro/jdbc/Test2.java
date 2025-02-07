package com.wipro.jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner; 
 
//to process dynamic queries
 
public class Test2 {
 
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//It uses to LOADs the MySql Driver into the program to interact with the MySql Database.
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//It gives connection to mysql databse named wipro which running on localhost (port 3306) and the username and password is: root
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro?useSSL=false", "root", "root");
		
		//Prepare is a parameterized SQL query for inserting data into the student table.
		//? placeholders allow dynamic values to be set during runtime.
		PreparedStatement ps = connection.prepareStatement("insert into student values(?,?)");
		
		//
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the student id:");
		int a = scanner.nextInt();
		System.out.println("enter the student name:");
		String b = scanner.next();
		
		//Replaces the ? placeholders in the SQL query with the values provided by the user.
		//setInt(1, a) assigns the first placeholder to student id.
		//setString(2, b) assigns the second placeholder to student name.
		ps.setInt(1, a);
		ps.setString(2, b);
		
		//The executeUpdate() method returns the number of rows affected by the query.
		int x = ps.executeUpdate();
		System.out.println(x + "row(s) inserted");
		connection.close();
	}
}
