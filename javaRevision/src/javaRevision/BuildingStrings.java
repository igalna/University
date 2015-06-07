package javaRevision;

public class BuildingStrings {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		
		s.append("this");
		s.append(true);
		s.insert(s.length() - 4, false);
		//s.append(new Object());
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.capacity());
		System.out.println(s.indexOf("true"));

	}

}
