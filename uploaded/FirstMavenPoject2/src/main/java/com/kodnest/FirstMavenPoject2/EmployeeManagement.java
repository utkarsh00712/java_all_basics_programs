package com.kodnest.FirstMavenPoject2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeManagement {
Scanner sc = new Scanner(System.in);
Connection con = null;
String dpath = "com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/kodnest";
String user = "root";
String password = "utkarsh@123";

public EmployeeManagement() {
	try {
		Class.forName(dpath);
		con = DriverManager.getConnection(url, user, password);
	} catch(Exception e) {
		e.printStackTrace();
	}
}

void getEmployeeById(int id) {
	PreparedStatement ps = null;
	ResultSet rs = null;
	try {
		String sql = "Select * from employee where id = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1) +" " + rs.getString(2) + " " + rs.getInt(3) +" " 
		+ rs.getInt(4) +" "+ rs.getInt(5) +" "+ rs.getString(6));
		}
	} catch(Exception e) {
		e.printStackTrace();
	}
	 finally {
		 try {
		 ps.close();
		 rs.close();
		 } catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
}

void getAllEmployees() {
	PreparedStatement ps = null;
	ResultSet rs = null;
	try {
		String sql = "Select * from employee";
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1) +" " + rs.getString(2) + " " + rs.getInt(3) +" " 
		+ rs.getInt(4) +" "+ rs.getInt(5) +" "+ rs.getString(6));
		}
	} catch(Exception e) {
		e.printStackTrace();
	}
	 finally {
		 try {
		 ps.close();
		 rs.close();
		 } catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
}

void addEmployee(int id, String name, int age, int salary, int phone, String type) {
	String sql = "Insert into employee(id,name,age,salary,phone,type) values(?,?,?,?,?,?)";
	PreparedStatement ps = null;
	try {
		 ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, age);
		ps.setInt(4, salary);
		ps.setInt(5, phone);
		ps.setString(6, type);
		
        int res = ps.executeUpdate();
        System.out.println(res +" rows affected");
	} catch (SQLException e) {

		e.printStackTrace();
	}
	finally {
		try {
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

void updateEmployee(int id) {
	try {
		System.out.println("A -> update name, B -> Age , C -> salary");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'A' : {
			String sql = "update employee set name = ? where id = ?";
			PreparedStatement ps1 = con.prepareStatement(sql);
			System.out.println("Enter new Name");
			String n = sc.next();
			ps1.setString(1, n);
			ps1.setInt(2, id);
			
			int nora = ps1.executeUpdate();
			System.out.println(nora + " rows updated");
			ps1.close();
			break;
		}
		case 'B' : {
			String sql = "update employee set age = ? where id = ?";
			PreparedStatement ps2 = con.prepareStatement(sql);
			System.out.println("Enter new Name");
			int phone = sc.nextInt();
			ps2.setInt(1, phone);
			ps2.setInt(2, id);
			
			int nora = ps2.executeUpdate();
			System.out.println(nora + " rows updated");
			ps2.close();
			break;
		}
		case 'C' : {
			String sql = "update employee set salary = ? where id = ?";
			PreparedStatement ps3 = con.prepareStatement(sql);
			System.out.println("Enter new Name");
			int salary = sc.nextInt();
			ps3.setInt(1, salary);
			ps3.setInt(2, id);
			
			int nora = ps3.executeUpdate();
			System.out.println(nora + " rows updated");
			ps3.close();
			break;
		}
		default : {
			System.out.println("Invalid credentials please try again");
			updateEmployee(id);
		}
		}
	} catch(Exception e) {
		e.printStackTrace();
	}
}

void deleteEmployee(int id) {
	String sql = "delete from employee where id = ?";
	PreparedStatement ps = null;
	try {
	 ps = con.prepareStatement(sql);
	 ps.setInt(1, id);
	 int res = ps.executeUpdate();
	 System.out.println(res + " rows deleted");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	finally {
		try {
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
			
}
}
