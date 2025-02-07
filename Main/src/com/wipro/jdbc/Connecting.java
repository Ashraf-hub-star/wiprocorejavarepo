package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connecting {

    public static void main(String[] args) {
        try {
            // 1. Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver class loaded successfully!");

            // 2. Establish a connection to the database
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/wipro?useSSL=false", 
                    "root", 
                    "root"
            );
            System.out.println("Connection to the database established successfully!");

            // 3. Create a Statement object
            Statement statement = connection.createStatement();

            // 4. Execute the SQL query to insert multiple rows
            String sqlQuery = "INSERT INTO student VALUES " +
                              "(100, 'rk'), " +
                              "(101, 'Ashraf'), " +
                              "(102, 'Chandra'), " +
                              "(103, 'Sohail')";

            int rowsInserted = statement.executeUpdate(sqlQuery);
            System.out.println(rowsInserted + " row(s) inserted successfully!");

            // 5. Close the connection
            connection.close();
            System.out.println("Connection closed!");

        } catch (ClassNotFoundException e) {
            System.out.println("Driver class not found! Please ensure the driver is correctly set up.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL exception occurred! Please check the query and database connection.");
            e.printStackTrace();
        }
    }
}
