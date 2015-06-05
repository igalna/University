package inherit;

public class Test {

	public static void main(String[] args) {
		A a = new B();
		a.incr(10);
		System.out.println(a);
	}

}
