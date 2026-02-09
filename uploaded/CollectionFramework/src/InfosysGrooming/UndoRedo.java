package InfosysGrooming;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class UndoRedo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	ArrayList <String> actions = new ArrayList<String>();
	Stack <String> redoStack = new Stack<String> ();
	
	while(true) {
		System.out.println("Enter 1-> Action 2-> Undo 3->Redo 4->Show Other->TataByebye ");
		
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1 -> {
		System.out.println("Enter Action ");
		actions.add(sc.nextLine());
		redoStack.clear();
		}
		case 2 -> {
			if(actions.isEmpty()==false) {
				String removedAction = actions.remove(actions.size()-1);
				redoStack.push(removedAction);
				System.out.println("UNDID " + removedAction);
			} else {
				System.out.println("Nothing to undo");
			}
		}
		
		case 3 -> {
			
			if(redoStack.isEmpty()==false) {
				
				String newAction  = redoStack.pop();
				actions.add(newAction);
				System.out.println("RE-DID " + newAction);
				
			} else {
				System.out.println("Nothing to Redo");
			}
		}
		
		case 4-> {
			System.out.println("Actions " + actions);
		}
	
		default -> {
		System.out.println("TATA BYE BYE SEE YOU...");
		return;
		}
		}
	}
}
}
