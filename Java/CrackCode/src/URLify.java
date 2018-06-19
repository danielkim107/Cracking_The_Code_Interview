
/**
 * <h1> URLify </h1>
 * Interview Question 1.3
 * Write a method to replace all spaces in a string with '%20'. You may 
 * assume that the string has sufficient space at the end to hold the 
 * additional characters, and that you are given the "true" length of the 
 * string. (If implementing in Java, please use a char[] array).
 * 
 * @author danielkim107
 */

public class URLify {
	
	/**
	 * Converts string with spaces into a URL-fied string (mentioned ^).
	 * @param input
	 * @param trueLength of the actual array (exclude additional space count)
	 */
	
	public static void addURL(char[] input, int trueLength) {
		int spaceCount = 0;
		
		for (int i = 0; i < trueLength; i++) {
			if (input[i] == ' ') {
				spaceCount++;
			}
		}
		
		int URLindex = trueLength + spaceCount * 2;
		
		for (int i = trueLength - 1; i >= 0; i--) {
			if (input[i] == ' ') {
				input[URLindex - 1] = '0';
				input[URLindex - 2] = '2';
				input[URLindex - 3] = '%';
				URLindex -= 3;
			} else {
				input[URLindex - 1] = input[i];
				URLindex--;
			}
		}
	}

	public static void main(String[] args) {
		char[] test = {'D','a','n','i','e','l',' ',
				'K','i','m',' ',' '};
		int trueLength = 10;
		
		System.out.println(test);
		addURL(test,trueLength);
		System.out.println(test);
	}

}
