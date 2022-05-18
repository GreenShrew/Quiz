import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// 고정비용 A, 가변비용 B, 판매비용 C
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int result = 0;
		
		// B가 C와 같거나 큰 경우, 영원히 이득을 볼 수 없다.
		if(B >= C) {
			result = -1;
		}else {
			result = ( A / (C-B) ) + 1;
		}
		
		System.out.println(result);
	}
}