
public class Student {
	int id;
public Student() {
		
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
String name;
int age;

class Address {
	int houseNo;
	String streetName;
	String lanmdMark;
	String City;
	String state;
	int pinCode;
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getLanmdMark() {
		return lanmdMark;
	}
	public void setLanmdMark(String lanmdMark) {
		this.lanmdMark = lanmdMark;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public Address() {
	
	}
}
Address address = new Address();
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Student(Student.Address address) {
	super();
	this.address = address;
}

void displayStudentMarks() {
	
	class marks {
		int m1;
		int m2;
		int m3;
		
		void display() {
			System.out.println(m1 + " " +  m2 +  " " + m3);
		}
	}
	marks m = new marks();
	m.m1 = 40;
	m.m2 = 50;
	m.m3 = 60;
	m.display();
}
}
