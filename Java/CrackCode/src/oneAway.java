
/**
 * <h1> One Away </h1>
 * Interview Question 1.5
 * There are three types of edits that can be performed on strings:
 * insert a character, remove a character, or replace a character. Given
 * two strings, write a function to check if they are one/zero edit away.
 * 
 * @author Jung Soo (Daniel) Kim
 */

public class oneAway {
	
	/**
	 * This function tests whether one string is one edit away from the
	 * other string based on the description above.
	 * @param str1
	 * @param str2
	 * @return boolean statement whether the strings are one edit away
	 * from each other.
	 */
	
	public static boolean ifOneAway(String str1, String str2) {
		boolean answer = false;
		
		if (str1.equals(str2)) return true;
		
		if (Math.abs(str1.length() - str2.length()) == 1) 
			answer = ifInsertDelete(str1, str2);
		
		if (str1.length() == str2.length()) {
			answer = ifReplaceOne(str1, str2);
		}
		
		return answer;
	}
	
	/**
	 * This helper function tests whether the two strings only differ 
	 * by one extra character.
	 * @param str1
	 * @param str2
	 * @return boolean statement whether the condition satisfies.
	 */
	
	public static boolean ifInsertDelete(String str1, String str2) {
		boolean answer = false;
		String longer, shorter;
		
		if (str1.length() > str2.length()) {
			longer = str1;
			shorter = str2;
		} else {
			shorter = str1;
			longer = str2;
		}
		
		StringBuilder longStr;
		StringBuilder shortStr = new StringBuilder(shorter);
		
		
		for (int i = 0; i < longer.length(); i++) {
			longStr = new StringBuilder(longer);
			if (longStr.deleteCharAt(i).toString().equals(shortStr.toString())) {
				answer = true;
				break;
			}
		}
		
		
		return answer;
	}
	
	/**
	 * This helper function tests whether the two strings only differ
	 * by one replacement of a character in the string.
	 * @param str1
	 * @param str2
	 * @return boolean statement whether the condition satifies.
	 */
	
	public static boolean ifReplaceOne(String str1, String str2) {
		boolean answer = false;
		
		StringBuilder sb1, sb2;
		
		for (int i = 0; i < str1.length(); i++) {
			sb1 = new StringBuilder(str1);
			sb2 = new StringBuilder(str2);
			
			if (sb1.deleteCharAt(i).toString().equals(sb2.deleteCharAt(i).toString())) {
				answer = true;
				break;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		String str1 = "pale";
		String str2 = "pales";
		
		boolean answer = ifOneAway(str1, str2);
		
		System.out.println(answer);
	}

}
