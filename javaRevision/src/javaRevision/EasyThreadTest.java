package javaRevision;

public class EasyThreadTest {

	public static void main(String[] args) {
		
		Thread one = new Thread(new EasyThread("ONE"));
		Thread two = new Thread(new EasyThread("TWO"));
		Thread three = new Thread(new EasyThread("THREE"));
		
		one.start();
		two.start();
		three.start();
		
		try {
			one.join();
		} catch (InterruptedException ex) {
			ex.getMessage();
		} finally {
			System.out.println("ONE JOIN");
		}
		
		
		try {
			two.join();
		} catch (InterruptedException ex) {
			ex.getMessage();
		} finally {
			System.out.println("TWO JOIN");
		}
		
		System.out.println("MAIN FINISHED");
	}

}
