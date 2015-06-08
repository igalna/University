package javaRevision;

public class BuildingStrings {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		
		char[] x = {'h', 'e', 'l', 'l', 'o'};
		
		String[] y = {"h", "e", "l", "l", "o"};
		
		s.append("this");
		s.append(true);
		s.insert(s.length() - 4, false);
		//s.append(new Object());
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.capacity());
		System.out.println(s.indexOf("true"));

		System.out.println(s.append(x));
		System.out.println(s.replace(4, 9, "Whoops"));
		
		// cant append arrays of strings to stringbuilder
		System.out.println(s.append(y));
		
		System.out.println(s.substring(5, 10));
		
		System.out.println(s.reverse());
		System.out.println(s.substring(5, 10));
	}
}