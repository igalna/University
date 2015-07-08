package javaRevision;

import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;

public class RandomGen {

	private int[] randomNums;
	
	private float[] probabilities;
	
	public RandomGen(int[] numbers, float[] probabilities) {
		this.randomNums = numbers;
		this.probabilities = probabilities;
	}
	
	public int nextNum() {
		
		List<Pair<Integer, Float>> pairs = pairUpNumbersWithProbabilities();
		
		int result = 0;
		
		double p = Math.random();
		double cumulativeProbability = 0.0;
		for (Pair<Integer, Float> pair : pairs) {
		    cumulativeProbability += (double)pair.getValue();
		    if (p <= cumulativeProbability) {
		        return pair.getKey();
		    }
		}
		return result;
	}
	
	private List<Pair<Integer, Float>> pairUpNumbersWithProbabilities() {
		List<Pair<Integer, Float>> numberProbabilityPairs = new ArrayList<>();;
		
		for (int x = 0; x < randomNums.length -1; x++) {
			Pair<Integer, Float> newPair = new Pair(randomNums[x], probabilities[x]);
			numberProbabilityPairs.add(newPair);
		}
		
		return numberProbabilityPairs;
		
	}
}
