
public class Main {
public static void main(String[] args) {
	
	Child child = new Child("Omkar");
	child.displayDetails();
	child.drink();
	
	Parent ref;
	ref = child;
	
	ref.displayDetails();
	// ref.drink(); we can not do this action
	((Child)(ref)).displayDetails();
	
	Parent ref2 = new Child ("Bharadwaj");
	ref2.displayDetails();
	((Child)(ref2)).drink();
}
}
