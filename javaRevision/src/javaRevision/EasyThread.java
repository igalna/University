package javaRevision;

import static java.lang.Thread.sleep;

public class EasyThread implements Runnable {

	private String threadName;
	private static int incrementer = 0;
	
	public EasyThread(String name) {
		this.threadName = name;
	}
	
	public String getName() {
		return threadName;
	}
	
	public synchronized int getIncrement() {
		increment();
		//decrement();
		return incrementer;
	}
	
	public void decrement() {
		incrementer--;
	}
	
	public void increment() {
		incrementer++;
	}
	
	@Override
	public void run() {
		
		while (incrementer < 20) {
			System.out.println(getName() + ": " + getIncrement());
		}
		
	}

}
/*for (int i = 0; i < 10; i++) {
	System.out.println(getName() + ": " + i);
	try {
		sleep((int) Math.random() * 1000);
	} catch (InterruptedException ex ) {
		System.out.println(ex.getMessage());
	}
}
System.out.println(getName() + ": COMPLETED");*/