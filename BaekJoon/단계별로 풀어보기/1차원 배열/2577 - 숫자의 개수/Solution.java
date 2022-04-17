import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 배열 사용

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int i = 0;
		int j = 0;
		
		for(int a : arr) {
			j++;
			if(a>max) {
				max = a;
				i = j;
			}
		}

		System.out.println(max);
		System.out.println(i);
	}

}