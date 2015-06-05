package exceptionsFromCatchBlock;

public class MyClass {

	public static void main(String[] args) {
		int x = 12;
		
		try {
			AnotherClass c = new AnotherClass();
			System.out.println("Value x is " + x);
			x = c.method(x + 10);
			System.out.println("Result is " + x);
		} catch (RuntimeException ex) {
			System.out.println(ex);
		} finally {
			System.out.println("MyClass  :: finally " + x);
		}
	}

}
