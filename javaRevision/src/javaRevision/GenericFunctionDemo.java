package javaRevision;

import java.util.ArrayList;
import java.util.List;

public class GenericFunctionDemo {
		
	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<String>();
		stringList.add("Hello");
		stringList.add("GoodBye");
		stringList.add("Welcome");
		stringList.add("Functional");
		
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
		
		for (int i = 1; i < 10; i++)
			System.out.println("The factorial of " + i + " is " + factorial.func(i));
	}
}


@FunctionalInterface
interface GenericFunction<T> {
	T func(T t);
}