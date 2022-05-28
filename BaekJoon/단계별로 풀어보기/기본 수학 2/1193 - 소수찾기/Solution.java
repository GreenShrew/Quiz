import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int count = 0;
		
		
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			boolean b = true;
			
			if(num == 1) {
				continue;
			}
			
			for(int j=2; j<(num/2)+1; j++) {
				if(num%j == 0) {
					b = false;
					break;
				}
			}
			
			if(b) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}