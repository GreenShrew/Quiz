import java.io.*;
import java.util.*;
// BufferedReader
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[10];
		boolean bool;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			arr[i] = Integer.parseInt(br.readLine())%42;
		}
		
		for(int i=0; i<10; i++) {
			bool = false;
			for(int j=i+1; j<10; j++) {
				if(arr[i]==arr[j]) {
					bool = true;
					break;
				}
			}
			if(bool==false) {
				result++;
			}
		}
		System.out.println(result);
	}
}