import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken());
			Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			int a = 0;
			if(N%H == 0) {
				a = (H*100) + (N/H);
			}else {
				a = ((N%H)*100) + (N/H) + 1;
			}
			System.out.println(a);
		}
	}
}