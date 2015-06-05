package question;

public abstract class GrandParent {

	private final static int HOWMUCH = 100;
	
	public abstract boolean good();
	
	public static int getMore() {
		return HOWMUCH;
	}
	
	public void eat() {
		if (good()) {
			System.out.println("Good!");
		}
		else {
			System.out.println("Bad!");
		}
	}
}
