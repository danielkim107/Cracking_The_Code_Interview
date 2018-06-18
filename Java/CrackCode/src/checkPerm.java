import java.util.Arrays;

/**
 * <h1> Check Permutation </h1>
 * Interview Question 1.2
 * Given two strings, write a method to decide if one is 
 * a permutation of the other.
 * 
 * @author danielkim107
 */

public class checkPerm {
	
	/**
	 * Tests whether str1 is a permutation of str2.
	 * @param str1
	 * @param str2
	 * @return boolean of whether the strings are permutations of each other.
	 */
	
	public static boolean checkPerm(String str1, String str2) {
		
		char str1Arr[] = str1.toCharArray();
		char str2Arr[] = str2.toCharArray();
		
		Arrays.sort(str1Arr);
		Arrays.sort(str2Arr);
		
		String newStr1 = new String(str1Arr);
		String newStr2 = new String(str2Arr);
		
		System.out.println(newStr1);
		System.out.println(newStr2);

		if (newStr1.equals(newStr2)) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String str[]) {
		String str1 = "14ahfAdi";
		String str2 = "adi1FhA4";
		
		boolean ans = checkPerm(str1, str2);
		
		System.out.println(ans);
	}

}
