import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 숫자 입력
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		// 숫자 뒤집기
		int c = (a%10)*100 + ((a/10)%10)*10 + a/100;
		int d = (b%10)*100 + ((b/10)%10)*10 + b/100;
		
		// 큰 수 비교
		if(c>d) {
			System.out.println(c);
		}else {
			System.out.println(d);
		}
	}
}