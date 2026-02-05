package jdbc.Advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String dpath = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/kodnest";
	String user = "root";
	String password = "utkarsh@123";
	String sql = "select * from students where rollno= ? and password= ?";
	try {
		Class.forName(dpath);
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement(sql);
		System.out.println("Enter rollno and password");
		String rollno = sc.next().trim();
		String pwd = sc.next().trim();
		ps.setString(1, rollno);
		ps.setString(2, pwd);
		rs = ps.executeQuery();
		if(rs.next()) {
			System.out.println(rs.getInt(1) +" " + rs.getString(2) +" "+ rs.getInt(3) +" " + rs.getInt(4));
		} else {
			System.out.println("Invalid Credentials");
		}
	} catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(con!= null) con.close();
			if(ps!= null) ps.close();
			if(rs!= null) rs.close();
			if(sc!= null) sc.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
}
