import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 시간초과
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// 고정비용 A, 가변비용 B, 판매비용 C
		// int는 2,147,483,647 이 넘어가면 오버플로우가 발생한다!
		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		long C = Integer.parseInt(st.nextToken());
		long result = 0;
		
		// B가 C와 같거나 큰 경우, 영원히 이득을 볼 수 없다.
		if(B >= C) {
			result = -1;
		}else {
			long b = 0;
			long c = 0;
			while((A+b)>=c) {
				b+=B;
				c+=C;
				result++;
			}
		}
		
		System.out.println(result);
	}
}