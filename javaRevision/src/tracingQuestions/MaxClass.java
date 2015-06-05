package tracingQuestions;

public class MaxClass {

	public static void main(String[] args) {
		try {
			C c = new C();
			System.out.println(c.max(13,29));
		} catch (RuntimeException rte) {
				System.out.println(rte);
		} finally {
				System.out.println("In finally of main");
		}
	}
}

class A {
	@SuppressWarnings("finally")
	int max(int x, int y) {
		try {
			if (x > y)
				x++;
			else
				throw new Exception("Oh Dear");
			System.out.println("A::max value of x is " + x);
		} catch  (Exception ex) {
			System.out.println("In exception " + ex.getMessage());
			System.out.println("x = " + x + " y = " + y);
			return y;
		} finally {
			System.out.println("A:: max finally block");
			throw new IllegalArgumentException("A::max finally x = " + x);
		}
	}
}

class C extends A {
	public int max(int x, int y) {
		return super.max(x + 10, y + 10);
	}
}