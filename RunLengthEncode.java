public class RunLengthEncode {

	// loops through the string and keeps track of the current pattern by testing the next indeex
	public static String encode(String str) {
		String code = "";
		int reps = 1; // keeps track of the repitions of a char and always starts as 1 rep
		for (int i = 0; i < str.length(); ++i) {
			// for the purpose of not ending up out of bounds on the last rep
			if (i < str.length() - 1) {
				// comapres the forward char to the current char 
				if (str.charAt(i) == str.charAt(i + 1)) {
					++reps;
				}
				else {
					code += reps;
					code += str.charAt(i);
					reps = 1; // always starts as one rep
				} 
			}
			else {
				code += reps;
				code += str.charAt(i);
			} 
		}
		return code;	
	}
	public static void main(String[] args) {
		System.out.println("Testing encode():");
		System.out.println(encode(args[0]));
		System.out.println();
		// System.out.println("Testing decode():")
		// System.out.println(encode(args[0]));
	}
}