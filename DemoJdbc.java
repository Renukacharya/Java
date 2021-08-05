package org.jdbc;

import java.sql.*;

public class DemoJdbc {
	public static void main(String args[]) throws Exception
	{
		String url = "jdbc:mysql://Localhost:3306/class1";
		String uname = "root";
		String pass = "mysql123";
		String query = "select * from class1.student";
	
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		String name = rs.getString("FirstName");
		String name1 = rs.getString("LastName");
		System.out.print(name);
		System.out.print(" ");
		System.out.print(name1);
		
		st.close();
		con.close();
	}
}