package Insertion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertionApp {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	
	Connection con = null;
	PreparedStatement ps = null;
	String dpath = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/kodnest ? user=root & password=utkarsh@123 ";
	String sql = "insert into students values(?,?,?,?,?,?)";
	
	try {
		Class.forName(dpath);
		con = DriverManager.getConnection(url);
		ps = con.prepareStatement(sql);
		
		System.out.println("Enter id name age marks rollNo and password");
		int id = sc.nextInt();
		String name = sc.next();
		int age = sc.nextInt();
		int marks  = sc.nextInt();
		String rollNo = sc.next();
		String pass = sc.next();
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, age);
		ps.setInt(4, marks);
		ps.setString(5, rollNo);
		ps.setString(6, pass);
		
		int res = ps.executeUpdate();
		System.out.println(res + " rows affected");
	} catch(Exception e) {
		e.printStackTrace();
	} 
	finally {
		try {
			
			if(con!= null) con.close();
			if(ps!= null) ps.close();
			if(sc != null) sc.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
}
