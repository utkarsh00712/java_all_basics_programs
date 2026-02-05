
public class Main {
public static void main(String[] args) {
	Student student = new Student();
	student.setId(123);
	student.setName("Utkarsh");
	
	Student.Address address = new Student.Address();
	address.setHouseNo(123);
	address.setArea("Btm Layout");
	address.setCity("Bengaluru");
	
	student.setAddress(address);
	
	System.out.println(student.getId() + " " + student.getName());
	System.out.println(student.address.getHouseNo() + " " + student.address.getArea() + " " + student.address.getCity());
}
}
