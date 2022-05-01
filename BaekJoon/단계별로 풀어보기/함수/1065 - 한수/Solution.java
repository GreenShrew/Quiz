import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = func(N);
		
		System.out.println(count);
	}

	
	private static int func(int i) {
		int count = 0;
		
		// 1부터 99는 당연하게도 등차수열이다.
		if(i<100) {
			count = i;
			
		}else {
			count = 99;
			
			for(int j = 100; j<=i; j++) {
				// 1, 10, 100 의 자리 숫자 추출
				int a = j%10;
				int b = (j/10)%10;
				int c = j/100;
				
				if((c-b) == (b-a)) {
					count++;
				}
			}
		}
		
		return count;
	}
}