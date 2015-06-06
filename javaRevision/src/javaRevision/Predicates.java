package javaRevision;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Predicates {
	
	// predicate for greaterThan
	public static Predicate<Integer> greaterThan (int val) {
		return p -> p > val;
	}
	// predicate function for less than
	public static Predicate<Integer> lessThan(int val){
		return p -> p < val;
	}
	
	public static Predicate<Integer> divisibleBy(int val) {
		return p -> p % val == 0;
	}
	
	public static void main(String[] args) {
		
		List<Integer> range = IntStream.rangeClosed(0, 50)
			    .boxed().collect(Collectors.toList());
		
		System.out.println(range.stream().reduce((x,y) -> x + y).get());
		
		System.out.println(range.stream().filter(greaterThan(25)).collect(Collectors.<Integer>toList()));
		
		
		
	}
}