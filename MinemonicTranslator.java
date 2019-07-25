public class MinemonicTranslator {

	public static String translate(String input) {
		String newStringOfInts = "";
		for (int i =0; i < input.length(); i++) {
			//cconverting char to the it int it represents in memory
			char curr = input.charAt(i);
			switch (curr) {
				case 'a' :
				case 'b' :
				case 'c' :
									newStringOfInts += "2";
									break;
				case 'd' :
				case 'e' :
				case 'f' :
									newStringOfInts += "3";
									break;
				case 'g' :
				case 'h' :
				case 'i' :
									newStringOfInts += "4";
									break;
				case 'j' :
				case 'k' :
				case 'l' :
									newStringOfInts += "5";
									break;
				case 'm' :
				case 'n' :
				case 'o' :
									newStringOfInts += "6";
									break;
				case 'p' :
				case 'q' :
				case 'r' :
				case 's' :
									newStringOfInts += "7";
									break;
				
				case 't' :
				case 'u' :
				case 'v' :
									newStringOfInts += "8";
									break;
				
				case 'w' :
				case 'x' :
				case 'y' :
				case 'z' :
									newStringOfInts += "9";
									break;
			}
		}
		return newStringOfInts;
	}

	public static void main(String args[]) {
		String strMenomic = args[0].toLowerCase();
		System.out.println(translate(strMenomic));
	}
}