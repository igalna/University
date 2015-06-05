package question;

public abstract class Base {

	protected static boolean YES = true;
	
	abstract public void myMethod();
	
	public void anotherMethod() {
		System.out.println("Base :: anotherMethod");
	}
}
