import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 배열 미사용

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		int i = 0;
		int j = 0;
		
		for(int a=0; a<9; a++) {
			j++;
			int temp = Integer.parseInt(br.readLine());
			if(temp>max) {
				max = temp;
				i = j;
			}
		}

		System.out.println(max);
		System.out.println(i);
	}

}