public class Sinusolidally {

	// first iteration of the string. Grabs all of the high chars.
	private static String highIteration(String sampleStr) {
		String snakeStr = "";		
		for (int i = 1; i < sampleStr.length(); i += 4) {
			snakeStr += sampleStr.charAt(i);
		}
		return snakeStr;
	}

	// second iteration for the middle characters of the string
	private static String midIteration(String sampleStr, String currStr) {
		for (int i = 0; i < sampleStr.length(); i += 2) {
			currStr += sampleStr.charAt(i);
		}
		return currStr;
	}

	// last iteration for the bottom characters of the string
	private static String lowIteration(String sampleStr, String currStr) {
		for (int i = 3; i < sampleStr.length(); i += 4) {
			currStr += sampleStr.charAt(i);
		}
		return currStr;
	}

	// controlls all of the iterations
	public static String snakeIt(String sampleStr) {
		return lowIteration(sampleStr, (midIteration(sampleStr, highIteration(sampleStr))));
	}

	public static void main(String[] args) {

		System.out.println(snakeIt(args[0]));
	}
}