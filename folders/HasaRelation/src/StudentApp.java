
public class StudentApp {
	public static void main(String[] args) {
		Student S = new Student("Rahul",21,99);
		System.out.println("Student Details: " + S.name+" " +S.age+" " +S.marks);
		System.out.println("Heart Details: " + S.heart.color +" " + S.heart.weight);
		S.heart.beat();
		
		Book book = new Book("Fairy tale","William Shakesphere",500);
		S.ref = book;
		System.out.println("Books Details: " + S.ref.name +" " + S.ref.author +" " + S.ref.cost);
		S.ref.read();
		
		 S = null;
		 System.out.println("Student leaves");
		 //System.out.println("Heart Details: " + S.heart.color +" " + S.heart.weight);
		// S.heart.beat();
		 System.out.println("Book Details after leaving: " + book.name + " " + book.author+" " +book.cost);
		 book.read();
	}

}
