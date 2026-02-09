import java.util.LinkedList;
import java.util.Scanner;

public class LinkedlIst {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	sc.nextLine();
	
	LinkedList<String> ll = new LinkedList<String>();
	
	for(int i = 0; i < n; i++) {
		String attendeeName = sc.nextLine();
		ll.addLast(attendeeName);
	}
	
   String firstAttendee = ll.getFirst();
   
   String lastAttendee = ll.getLast();
   
   System.out.println("First attendee " + firstAttendee);
   System.out.println("Last attendee " + lastAttendee);
   
   int attendeeNumber = ll.size();
   System.out.println("Number of attendees " + attendeeNumber);
   
   System.out.println("Attendees");
   for(String x: ll) {
	   System.out.println(x);
   }
			
	
}
}
