import java.io.*;
import java.util.*;

// 배열 사용

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int i = 0;
		int[] arr = new int[N];
		
		while(st.hasMoreTokens()) {
			arr[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0] + " "  + arr[N-1]);
	}

}
