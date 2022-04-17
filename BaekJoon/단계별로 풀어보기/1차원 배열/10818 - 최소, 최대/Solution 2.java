import java.io.*;
import java.util.*;

// 배열 미사용

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());	// 변수를 지정하여 초기화 하지만 쓰이지 않는다...
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int max = -1000000;
		int min = 1000000;
		
		while(st.hasMoreTokens()) {
			int temp = Integer.parseInt(st.nextToken());
			
			if(temp>max) {
				max = temp;
			}
			if(temp<min) {
				min = temp;
			}
		}
		System.out.println(min + " " + max);
	}

}
