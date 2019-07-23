public class AlphaNumConverter{

	private static int convertSubstring(char input){	
		final int ASCII_VALUE = input;
		if (ASCII_VALUE > 64 && ASCII_VALUE < 91) {
			return ASCII_VALUE - 64;
		}
		else 
			return 0;
	}

	public static int convertString(String spreadSheetId) {
		
		if (spreadSheetId.length() == 1) {
			return convertSubstring(spreadSheetId.charAt(0));
		}

		int product = 1;
		for (int i = 0; i < spreadSheetId.length(); i++) {
			product *= (spreadSheetId.charAt(i) - 64);
		}
	
		if (product > 0) {
			return product + 26;
		}
		else 
			return 0;

	}

	public static void main(String args[]) {
		String spreadSheetId = args[0];
		int conversion = convertString(spreadSheetId);
		
		if (conversion == 0) {
			String wrongInput = "You did not eneter a valid spreadsheet ID";
			System.out.println(wrongInput);
		}
		else {
			String correctInput = "The integer value of this spread sheet ID is: " + conversion;
			System.out.println(correctInput);
		}
	}
}