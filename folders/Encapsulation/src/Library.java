
public class Library {
public static void main(String[] args) {
	
	Book originalBook = new Book("Java fundamental" , 300);
	originalBook.display();
	
	Book copyBook = new Book(originalBook);
	copyBook.display();
	
	copyBook.pages = 350;
	System.out.println("After modifying Book: ");
	
	originalBook.display();
	copyBook.display();
}
}
