package pijExam2014;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question3<T> {

	public static void main(String[] args) {
		List<Integer> numList = IntStream.rangeClosed(0, 50).boxed().collect(Collectors.<Integer>toList());
		
		System.out.println(maxElement(numList, 23, 43));
		System.out.println(minElement(numList));
		
		// java 8
		System.out.println(min(numList).get());
		System.out.println(max(numList).get());

	}
	
	//	Generic method to exchange the positions of two elements in an array
	public static <T>void arraySwapper(T[] array, int x, int y) {
		T temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
	
	// generic method to find the maximum element in an unsorted list
	public static <T extends Comparable<? super T>>T maxElement(List<? extends T> list, int begin, int end) {
		
		T max = list.get(begin);
		
		for (++begin; begin < end; ++begin) {
			if (max.compareTo(list.get(begin)) < 0)
				max = list.get(begin);
		}
		return max;
	}
	
	// generic method to find the minimum element in a list
	public static <T extends Comparable<? super T>> T minElement(List<T> list) {
		int count = 0;
		T min = list.get(count);
		
		for (++count; count < list.size(); count++) {
			if (min.compareTo(list.get(count)) > 0)
				min = list.get(count);
		}
		return min;
	}
	
	// cannot use Collections
	/*public static <T extends Comparator<? super T>> T collectionsMin(List<T> list) {
		return Collections.min(list);
	}*/
	
	// using java 8 streams to generate the minimum in a generic list
	public static <T extends Comparable<? super T>> Optional<T> min(List<T> list) {
		return list.stream().min(T :: compareTo);
	}
	// java 8 version of maxElement
	public static <T extends Comparable<? super T>> Optional<T> max(List<T> list) {
		return list.stream().max(T :: compareTo);
	}
	
	// can't figure out how to do a contains kind of method using java 8 kind of things
	/*public static <T extends Comparable<? super T>> Optional<T> contains(List<T> list, T t) {
		return list.stream();
	}*/
}
