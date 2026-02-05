package ProducerConsumerProblem;

public class Consumer extends Thread {

	Factory factory;
	public Consumer(Factory factory) {
		super();
		this.factory = factory;
	}
	@Override
	public void run() {
	while(true) {
		try {
			factory.getData();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	}
}
