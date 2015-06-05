package tracingQuestions;

public class Constructor {
	
	private String s;
	protected int x;
	
	public Constructor() {
		System.out.println("[1]" + this);
	}
	
	public Constructor(String s) {
		this();
		this.s = s;
		System.out.println("[2]" + this);
	}
	
	public String toString() {
		return " s = " + this.s + " x = " + this.x;
	}
}

class SubConstructor extends Constructor {
	protected String s;
	
	SubConstructor(int x) {
		super("label");
		x = this.x;
		System.out.println("[4] x = " + x);
	}
	
	public SubConstructor(String s) {
		this(12);
		this.s = s;
		x = 19;
		System.out.println("[5] x = " + x);
	}
}

class SubSubConstructor extends SubConstructor {
	private String s;
	
	public SubSubConstructor() {
		super("item");
		s = super.s;
		x++;
		System.out.println("[6] [s = " + this.s + "] " + this);
	}
	
	public String toString() {
		return "****** " + super.toString();
	}
	
	public static void main(String[] args) {
		SubSubConstructor ssc = new SubSubConstructor();
	}
}
