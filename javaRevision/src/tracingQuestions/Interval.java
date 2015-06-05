package tracingQuestions;

public class Interval {
	private int lower, upper;
	
	public Interval(int lower, int upper) throws OutOfRangeException {
		if (lower > upper) {
			throw new OutOfRangeException("lower greater than upper");
		}
		else {
			this.lower = lower;
			this.upper = upper;
		}
	}
	
	public void in (int num) throws OutOfRangeException {
		if (num > upper || num < lower) {
			throw new OutOfRangeException("Out of range");
		}
		else {
			return;
		}
	}
	
	public static void testInterval (int lower, int upper, int num) {
		try {
			Interval a = new Interval(lower, upper);
			a.in(num);
		} catch (OutOfRangeException oore) {
			oore.printStackTrace();
		}
	}
}
