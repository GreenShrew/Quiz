import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		int[] arr = new int[26];
		
		int result = 0;
		
		for(int i=0; i<N.length(); i++) {
			result = N.charAt(i) - 'a';
			if(result<0) {
				result+=32;
				arr[result]++;
			}else {
				arr[result]++;
			}
		}
		
		int max = 0;
		char maxc = '?';
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				maxc = (char)(i+65);
			}else if(arr[i]==max){
				maxc = '?';
			}
		}
		
		System.out.println(maxc);
	}
}