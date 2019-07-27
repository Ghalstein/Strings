public class SubstringSearch {

	// search through string with counter and temp string adding as coutner goes up and reset if not a match
	public static int find(String str, String subStr) {
		String matcher = ""; // is added to if matching chars are found in sequence

		// looping through the string for the substring
		for (int i = 0; i < str.length(); ++i) {
			// testing for whether the matchernext necessary character of the subtring matches the current string we are on
			if (str.charAt(i) == subStr.charAt(matcher.length())) {
				matcher += str.charAt(i);
				// tests if the length of the matcher == the substring to see if it is done
				if (matcher.length() == subStr.length()) {
					return i - (subStr.length() - 1);
				}
			}
			else {
				matcher = "";
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int index = find(args[0], args[1]);

		if (index == -1) {
			System.out.println("Could not find the substring");
		}
		else {
			System.out.println("Found the substring \"" + args[1] + "\" starting at character " + (index + 1) + " of the string.");
		}
	}
}