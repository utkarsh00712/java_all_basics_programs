package ProducerConsumerProblem;

public class Factory  {

	int x;
	boolean isProduced = false;
	
	public void setData(int data) throws InterruptedException {
		if(isProduced) {
			wait();
		}
		
		x = data;
		System.out.println("Producer has Produced " + x);
		notify();
		}
	
	public void getData() throws InterruptedException {
		
		if(isProduced == false) {
			wait();
		}
		System.out.println("Consumer has Consumed " + x);
		
		isProduced = false;
		notify();
	}
}
