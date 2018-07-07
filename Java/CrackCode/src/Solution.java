import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] points = new int[4][2];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				points[i][j] = sc.nextInt();
			}
		}
		
		float firstSlope = (float) (points[0][1] - points[1][1])/
				(points[0][0] - points[1][0]);
		float secondSlope = (float) (points[2][1] - points[3][1])/
				(points[2][0] - points[3][0]);
	}
	
}