import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] dp = new int[N+1][N+1];
		
		for (int i = 1; i < N+1; i++) {
			for (int j = 1; j < N+1; j++) {
				int n = sc.nextInt();
				 dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + n;
			}
		}

		for(int k = 0; k < M; k++) {
			int x1 = sc.nextInt();//2
			int y1 = sc.nextInt();//2
			int x2 = sc.nextInt();//3
			int y2 = sc.nextInt();//4
			
			System.out.println(dp[x2][y2]-dp[x1-1][y2]-dp[x2][y1-1]+dp[x1-1][y1-1]);
		}
	}
}