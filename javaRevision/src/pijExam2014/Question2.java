package pijExam2014;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		List<Character> newList = new ArrayList<Character>();
		
		newList.add('2');
		newList.add('+');
		newList.add('3');
		
		System.out.println(validExpression(newList));
	}
	
	public static boolean validExpression(List<Character> list) {
		if (list.isEmpty() || list == null) {														// Must have a base case for an empty or null list
			return false;
		}
		if (list.size() % 2 == 0) {
			if (Character.isDigit(list.size() -1)) {
				list.remove(list.size() - 1);
				validExpression(list);
			}
			else
				return false;
		}
		if (list.size() % 2 != 0) {
			if (list.get(list.size() -1).equals('-') || list.get(list.size() - 1).equals('+')) {
				list.remove(list.size() - 1);
				validExpression(list);
			}
			else
				return false;
		}
		return true;
	}
}
