
public class Student {
	private int id;
	private String name;
	private int marks;
	//setter for id:
	public void setid(int a) {
		if(a>0)
			id=a;
		else {
			id = 1234;
			System.out.println("The default id is 1234");
		}
	}
	//getter for id
	public int getid() {
		return id;
	}
	
	// setter for name
	public void setname(String b) {
		name = b;
	}
	//getter for name
	public String getname() {
		return name;
	}
	//setter for marks
	public void setmarks(int c) {
		if (c>0)
		marks = c;
		else{
			System.out.println("invalid input");
		}
		}
		
		
    public int getmarks() {
	return marks;
}
	}

