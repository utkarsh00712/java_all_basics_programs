
public class Main {
public static void main(String[] args) {
	
	Student student = new Student();
	student.setId(123);
	student.setName("Ramu");
	student.setAge(21);
	
	Student.Address address = student.new Address();
	address.setHouseNo(456);
	address.setLanmdMark("Kodnest");
	address.setStreetName("Btm layout");
	address.setCity("Bengaluru");
	address.setState("Karnataka");
	address.setPinCode(123456);
	
	student.setAddress(address);
	
	
	System.out.println(student.getId() + " " + student.getAge() + " " + student.getName());
	System.out.println(student.address.getHouseNo() + " " + student.address.getLanmdMark() + " " + student.address.getStreetName()
	       +" " + student.address.getCity() + " " + student.address.getState() + " " + student.address.getPinCode());

	student.displayStudentMarks();
}
}
