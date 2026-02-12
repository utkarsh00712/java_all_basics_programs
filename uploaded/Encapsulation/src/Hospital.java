
public class Hospital {
	private int id;
	private int bill;
	private String name;
	
	public Hospital(int id, int bill, String name) {
		this.id = id;
		this.bill= bill;
		this.name = name;
		}
	public Hospital(Hospital copy)  {
		copy.id = id;
		copy.bill = bill;
		copy.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		 this.id = id;
	}
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	public String getName() {
		return name;
	}
    public void setName(String name) {
    	this.name = name;
    }
}
