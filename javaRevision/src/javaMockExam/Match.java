package javaMockExam;

public class Match {

	public static void main(String[] args) {
		
		String leastSimilar;
		int similarityNumber = 0;
		
		

	}

	
	private static int similarity(String a, String b) {
		int result = 0;
		String longest;
		String shortest;
		if (a.length() > b.length()) {
			longest = a;
			shortest = b;
		}
		else {
			longest = b;
			shortest = a;
		}
		for (int x = 0; x < longest.length(); x++) {
			if (longest.charAt(x) == shortest.charAt(x)) {
				result ++;
			}
		}
		return result;
	}
}
