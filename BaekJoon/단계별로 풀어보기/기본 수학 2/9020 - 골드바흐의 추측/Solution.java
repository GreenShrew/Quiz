import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// '에라토스테네스의 체', 입력되는 n의 범위는 123,456 까지이며, 그 2배인 246912 까지의 소수를 판별해야한다.
		boolean[] p = new boolean[246913];
		
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
		
		int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            int n = Integer.parseInt(br.readLine());
            int a = n/2;
            int b = n/2;

            while(true){
                if(p[a]==false && p[b]==false){
                    System.out.println(a + " " + b);
                    break;
                }
                a--;
                b++;
            }
        }
	}
}