package myDi;

import java.math.BigDecimal;

// Dependency injection example using an ATM
interface ATM {

	public void deposit(BigDecimal amount);
	public void withdraw(BigDecimal amount);
}

class ATMImpl implements ATM {

	private ATMTransport transport;
	private byte[] dummy;
	
	
	void setTransport(ATMTransport trans) {
		this.transport = trans;
	}
	
	@Override
	public void deposit(BigDecimal amount) {
		System.out.println("Deposit");
		transport.communicateWithBank(dummy);
		
	}

	@Override
	public void withdraw(BigDecimal amount) {
		System.out.println("Withdraw");
		transport.communicateWithBank(dummy);
		
	}
	
}