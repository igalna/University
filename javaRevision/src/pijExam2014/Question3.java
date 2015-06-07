package pijExam2014;

import java.util.Comparator;
import java.util.List;

public class Question3<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//	Generic method to exchange the positions of two elements in an array
	public static <T>void arraySwapper(T[] array, int x, int y) {
		T temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
	
	// generic method to find the maximum element in an unsorted list
	public <T extends Comparable<? super T>>T maxElement(List<? extends T> list, int begin, int end) {
		
		T max = list.get(begin);
		
		for (++begin; begin < end; ++begin) {
			if (max.compareTo(list.get(begin)) < 0)
				max = list.get(begin);
		}
		return max;
	}
	
	// generic method to find the minimum element in a list
	public <T extends Comparable<? super T>> T minElement(List<T> list) {
		int count = 0;
		T min = list.get(count);
		
		for (++count; count < list.size(); count++) {
			if (min.compareTo(list.get(count)) < 0)
				min = list.get(count);
		}
		return min;
	}
}
