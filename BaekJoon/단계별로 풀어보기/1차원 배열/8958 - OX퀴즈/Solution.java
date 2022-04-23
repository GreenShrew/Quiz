import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫번째 줄 테스트 케이스의 갯수
		int N = Integer.parseInt(br.readLine());
		
		// 두번째~N+1 번쨰 줄
		String arr[] = new String[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}
		
		// 테스트 케이스만큼 반복
		for(int i=0; i<N; i++) {
			int total = 0;
			int cnt = 0;
			
			// 입력된 테스트 케이스의 문자열 길이만큼 반복
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j)=='O') {
					cnt++;
				}else {
					cnt = 0;
				}
				total += cnt;
			}
			System.out.println(total);
		}
	}
}