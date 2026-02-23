package StoreProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	CallableStatement cs = null;
	Connection con = null;
	String dpath = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/kodnest";
	String user = "root";
	String password = "utkarsh@123";
	String sql = "call insertCustomer(?,?,?,?,?,?)";
	
	try {
		Class.forName(dpath);
	    con=DriverManager.getConnection(url,user,password);
	    cs = con.prepareCall(sql);
	    System.out.println("Enter id, name, password, email, phone, balance");
	    
	    cs.setInt(1, sc.nextInt());
	    cs.setString(2, sc.next());
	    cs.setString(3, sc.next());
	    cs.setString(4, sc.next());
	    cs.setString(5, sc.next());
	    cs.setString(6, sc.next());
	    
	    boolean res = cs.execute();
	    if(res) {
	    	ResultSet rs = cs.getResultSet();
//	    	ResultSetMetaData rsmd =rs.getMetaData();
//	    	for(int i = 1; i<=rsmd.getColumnCount();i++) {
//	    		if(rsmd.getColumnTypeName(i).equals("Integer")) {
//	    			System.out.println(rs.getInt(i));
//	    		} else if(rsmd.getColumnTypeName(i).equals("String")) {
//	    			System.out.println(rs.getString(i));
//	    		}
//	    	}
	    	while(rs.next()) {
	    		System.out.println(rs.getInt(1) +" " + rs.getString(2) +" " + rs.getString(3) +" " + rs.getString(4) +" "
	    				+ rs.getString(5) +" "+ rs.getString(6));
	    	}
	    } else {
	    int result = cs.getUpdateCount();
	    System.out.println(result + " Rows affected");
	    }
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
		if(cs!= null) cs.close();
		if(con!= null) con.close();
		if(sc!=null) sc.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
}
