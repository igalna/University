package pijExam2014;


/*
 * 
 * 	Synchronized lock class
 * 
 */
public class Question4 {

	private boolean taken = false;
	
	public synchronized void acquireLock() throws InterruptedException {
		while (taken)
			wait();
		taken = true;
	}
	public synchronized void releaseLock() throws InterruptedException {
		taken = false;
		notifyAll();
	}
	
}
