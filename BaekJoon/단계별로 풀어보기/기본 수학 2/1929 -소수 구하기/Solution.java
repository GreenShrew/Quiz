import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		// '에라토스테네스의 체'
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
		
		for(int i=M; i<=N; i++) {
			if(p[i]==false) {
				System.out.println(i);
			}
		}
	}
}