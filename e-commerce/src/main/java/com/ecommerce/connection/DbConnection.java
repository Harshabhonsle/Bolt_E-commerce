package com.ecommerce.connection;

import java.sql.*;


public class DbConnection {
	private static Connection connection = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if (connection == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user="root";
			String pass="root";
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_commerce",user,pass);
			System.out.println("connected");
		}
		return connection;
	}

}