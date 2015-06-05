package thingClassAClass;

public class AClass {

	private static int number = 10;
	final static int SOMENUMBER = 8;
	
	public AClass() {
		number++;
	}
	
	public void aMethod() {
		bMethod();
		System.out.println(this.getValue());
		System.out.println("AClass :: aMethod");
	}
	
	public void bMethod() {
		System.out.println(getValue() -2);
		System.out.println(getNum());
		System.out.println("AClass :: bMethod");
	}
	
	public int getValue() {
		return SOMENUMBER;
	}
	
	public static int getNum() {
		return number;
	}
	
}
