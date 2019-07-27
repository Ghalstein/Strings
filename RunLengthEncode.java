public class RunLengthEncode {

	//helper function for adding the reps to the string for decode
	private static String repGen(char ch, int n) {
		String subString = "";
		for (int i = 0; i < n; ++i) {
			subString += ch;
		}
		return subString;
	}

	// loops through the encoded code and converts it back to the uncoded string
	public static String decode(String code) {
		String str = "";
		String tempNum = "";
		for (int i = 0; i < code.length(); ++i) {
			if (code.charAt(i) >= 'a' && code.charAt(i) <= 'z') {
				str += repGen(code.charAt(i), Integer.parseInt(tempNum));
				tempNum = "";
			}
			else if (Character.isDigit(code.charAt(i))) {
				tempNum += code.charAt(i);
			}	
		}
		return str;
	}

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
		System.out.println(encode(args[0].toLowerCase()));
		System.out.println();
		System.out.println("Testing decode():");
		System.out.println(decode(args[1].toLowerCase()));
	}
}