package ProducerConsumerProblem;

public class Producer extends Thread {
Factory factory;

public Producer(Factory factory) {
	this.factory = factory;
}

@Override
	public void run() {
		int a = 0;
		while(true) {
			
			try {
				factory.setData(++a);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
