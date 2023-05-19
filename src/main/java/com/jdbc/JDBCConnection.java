package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {
	public static void main(String[] args) {
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb", "root", "Admin@123");
//			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcdb", "root", "Admin@123");

//			// create statement object
			Statement stm = con.createStatement();
////			String s = "INSERT INTO student (id, name, address)VALUES (106, 'hanuma', 'hyd')";
//			// execute query
			ResultSet rs=stm.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			System.out.println(con);
//			// close the connection
			con.close();
			System.out.println("query executed succesfully");
		} catch (SQLException e) {
//			// TODO Auto-generated catch block
			e.printStackTrace(); 
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
		}
	}

}
