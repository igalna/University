package inherit;

public class A {
	
	private int i;
	
	public void incr(int d) {
		if (d > 0) {
			this.i += d;
			System.out.println(d + " passed to A");
			System.out.println("A's i is now: " + i);
			this.incr(d-1);
		}
	}
	
	@Override
	public String toString() {
		return "A's i is: " + i;
	}
}
