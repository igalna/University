package javaRevision;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Maps {

	public static void main(String[] args) {
		
		List<String> nato = Arrays.asList( "Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliet",
							  "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango",
							  "Uniform", "Victor", "Whiskey", "X-ray", "Yankee", "Zulu" );
		
		List<Integer> num = IntStream.rangeClosed(0, nato.size() -1).boxed().collect(Collectors.<Integer>toList());
		
		Collections.shuffle(num);
		System.out.println(num);
		// generating a map with Java-8 stream and Collectors
		Map<Integer, String> map = num.stream().collect(Collectors.toMap(i -> i, i -> nato.get((int) i)));
		
		System.out.println(map);
		
		// iterating over the elements in a Map
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		/*System.out.println(map.containsValue("Bravo"));
		System.out.println(map.containsKey(27));
		map.put(26, "One");
		map.put(27, "Two");
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.values());
		//System.out.println(map.remove(0));
		System.out.println(map.replace(0, "APLHA"));
		System.out.println(map.remove(0, "alpha"));
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		//System.out.println(map);
		
		//Map<Object, Object> newMap = map.keySet().stream().collect(Collectors.toMap(i -> i, i -> map.values().get(i)));
		//System.out.println(newMap);
*/	}

}
