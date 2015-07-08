package javaRevision;

import static org.junit.Assert.*;

import java.util.stream.IntStream;

import org.junit.Test;

public class TestingRandomGen {

	int[] numbers = new int[] {-1, 0, 1, 2, 3};
	float[] probabilities = new float[] {(float) 0.01, (float) 0.3, (float) 0.58, (float) 0.1, (float) 0.01 };
	
	int[] moreNumbers = new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
	float[] moreProbabilities = new float[] {(float) 0.083, (float) 0.083, (float) 0.083, (float) 0.083, (float) 0.083, (float) 0.083, (float) 0.083, (float) 0.083, (float) 0.083, (float) 0.083, (float) 0.083, (float) 0.083 };
	
	RandomGen rg = new RandomGen(numbers, probabilities);
	RandomGen anotherRandomGenerator = new RandomGen(moreNumbers, moreProbabilities);
	
	
	@Test
	public void testPrintingDistribution() {
		int[] times = new int[numbers.length];
		
		for (int x = 0; x < 100; x++) {
			int next = rg.nextNum();
			for (int i = 0; i < numbers.length; i++) {
				if (next == numbers[i]) {
					times[i]++;
				}
			}
		}
		System.out.println("Number : Times");
		for (int y = 0; y < numbers.length; y++) {
			System.out.println(numbers[y] + " : " + times[y] );
		}
	}
	
	@Test
	public void testAgain() {
		
		System.out.println(moreNumbers.length);
		System.out.println(moreProbabilities.length);
		
		int[] times = new int[moreNumbers.length];
		
		for (int x = 0; x < 100; x++) {
			int next = anotherRandomGenerator.nextNum();
			for (int i = 0; i < moreNumbers.length; i++) {
				if (next == moreNumbers[i]) {
					times[i]++;
				}
			}
		}
		System.out.println("Number : Times");
		for (int y = 0; y < moreNumbers.length; y++) {
			System.out.println(moreNumbers[y] + " : " + times[y] );
		}
	}
}