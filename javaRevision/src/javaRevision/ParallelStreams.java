package javaRevision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreams {

	public static void main(String[] args) {
		
		List<Double> shufList = new ArrayList<Double>();
		Stream<Double> myStream;
		
		for (int x = 0; x < 51; x++) {
			shufList.add((double)x);
		}
		
		Collections.shuffle(shufList);
		List<Double> newList = new ArrayList<Double>();
		myStream = shufList.stream().sorted();
		myStream.forEach((x) -> newList.add(x));
		
		
		// parallel streams
		//myStream = shufList.parallelStream().filter((n) -> n > 0);
		double sum = shufList.parallelStream().reduce(1.0, (a, b) -> a + b);
		System.out.println(sum);
		
		// product
		double product = newList.parallelStream().filter((n) -> n > 0).reduce(1.0, (a, b) -> a * b, (a, b) -> a * b);
		System.out.println(product);
		
		// product of square roots
		myStream = newList.parallelStream().filter((n) -> n > 0);
		double productOfSqrRoots = myStream.reduce(1.0, (a, b) -> a * Math.sqrt(b), (a, b) -> a * Math.sqrt(b));
		System.out.println(productOfSqrRoots);
	}
}
