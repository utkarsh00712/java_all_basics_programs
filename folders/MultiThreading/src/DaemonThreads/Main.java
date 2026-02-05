package DaemonThreads;

public class Main {
public static void main(String[] args) {
	MsWord t1 = new MsWord();
	MsWord t2 = new MsWord();
	MsWord t3 = new MsWord();
	
	t1.setName("Type");
	t2.setName("Spell");
	t3.setName("Save");
	
	t2.setPriority(Thread.MIN_PRIORITY);
	t3.setPriority(Thread.MIN_PRIORITY);
	
	t2.setDaemon(true);
	t3.setDaemon(true);
	
	t1.start();
	t2.start();
	t3.start();
}
}
