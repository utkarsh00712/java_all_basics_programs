
public class Book {
	String name;
	int pages;
	
	public Book(String name,int pages) {
		this.name = name;
		this.pages = pages;
		}
	//copy constructor
	public Book(Book another) {
		this.name = another.name;
		this.pages = another.pages;
	}
	
	public void display() {
		System.out.println("Book Name: " + name +"Book pages: " + pages);
	}

}
