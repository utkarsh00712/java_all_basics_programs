package ACIDProperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UCUCUBanking {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Connection con = null;
	PreparedStatement ps1 = null;
	PreparedStatement ps2 = null;
	
	String SQL1 ="Update ucucu set balance = balance - ? where userID = ? and password = ?";
	String SQL2 = "Update ucucu set balance = balance + ? where UserId = ?";
	String dPath = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/kodnest";
	String user = "root";
	String pass = "utkarsh@123";
	
	try {
		
		Class.forName(dPath);
		con = DriverManager.getConnection(url,user,pass);
		ps1 = con.prepareStatement(SQL1);
		ps2 = con.prepareStatement(SQL2);
		
		System.out.println("Enter from userId and password");
		int fuid = sc.nextInt();
		String fpass =sc.next();
		
		System.out.println("Enter to userId");
		int tuid = sc.nextInt();
		
		System.out.println("Enter the amount to be transferred");
		int amt = sc.nextInt();
		
		
		ps1.setInt(1, amt);
		ps1.setInt(2, fuid);
		ps1.setString(3, fpass);
		
		ps2.setInt(1, amt);
		ps2.setInt(2, tuid);
		
		con.setAutoCommit(false);
	int res1 = 	ps1.executeUpdate();
	int res2 = ps2.executeUpdate();
	    con.commit();
	    
	System.out.println((res1+res2) + " rows updated");
	
	} catch(Exception e) {
		try {
			con.rollback();
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	} 
	finally {
		try {
			
			if(con!= null) con.close();
			if(ps1!= null) ps1.close();
			if(ps2 != null) ps2.close();
			if(sc!= null) sc.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
}
