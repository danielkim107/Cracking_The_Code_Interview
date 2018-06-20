
/**
 * <h1> String Compression </h1>
 * Implement a method to perform basic string compression using the counts
 * of repeated characters. For example. the string aabcccccaaa would
 * become a2b1c5a3. If the "compressed" string would not become smaller than
 * the original string, your method should return the original string. You
 * can assume the string has only uppercase and lowercase letters.
 * 
 * @author Jung Soo (Daniel) Kim
 */

public class strCompress {
	
	/**
	 * 
	 * @param input Str
	 * @return compressed Str if the compressed form is shorter than input
	 */
	
	public static String compressStr(String input) {
		StringBuilder compressedStr = new StringBuilder();
		
		char currChar = input.charAt(0);
		int charCounter = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if (currChar == input.charAt(i)) {
				charCounter++;
			} else {
				compressedStr.append(currChar);
				compressedStr.append(charCounter);
				currChar = input.charAt(i);
				charCounter = 1;
			}
		}
		
		compressedStr.append(currChar);
		compressedStr.append(charCounter);
		
		return (compressedStr.toString().length() < input.length()) ? 
				compressedStr.toString() : input;
	}
	
	public static void main(String[] args) {
		String test = "aabcccccaaa";
		String test2 = "abcdefghijk";
		String answer = compressStr(test);
		String answer2 = compressStr(test2);
		
		System.out.println(answer);
		System.out.println(answer2);
	}

}
