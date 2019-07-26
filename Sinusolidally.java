public class Sinusolidally {

	// first iteration of the string. Grabs all of the high chars.
	private static String highIteration(String sampleStr) {
		String snakeStr = "";		
		for (int i = 1; i < String.length(); i += 4) {
			snakeStr += sampleStr.charAt(i);
		}
		return snakeStr;
	}

	// second iteration for the middle characters of the string
	private static String midIteration(String sampleStr, String currStr) {
		for (int i = 0; i < String.length(); i += 2) {
			currStr += sampleStr.charAt(i);
		}
		return currStr;
	}

	// last iteration for the bottom characters of the string
	private static String lowIteration(String sampleStr, String currStr) {
		for (int i = 3; i < String.length(); i += 4) {
			currStr += sampleStr.charAt(i);
		}
		return currStr;
	}

	// controlls all of the iterations
	private static String snakeIt() {
		
	}

	public static void main(String[] args) {

	}
}