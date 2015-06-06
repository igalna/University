package javaRevision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Map {

	public static void main(String[] args) {
		
		List<Double> shufList = new ArrayList<Double>();
		Stream<Double> myStream;
		
		for (int x = 1; x < 51; x++) {
			shufList.add((double)x);
		}
		
		Collections.shuffle(shufList);
		List<Double> newList = new ArrayList<Double>();
		myStream = shufList.stream().sorted();
		myStream.forEach((x) -> newList.add(x));
		
		// maps each element in newList to its square root
		myStream = newList.stream().map((n) -> Math.sqrt(n));
		// reduces the stream to the product of the sqrts of myStream
		System.out.println(myStream.reduce(1.0, (a, b) -> a * b));
		//myStream.forEach((n) -> System.out.println(n + " "));
		
		// filters to find the even numbers under 11, then uses map to find their square roots
		myStream = newList.stream().filter((n) -> n % 2 == 0).
									filter((n) -> n < 11).
									map((n) -> Math.sqrt(n));
		myStream.forEach((n) -> System.out.println(n + " is the sqrt of " + Math.round(n*n)));

	}
}
