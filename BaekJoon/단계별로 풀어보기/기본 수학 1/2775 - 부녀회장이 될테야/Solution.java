import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[][] arr = new int[15][15];
		
		// 층은 0층부터, 호는 1호부터 시작하며, 1층의 경우 1, 2, 3, 4 ... 명이 살고있고, 층수에 관계 없이 1호에는 1명이 산다.
		for(int i=0; i<15 ; i++) {
			arr[0][i] = i;
			arr[i][1] = 1;
		}
		
		// i층 j호에 몇명이 거주하는지 배열에 저장
		for(int i=1; i<15; i++) {
			for(int j=2; j<15; j++) {
				arr[i][j] = arr[i][j-1] + arr[i-1][j];
			}
		}
		
		// 저장한 배열에서 거주 인원 출력
		for(int i=0; i<T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(arr[k][n]);
		}
	}
}