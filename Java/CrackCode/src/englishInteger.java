
public class englishInteger {

	public static String intToEnglish(int A) {
		int numDigits = String.valueOf(A).length();
		String digitStr = String.valueOf(A);
		String answer = "";
		if (numDigits > 9) {
			// Start with Billion -> Million -> Thousand -> Hundred
			answer = englishWord(digitStr.substring(0, 1)) + " Billion, " + 
					englishWord(digitStr.substring(1, 4)) + " Million, " + 
			englishWord(digitStr.substring(4, 7)) + " Thousand, " +
					englishWord(digitStr.substring(7, 10));
		} else if (numDigits > 6 && numDigits <= 9) {
			// Start with Million -> Thousand -> Hundred
			if (numDigits == 9) {
				answer = englishWord(digitStr.substring(0, 3)) + " Million, " + 
						englishWord(digitStr.substring(3, 6)) + " Thousand, " +
						englishWord(digitStr.substring(6, 9));
			} else if (numDigits == 8) {
				answer = englishWord(digitStr.substring(0, 2)) + " Million, " + 
						englishWord(digitStr.substring(2, 5)) + " Thousand, " +
						englishWord(digitStr.substring(5, 8));
			} else {
				answer = englishWord(digitStr.substring(0, 1)) + " Million, " + 
						englishWord(digitStr.substring(1, 4)) + " Thousand, " +
						englishWord(digitStr.substring(4, 7));
			}
		} else if (numDigits > 3 && numDigits <= 6) {
			// Start with Thousand -> Hundred
			if (numDigits == 6) {
				answer = englishWord(digitStr.substring(0, 3)) + " Thousand, " +
			englishWord(digitStr.substring(3, 6));
			} else if (numDigits == 5) {
				answer = englishWord(digitStr.substring(0, 2)) + " Thousand, " +
						englishWord(digitStr.substring(2, 5));
			} else if (numDigits == 4) {
				answer = englishWord(digitStr.substring(0, 1)) + " Thousand, " +
						englishWord(digitStr.substring(1, 4));
			}
		} else {
			answer = englishWord(digitStr);
		}
		return answer;
	}
	
	public static String englishWord(String str) {
		String answer = "";
		if (str.length() == 1) {
			str = "00" + str;
		} else if (str.length() == 2) {
			str = "0" + str;
		}
		switch(str.charAt(0)) {
		case '0' :
			break;
		case '1':
			answer = answer + "One Hundred ";
			break;
		case '2':
			answer = answer + "Two Hundred";
			break;
		case '3':
			answer = answer + "Three Hundred ";
			break;
		case '4':
			answer = answer + "Four Hundred ";
			break;
		case '5':
			answer = answer + "Five Hundred ";
			break;
		case '6':
			answer = answer + "Six Hundred ";
			break;
		case '7':
			answer = answer + "Seven Hundred ";
			break;
		case '8':
			answer = answer + "Eight Hundred ";
			break;
		case '9':
			answer = answer + "Nine Hundred ";
			break;
		}
		switch(str.charAt(1)) {
		case '0':
			break;
		case '1':
			switch(str.charAt(2)) {
			case '0':
				answer = answer + "Ten";
				return answer;
			case '1':
				answer = answer + "Eleven";
				return answer;
			case '2':
				answer = answer + "Tweleve";
				return answer;
			case '3':
				answer = answer + "Thirteen";
				return answer;
			case '4':
				answer = answer + "Fourteen";
				return answer;
			case '5':
				answer = answer + "Fifteen";
				return answer;
			case '6':
				answer = answer + "Sixteen";
				return answer;
			case '7':
				answer = answer + "Seventeen";
				return answer;
			case '8':
				answer = answer + "Eighteen";
				return answer;
			case '9':
				answer = answer + "Ninteen";
				return answer;
			}
		case '2':
			answer = answer + "Twenty ";
			break;
		case '3':
			answer = answer + "Thirty ";
			break;
		case '4':
			answer = answer + "Fourty ";
			break;
		case '5':
			answer = answer + "Fifty ";
			break;
		case '6':
			answer = answer + "Sixty ";
			break;
		case '7':
			answer = answer + "Seventy ";
			break;
		case '8':
			answer = answer + "Eighty ";
			break;
		case '9':
			answer = answer + "Ninety ";
			break;
		}
		switch(str.charAt(2)) {
		case '0' :
			break;
		case '1':
			answer = answer + "One";
			break;
		case '2':
			answer = answer + "Two";
			break;
		case '3':
			answer = answer + "Three";
			break;
		case '4':
			answer = answer + "Four";
			break;
		case '5':
			answer = answer + "Five";
			break;
		case '6':
			answer = answer + "Six";
			break;
		case '7':
			answer = answer + "Seven";
			break;
		case '8':
			answer = answer + "Eight";
			break;
		case '9':
			answer = answer + "Nine";
			break;
		}
		return answer;
	}
	public static void main(String[] args) {
		int test = 2013456774;
		String answer = intToEnglish(test);
		System.out.println(answer);

	}

}
