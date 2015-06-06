package javaRevision;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
		
		// generates a list of the numbers 1 - 50
		List<Integer> range = IntStream.rangeClosed(0, 50)
			    .boxed().collect(Collectors.toList());
		
		System.out.println(range.stream().reduce((x,y) -> x + y).get());
		
		System.out.println(range.stream().filter(greaterThan(25)).collect(Collectors.<Integer>toList()));
		System.out.println(range.stream().filter((x) -> x > 25).collect(Collectors.<Integer>toList()));
		
		System.out.println(range.stream().filter(lessThan(25)).collect(Collectors.<Integer>toList()));
		System.out.println(range.stream().filter((x) -> x < 25).collect(Collectors.<Integer>toList()));
		
		System.out.println(range.stream().filter(divisibleBy(3)).collect(Collectors.<Integer>toList()));
		System.out.println(range.stream().filter((x) -> x % 3 == 0).collect(Collectors.<Integer>toList()));
		
		
		// Optional things
		
		// generates an Optional by summing up the contents of range
		Optional opt = range.stream().reduce((x,y) -> x + y);
		Optional opt2 = Optional.empty();
		Optional opt3 = Optional.of(10);
		System.out.println(opt);
		System.out.println(opt.isPresent());
		System.out.println(opt.get());
		System.out.println(opt2.orElse("Nothing Here"));
		System.out.println(opt3.get());
	}
}