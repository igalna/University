package javaRevision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lambda {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<Integer>();
		for (int x = 0; x < 51; x++) {
			myList.add(x);
		}
		
		// shuffles myList
		Collections.shuffle(myList);
		// creates an Integer Stream
		Stream<Integer> myStream;
		// sorts myList using stream().sorted()
		myStream = myList.stream().sorted();
		// creates a new ArrayList
		List<Integer> newList = new ArrayList<Integer>();
		// uses forEach to store sorted elements of the shuffled list in newList
		myStream.forEach((x) -> newList.add(x));

		
		// functional Interfaces with one int argument
		NumberTest greaterThan = ((n) -> n > 25);
		NumberTest isEven = ((n) -> n % 2 == 0);
		NumberTest isOdd = ((n) -> n % 2 != 0);
		
		// Functional Interfaces with two int arguments
		TwoNumberTest isFactor = ((n, d) -> n % d ==0);
		
		/*Stream<Integer> myStream;
		myStream = myList.stream().filter(isOdd);
		myStream.sorted().forEach((x) -> System.out.print(x + " "));*/
		
		/*// checks if x is even, then prints x
		for (int x : myList) {
			if (isEven.testNumber(x))
				System.out.println((isEven.testNumber(x)) + " " + x);
		}
		
		
		
		// checks if x is a factor of 5, then prints x
		for (int x : newList) {
			if (isFactor.testNumber(x, 5)) {
				System.out.println(x + " is a factor of " + 5);
			}
		}*/
	}

}

@FunctionalInterface
interface NumberTest {
	boolean testNumber(int x);
}

@FunctionalInterface
interface TwoNumberTest {
	boolean testNumber(int x, int y);
}