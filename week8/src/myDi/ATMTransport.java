package myDi;

// the ATMTransport interface
interface ATMTransport {
	
	public void communicateWithBank(byte[] dispatch);
}

// 3 implementations of the ATMTransport

class StandardATMTransport implements ATMTransport {

	@Override
	public void communicateWithBank(byte[] dispatch) {
		System.out.println("Communicating with Bank" + this.getClass());
		
	}
	
}

class SOAPATMTransport implements ATMTransport {

	@Override
	public void communicateWithBank(byte[] dispatch) {
		System.out.println("Communicating with Bank" + this.getClass());
		
	}
	
}

class RESTATMTransport implements ATMTransport {

	@Override
	public void communicateWithBank(byte[] dispatch) {
		System.out.println("Communicating with Bank" + this.getClass());
		
	}
	
}