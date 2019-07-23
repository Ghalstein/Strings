public class ReplaceAndRemove{

	private static char[] remove(char[] charArr, char remove) {
		// scans the array for how big to make the array
		int count = 0;
		for (char curr : charArr) {
			if (curr != remove) {
				count++;
			}
		}

		// adds all non removes to the array
		int i = 0;
		char[] newCharArr = new char[count];
		for (char curr : charArr) {
			if (curr != remove) {
				newCharArr[i++] = curr;
			}
		}

		return newCharArr;
	}

	private static char[] replace(char[] charArr, char replace, char replaceWith) {
		// scans the array for how big to make the array
		int count = 0;
		for (char curr : charArr) {
			if (curr != replace) {
				count++;
			}
			else {
				count += 2;
			}
		}

		// adds all non replaces to the array and repalces the replaces with replaceWiths
		int i = 0;
		char[] newCharArr = new char[count];
		for (char curr : charArr) {
			if (curr != replace) {
				newCharArr[i++] = curr;
			}
			else {
				newCharArr[i++] = replaceWith;
				newCharArr[i++] = replaceWith;
			}
		}

		return newCharArr;
	}

	public static String replaceAndRemove(char[] charArr, char remove, char replace, char replacedWith) {
		char[] removedCharArr = remove(charArr, remove);
		char[] replacedCharArr = replace(removedCharArr, replace, replacedWith);
		return new String(replacedCharArr);
	}

	public static void main(String args[]) {
		char[] arrOfChars = args[0].toCharArray();
		char removeThis = args[1].charAt(0);
		char replaceThis = args[2].charAt(0);
		char replacedWith = args[3].charAt(0);
		System.out.println(replaceAndRemove(arrOfChars, removeThis, replaceThis, replacedWith));
	}
}