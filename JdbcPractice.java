package com.firstpackage;


import java.sql.*;

//import com.mysql.cj.conf.ConnectionUrl;

public class JdbcPractice
{

	public static void main(String[] args) throws ClassNotFoundException
	{
		// TODO Auto-generated method stub
		
		final String url="jdbc:mysql://localhost:3306/college";
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn =DriverManager.getConnection(url,"root","aman");
				Statement stmt=conn.createStatement();
				int rr=stmt.executeUpdate("insert into apply values(112,'DU','ee','N')");
				if(rr>0)
				{
					System.out.println("sucessful...");
				}
				else {
					System.out.println("unsucessful...");
				}
				conn.close();
			} 
			catch (SQLException e) 
			{
				// TODO: handle exception
				System.out.println(e);
			}
		
	}

}