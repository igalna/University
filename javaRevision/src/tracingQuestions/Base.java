package tracingQuestions;

public class Base {
	
	public void methodOne() {
		System.out.println("A");
		methodTwo();
	}
	
	public void methodOne(int a) {
		System.out.println("W");
		methodTwo();
	}
	
	public void methodTwo() {
		System.out.print("B");
	}

}

class Derived extends Base {
	
	public void methodOne(int a) {
		super.methodOne();
		System.out.print("X");
		
	}
	
	public void methodOne(Integer a) {
		super.methodOne();
		System.out.print("C");
	}
	
	public void methodTwo() {
		super.methodTwo();
		System.out.print("D");
	}
	
	public static void main(String[] args) {
		Base b = new Derived();
		b.methodOne(0);
	}
}


