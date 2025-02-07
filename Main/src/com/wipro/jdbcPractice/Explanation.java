package com.wipro.jdbcPractice;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Explanation {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        // Load the MySQL JDBC driver to enable Java to interact with the MySQL database.
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish a connection to the MySQL database named 'wipro' running on localhost (port 3306).
        // Username and password for the database are both 'root'.
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro?useSSL=false", "root", "root");

        // Prepare a SQL query to select all rows from the 'student' table.
        // This query is used to fetch metadata about the table (like columns).
        PreparedStatement psMeta = connection.prepareStatement("SELECT * FROM student");

        // Execute the query and store the result in a ResultSet.
        ResultSet rsMeta = psMeta.executeQuery();

        // Retrieve metadata about the table's columns (number of columns, names, types, etc.).
        ResultSetMetaData metaData = rsMeta.getMetaData();

        // Get and print the number of columns in the table.
        int columnCount = metaData.getColumnCount();
        System.out.println("Number of columns: " + columnCount);

        // Loop through each column to print its details.
        for (int i = 1; i <= columnCount; i++) {
            // Print the column name and its type.
            System.out.println("Column " + i + ": " + metaData.getColumnName(i) + " (" + metaData.getColumnTypeName(i) + ")");
            
            // If the column is of type VARCHAR, print its maximum length.
            if (metaData.getColumnTypeName(i).equalsIgnoreCase("VARCHAR")) {
                System.out.println(" - Max Length: " + metaData.getColumnDisplaySize(i));
            }
        }

        // Prepare a SQL query to count the number of rows in the 'student' table.
        PreparedStatement psRows = connection.prepareStatement("SELECT COUNT(*) AS row_count FROM student");

        // Execute the query and store the result in a ResultSet.
        ResultSet rsRows = psRows.executeQuery();

        // Retrieve and print the row count from the query result.
        if (rsRows.next()) {
            System.out.println("Number of rows: " + rsRows.getInt("row_count"));
        }

        // Close all database resources to free up memory and avoid resource leaks.
        rsMeta.close();
        rsRows.close();
        psMeta.close();
        psRows.close();
        connection.close();
    }
}

