package InfosysGrooming;
import java.util.*;
public class UndoRedoLL {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        sc.nextLine(); // consume newline
	        String[] ops = new String[N];
	        for (int i = 0; i < N; i++) {
	            ops[i] = sc.nextLine();
	        }
	        System.out.println(textEditor(ops));
	    }

	    public static String textEditor(String[] ops) {
	        // Your code here
	    	LinkedList<String> action = new LinkedList<String>();
         Stack<String> undostack = new Stack<String>();
        
         for(String s : ops) {
         	if(s.equals("UNDO")) {
         		if(!action.isEmpty()) {
         			undostack.push(action.removeLast());
         		}
         	} 
         	else if(s.equals("REDO")) {
         		if(!undostack.isEmpty()) {
         			action.add(undostack.pop());
         		}
         	}
         	
         	else {
         		action.add(s);
         		undostack.clear();
         	}
         }
         	if(action.isEmpty()) {
         		
         		return "Empty";
         	}
         	return String.join(" ",action);
	    	
	    }
	}
