package myDi;

// main implementation of ATM
public class ATMmain {

	public static void main(String[] args) {
		ATM atm = new ATMImpl();
		ATMTransport trans = new SOAPATMTransport();
		// inject the transport
		// the  trans transport is injected into the atm
		// binds the transport outside of the class itself
		((ATMImpl)atm).setTransport(trans);
		
	}
}
