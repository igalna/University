package javaRevision;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GenericFunctionDemo {
		
	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<String>();
		stringList.add("Hello");
		stringList.add("GoodBye");
		stringList.add("Welcome");
		stringList.add("Functional");
		
		List<Integer> range = IntStream.rangeClosed(0, 50)
			    .boxed().collect(Collectors.toList());
		
		// String type variation of the GeneralFuncton interface
		GenericFunction<String> reverseString = (str) -> { 
			return new StringBuilder(str).reverse().toString();
		};
		
		for (String str : stringList) {
			System.out.println(str + " reversed is " + reverseString.func(str));
		}
		
		// Integer type GenericFunction, generates the factorial of an int
		GenericFunction<Integer> factorial = (n) -> {
			int result = 1;
			for (int i = 1; i <=n; i++)
				result = i * result;
			return result;
		};
		
		for (Integer x: range)
			System.out.println("The factorial of " + x + " is " + factorial.func(x));
		
		// generic function for power
		GenericFunction<Integer> power = (n) -> {
			return n * n;
		};
		
		for (Integer x: range) {
			System.out.print(power.func(x) + " ");
		}
	
	}
}


@FunctionalInterface
interface GenericFunction<T> {
	T func(T t);
}