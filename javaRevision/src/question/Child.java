package question;

public class Child extends Parent {

	@Override
	public int getAge() {
		return super.getAge() / 2;
	}
	
	public static int getMore() {
		return 30;
	}
}
