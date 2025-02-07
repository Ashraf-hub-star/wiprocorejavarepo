package com.wipro.jdbcPractice;


import java.sql.*;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        
        Class.forName("com.mysql.cj.jdbc.Driver");

       
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro1?useSSL=false", "root", "root");

       

       
        PreparedStatement psMeta = connection.prepareStatement("SELECT * FROM student");
        ResultSet rsMeta = psMeta.executeQuery();
        ResultSetMetaData metaData = rsMeta.getMetaData();
        
        
        int columnCount = metaData.getColumnCount();
        System.out.println("Number of columns: " + columnCount);

        
        for (int i = 1; i <= columnCount; i++) {
            System.out.println("Column " + i + ": " + metaData.getColumnName(i) + " (" + metaData.getColumnTypeName(i) + ")");
            
            
            if (metaData.getColumnTypeName(i).equalsIgnoreCase("VARCHAR")) {
                System.out.println(" - Max Length: " + metaData.getColumnDisplaySize(i));
            }
        }


        PreparedStatement psRows = connection.prepareStatement("SELECT COUNT(*) AS row_count FROM student");
        ResultSet rsRows = psRows.executeQuery();
        if (rsRows.next()) {
            System.out.println("Number of rows: " + rsRows.getInt("row_count"));
        }

        
        rsMeta.close();
        rsRows.close();
        psMeta.close();
        psRows.close();
        connection.close();
    }
}

