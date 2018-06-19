import java.util.Hashtable;
import java.util.Set;

/**
 * <h1> Palindrome Permutation </h1>
 * Interview Question 1.4
 * Given a string, write a function to check if it is a permutation of a 
 * palindrome. A palindrome is a word or phrase that is the same forwards
 * and backwards. A permutation is a rearrangement of letters. The palindrome
 * does not need to be limited to just dictionary words.
 * 
 * @author Jung Soo (Daniel) Kim
 */

public class palindromePerm {
	
	/**
	 * This function returns a boolean statement of whether the given input
	 * is a permutation palindrome of another string.
	 * @param String input
	 * @return boolean whether the input is a palindrome permutation
	 */
	
	public static boolean ifPalindromePerm(String input) {
		
		input = input.toLowerCase();
		boolean answer = true;
		
		Hashtable<Character, Integer> ht = new Hashtable<>();
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') continue;
			if (!ht.containsKey(input.charAt(i))) {
				ht.put(input.charAt(i), 1);
			} else {
				ht.put(input.charAt(i), ht.get(input.charAt(i)) + 1);
			}
		}
		
		System.out.println(ht);
		
		Set<Character> keys = ht.keySet();
		int oddCount = 0;
		
		for (Character key : keys) {
			if (ht.get(key).intValue() % 2 == 1) {
				oddCount++;
			}
			if (oddCount > 1) {
				answer = false;
				break;
			}
		}

		return answer;
	}
	
	public static void main (String[] args) {
		String test = "Tact Coa";
		String longTest = "A Santa Lived As a Devil At NASA";
		boolean answer = ifPalindromePerm(test);
		boolean longAnswer = ifPalindromePerm(longTest);
		System.out.println(answer);
		System.out.println(longAnswer);
	}

}
