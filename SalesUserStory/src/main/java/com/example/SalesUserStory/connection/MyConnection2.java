
package com.example.SalesUserStory.connection;


import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection2 {

	public static final String URl = "jdbc:mysql://localhost:13306/SalesUser?useSSL=false";
	public static final String UserName = "root";
	public static final String Password = "bittu";

	public static Connection connection = null;

	private MyConnection2() {

	}

	public static Connection getConnection() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection(URl, UserName, Password);

		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return connection;

	}

}