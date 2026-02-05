package com.kodnest.FirstMavenPoject2;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	
    	EmployeeManagement em = new EmployeeManagement(); 
       Scanner sc = new Scanner(System.in);
       while(true) {
       System.out.println("Choose The operation");
       System.out.println("1 -> getEmployeeById");
       System.out.println("2 -> getAllEmployees");
       System.out.println("3 -> addEmployee");
       System.out.println("4 -> updateEmployee");
       System.out.println("5 -> deleteEmployee");
       System.out.println("other -> Exit");
       
       int ch = sc.nextInt();
       
       switch(ch) {
       case 1 : {
    	   System.out.println("Enter the id");
    	   int id = sc.nextInt();
    	   em.getEmployeeById(id);
    	   break;
       }
       
       case 2: {
    	em.getAllEmployees();
    	break;
       }
       case 3: {
    	   System.out.println("Enter id, name, age, salary, phone, type");
    	   int id = sc.nextInt();
    	   String name = sc.next();
    	   int age = sc.nextInt();
    	   int salary = sc.nextInt();
    	   int phone = sc.nextInt();
    	   String type = sc.next();
    	   
    	   em.addEmployee(id, name, age, salary, phone, type);
       }
       
       case 4: {
    	   System.out.println("Enter id");
    	   int id = sc.nextInt();
    	   em.updateEmployee(id);
    	   break;
       }
       
       case 5: {
    	   System.out.println("Enter id");
    	   int id = sc.nextInt();
    	   em.deleteEmployee(id);
    	   break; 
       }
       default : {
    	   System.out.println("Thank you for using ems");
    	   return;
       }
       }
       }
    }
}
