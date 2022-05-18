import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 방이 중앙에서 멀어질수록 이전 방 갯수보다 6개씩 늘어난다.
		int N = Integer.parseInt(br.readLine());
		int M = 0;
		int result = 1;
		
		if(N!=1) {
			N--;
			while(N>0) {
				M += 6;
				N -= M;
				result++;
			}
		}
		
		System.out.println(result);
	}
}