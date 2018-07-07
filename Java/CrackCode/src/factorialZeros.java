
public class factorialZeros {
	
	public static int countZeros(int n) {
		int answer = 0;
		while (n != 0) {
			n /= 5;
			answer += n;
		}
		return answer;
	}
	public static void main(String[] args) {
		int test = 100;
		int answer = countZeros(test);
		System.out.println(answer);
	}

}
