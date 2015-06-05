package tracingQuestions;

public class OutOfRangeException extends Exception {

	private static final long SERIALVERSIONUID = 1L;
	private String reason;
	
	public OutOfRangeException(String reason) {
		this.reason = reason;
	}
	
	public String getReason() {
		return reason;
	}
}
