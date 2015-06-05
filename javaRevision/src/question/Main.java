package question;

public class Main {

	public static void main(String[] args) {
		Thing a = new Thing();
		System.out.println(">>>");
		Base b = new Thing(true);
		System.out.println("[[[[");
		a.aMethod();
		System.out.println("---");
		b.anotherMethod();
	}
}
