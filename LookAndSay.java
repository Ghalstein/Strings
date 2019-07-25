public class LookAndSay {

	public static String lookAndSay(int n) {
		String str = "1";
		for (int i = 1; i < n; ++i) {
			str = next(str);
		}
		return str;
	}

	private static String next(String str) {
		StringBuilder newStr = new StringBuilder();
		for (int i = 0; i < str.length(); ++i) {
			int count = 1;
			while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				++i;
				++count;
			}
			newStr.append(count);
			newStr.append(str.charAt(i));
		}
		return newStr.toString();
	}

	public static void main(String args[]) {
		int iterations = Integer.parseInt(args[0]);
		System.out.println(lookAndSay(iterations));
	}
}