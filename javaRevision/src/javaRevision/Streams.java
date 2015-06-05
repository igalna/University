package javaRevision;

import java.util.*;
import java.util.stream.*;

public class Streams {
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// adds 0-50 to an ArrayList
		List<Integer> myList = new ArrayList<Integer>();
		for (int x = 0; x < 51; x++) {
			myList.add(x);
		}
	
		// creates a Stream variable
		Stream<Integer> myStream;
		
		// creates a stream of myList and compares each value to find the minimum using Stream.min()
		myStream = myList.stream();
		Optional<Integer> min = myStream.min(Integer :: compare);
		System.out.println(min);
		
		// creates a stream then uses compare to get the max value number
		myStream = myList.stream();
		Optional<Integer> max = myStream.max(Integer :: compare);
		System.out.println(max);

		// FILTER AND FOREACH
		
		// shuffles myList, then uses Stream.sorted() to put the numbers in order
		Collections.shuffle(myList);
		System.out.println(myList);
		myStream = (myList.stream().sorted());
		
		// creates a new ArrayList, cycles through the sorted elements of myList and adds them to newList
		List<Integer> newList = new ArrayList<Integer>();
		myStream.forEach((n) -> newList.add(n)); //System.out.print(n + " "));
		System.out.println(newList);
		
		// filters numbers that are divisible by 2
		myStream = newList.stream().
					filter((n) -> (n % 2) == 0);
		myStream.forEach((n) -> System.out.print(n + " "));
		System.out.println();
		
		// filters numbers that are divisble by 2 and greater than 5
		myStream = newList.stream().
					filter((n) -> (n % 2) == 0).
					filter((n) -> n > 5);
		myStream.forEach((n) -> System.out.print(n + " "));
		System.out.println();
		
		// creates a stream of the newList List, filters it to find only the numbers divisible by both 3 and 5. Then multiplies them by 2
		myStream = newList.stream().
					filter((n) -> (n % 3) == 0).
					filter((n) -> (n % 5) == 0).
					map((n) -> n*2);
		myStream.forEach((n) -> System.out.print(n + " "));
		System.out.println();
		
		// counts the number of items in the stream
		myStream = newList.stream();
		Long count = myStream.count();
		System.out.println(count);
		
		
		// REDUCE
		
		
		// obtain the integer product of all the elements of newList
		myStream = newList.stream().filter((n) -> n > 0);
		//myStream.forEach((n) -> System.out.print(n + " "));
		Optional<Integer> product = myStream.reduce((a, b) -> a * b);
		if (product.isPresent()) {
			System.out.println(product.get());
		}
		
		// creates a stream with all the numbers in newList greater than 0
		// uses reduce to find the product of all even numbers
		myStream = newList.stream().
					filter((n) -> n > 0);
		int evenProduct = myStream.reduce(1, (a, b) -> {
						  		if (b % 2 == 0) return a * b; else return a;
						  });
		System.out.println(evenProduct);
		
		// does the same as above but finds the product of all odd numbers
		myStream = newList.stream().
					filter((n) -> n > 0);
		int oddProduct = myStream.reduce(1, (a, b) -> {
								if (b % 2 == 0) return a * b; else return b;
						 });
		System.out.println(oddProduct);
	}
}
