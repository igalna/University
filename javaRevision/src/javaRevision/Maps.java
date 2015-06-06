package javaRevision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Maps {

	public static void main(String[] args) {
		
		List<String> nato = Arrays.asList( "Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliet",
							  "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango",
							  "Uniform", "Victor", "Whiskey", "X-ray", "Yankee", "Zulu" );
		
		List<Integer> num = IntStream.rangeClosed(0, 25).boxed().collect(Collectors.<Integer>toList());
		
		// generating a map with Java-8 stream and Collectors
		Map<Object, Object> map = num.stream().collect(Collectors.toMap(i -> i, i -> nato.get(i)));
		
		System.out.println(map);
		
		System.out.println(map.containsValue("Bravo"));
		System.out.println(map.containsKey(27));
		map.put(26, "One");
		map.put(27, "Two");
		System.out.println(map);
	}

}
