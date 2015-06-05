package question;

public class Thing extends Base {

	public Thing() {
		System.out.println("Thing Constructor");
	}
	public Thing(boolean b) {
		YES = !b;
	}
	
	@Override
	public void myMethod() {
		System.out.println("Thing :: myMethod");
		if (YES) {
			anotherMethod(this);
		}
		else {
			anotherMethod();
		}
	}
	public void aMethod() {
		System.out.println("Thing :: aMethod");
		super.anotherMethod();
		myMethod();
	}
	public void anotherMethod(Object o) {
		System.out.println("Thing :: anotherMethod");
		((Base) o).anotherMethod();
	}

}
