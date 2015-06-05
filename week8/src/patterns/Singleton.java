package patterns;

// example singleton pattern
public class Singleton {

	private static Singleton singleton;
	
	private Singleton () {
		
	}
	
/*	// lazy version of getInstance
	public Singleton getInstance() {
		// every time you try to get an instance using lazy evaluation
		// it has to perform this expensive test.
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}*/
	
	// eager version of getInstance()
	// if you know you are going to use the instance it is less expensive to create the instance straight away
	static {
		singleton = new Singleton();
	}
	public Singleton getInstance() {
		return singleton;
	}
}
