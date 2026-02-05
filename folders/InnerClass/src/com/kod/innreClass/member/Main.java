package com.kod.innreClass.member;

public class Main {
public static void main(String[] args) {
	Student student = new Student();
	student.setId(123);
	student.setName("Ramu");
	student.setAge(21);
	
	Student.Address address = student.new Address();
	address.setHouseNo(456);
	address.setStreetName("BTM Layout");
	address.setLandMark("Above Reliance Fresh");
	address.setCity("Bengaluru");
	address.setState("Karnataka");
	address.setPincode(560076);
	
	student.setAddress(address);
	System.out.println(student.getId() +" " + student.getName() + " " + student.getAge());
	System.out.println(student.address.getHouseNo() + " " + 
	                   student.address.getStreetName() + " " + 
			           student.address.getLandMark() + " " + 
	                   student.address.getCity() + " " + 
			           student.address.getState() + " " + 
	                   student.address.getPincode());
    student.displayStudentMarks();
}
}
