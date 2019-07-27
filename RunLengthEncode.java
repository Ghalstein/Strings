public class RunLengthEncode {

	// loops through the string and keeps track of the current pattern by testing the next indeex
	public static String encode(String str) {
		String code = "";
		int reps = 1;
		for (int i = 0; i < str.length(); ++i) {
			if (i < str.length() - 1) {
				if (str.charAt(i) == str.charAt(i + 1)) {
					++reps;
				}
				else {
					code += reps;
					code += str.charAt(i);
					reps = 1;
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