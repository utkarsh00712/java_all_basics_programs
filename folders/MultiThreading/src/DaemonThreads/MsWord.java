package DaemonThreads;

public class MsWord extends Thread {
@Override
public void run() {
	String name = Thread.currentThread().getName();
	
	if(name.equals("Type")) {
		typing();
	} else if(name.equals("Spell")) {
		spellCheck();
	} else {
		autoSaving();
	}
}

void typing() {
	for(int i = 0; i <=5; i++) {
		System.out.println("Typing....");
	
	try {
		Thread.sleep(3000);
	} catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}

void spellCheck() {
	for(; ; ) {
		System.out.println("Spelling is checked....");
	
	try {
		Thread.sleep(3000);
	} catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}

void autoSaving() {
	for( ; ; ) {
		System.out.println("AutoSaving....");
	
	try {
		Thread.sleep(3000);
	} catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}
}
