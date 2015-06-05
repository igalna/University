package inherit;

public class B extends A {

		private int i;
		
		@Override
		public void incr (int d) {
			if (d > 0) {
				this.i += d;
				System.out.println(d + " passed to B");
				System.out.println("B's i is now: " + i);
				super.incr(d / 2);
			}
		}
		
		@Override
		public String toString () {
			return super.toString() + " B's i is: " + i;
		}
}
