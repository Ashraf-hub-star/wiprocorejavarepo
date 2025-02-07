package com.wipro.jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DMLOperations {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro1?useSSL=false", "root", "root");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Choose an operation");
		System.out.println("1. Insert");
		System.out.println("2. Update");
		System.out.println("3. Delete");
		int choice = scanner.nextInt();
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from student");
	    while(resultSet.next())
	    {
	    	System.out.println(resultSet.getInt(1) + " "  + resultSet.getString(2) );
	    			
	    }
	    
		if(choice == 1) {
			System.out.println("Enter Student Id");
			int studentId= scanner.nextInt();
			System.out.println("Enter Student Name: ");
			String studentName = scanner.next();
			
			String insertSql = "INSERT INTO student (id, name) VALUES (?,?)";
			PreparedStatement psInsert =connection.prepareStatement(insertSql);
			
			psInsert.setInt(1, studentId);
			psInsert.setString(2, studentName);
			
			int rowsInserted = psInsert.executeUpdate();
			System.out.println(rowsInserted + " row(s) inserted successfully");
		}
		else if (choice ==2)
		{
			System.out.println("Enter Student ID to Update: ");
			int studentId = scanner.nextInt();
			System.out.println("Enter new Student Name: ");
			String studentName = scanner.next();
			
			String updateSql = "UPDATE student SET name = ? WHERE id =?";
			PreparedStatement psUpdate = connection.prepareStatement(updateSql);
			psUpdate.setString(1, studentName);
			psUpdate.setInt(2, studentId);
			int rowsUpdated = psUpdate.executeUpdate();
			System.out.println(rowsUpdated + " row(s) updated successfully.");
		}
		else if (choice == 3) {
            
            System.out.println("Enter Student ID to delete:");
            int studentId = scanner.nextInt();

            String deleteSQL = "DELETE FROM student WHERE id = ?";
            PreparedStatement psDelete = connection.prepareStatement(deleteSQL);
            psDelete.setInt(1, studentId);

            int rowsDeleted = psDelete.executeUpdate();
            System.out.println(rowsDeleted + " row(s) deleted successfully.");
		}
		else {
			System.out.println("Invalid choice. Choose any(1,2,3)");
		}
	}
}
