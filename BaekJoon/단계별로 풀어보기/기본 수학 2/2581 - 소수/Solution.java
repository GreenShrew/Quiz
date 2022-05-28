import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		// '에라토스테네스의 체'를 이용한 입력한 N 까지의 소수를 판별하기 (소수일 경우 배열값은 true)
		boolean[] p = new boolean[N+1];
		
		p[0] = true;
		p[1] = true;
		
		for(int i=2; i<=Math.sqrt(p.length); i++) {
			if(p[i]) {
				continue;
			}
			for(int j=i*i; j<p.length; j+=i) {
				p[j] = true;
			}
		}
		
		// 소수의 합, 최소값 계산
		int total = 0;
		int first = 0;
		
		for(int i=M; i<=N; i++) {
			if(p[i] == false) {
				total += i;
				if(first == 0) {
					first = i;
				}
			}
		}
		
		if(total == 0) {
			System.out.print(-1);
		}
		else {
			System.out.print(total + "\n" + first);
		}
	}
}