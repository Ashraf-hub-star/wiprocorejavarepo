package com.wipro.jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankingTest1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking?useSSL=false", "root","root");
		
		connection.setAutoCommit(false);
		Statement statement = connection.createStatement();
		int x=statement.executeUpdate("update ShaikAshraf set balance=balance-2000 where ACCOUNTHOLDER_ID=1");
		
		int y=statement.executeUpdate("update Chandra set balance=balance+2000 where ACCOUNTHOLDER_ID=2");
		
		if(x>0 && y>0)
		{
			connection.commit();
			System.out.println("Money Transferrend To account2 Account Successfully");
		}
		else {
			connection.rollback();
			System.out.println("Accound Holder's ID is wrong, Please Check It");
		}
		connection.close();
	}
}
