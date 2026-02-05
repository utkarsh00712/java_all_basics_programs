package ComparableInterface;

public class Person implements Comparable<Person>{

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int compareTo(Person other) {
		if(this.age > other.age) {
			return 1;
		} else if(this.age < other.age) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
