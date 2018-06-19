import java.util.Hashtable;

/**
 * <h1> Is Unique </h1>
 * Interview Question 1.1
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 * 
 * @author Jung Soo (Daniel) Kim
 */

public class isUnique {
	
	/**
	 * Tests whether the current String input contains all unique characters.
	 * @param str
	 * @return boolean of whether str has all unique characters
	 */
	
	public static boolean isUniqueHash(String str) {
		Hashtable<Character, Integer> ht = new Hashtable<>();
		boolean answer = false;
		
		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			if (ht.containsKey(curr)) {
				answer = true;
			} else {
				ht.put(curr, 1);
			}
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		String test = "ababa";
		boolean ans = isUniqueHash(test);
		
		System.out.println(ans);;
	}

}
