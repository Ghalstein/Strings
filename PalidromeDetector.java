public class PalidromeDetector {

	// compares the front and back of an array to eachother to see if they mirror each other
	public static boolean isPalidrome(String target) {
		char[] charArr = target.toCharArray();
		int j = charArr.length - 1;
		for (int i = 0; i < (charArr.length / 2); i++) {
			if (charArr[i] != charArr[j--]) {
				return false;
			}
		}
		return true;
	}

	public static void main (String[] args) {
		// the target string testing for the palidrome
		String target = args[0].toLowerCase();
		System.out.println(isPalidrome(target));
	}
}