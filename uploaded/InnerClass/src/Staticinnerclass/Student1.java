package Staticinnerclass;


public class Student1 {

		int id;
		String name;
		int age;


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
		Address address;
		public Student1() {
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}

	   static class Address {
			int houseNo;
			String StreetName;
			String landMark;
			String city;
			String State;
			int pincode;
			
			public Address() {
				
			}
			public int getHouseNo() {
				return houseNo;
			}
			public void setHouseNo(int houseNo) {
				this.houseNo = houseNo;
			}
			public String getStreetName() {
				return StreetName;
			}
			public void setStreetName(String streetName) {
				StreetName = streetName;
			}
			public String getLandMark() {
				return landMark;
			}
			public void setLandMark(String landMark) {
				this.landMark = landMark;
			}
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public String getState() {
				return State;
			}
			public void setState(String state) {
				State = state;
			}
			public int getPincode() {
				return pincode;
			}
			public void setPincode(int pincode) {
				this.pincode = pincode;
			}
			
		}
}

