import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 테스트 케이스 갯수
		int C = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] arr; 
		
		// 테스트 케이스 반복
		for(int i=0; i<C; i++) {
			st = new StringTokenizer(br.readLine()," ");	// 케이스 분리
			
			int N = Integer.parseInt(st.nextToken());	// 학생 수
			arr = new int[N];
			double total = 0;		// 성적합계
			
			// 성적 입력
			for(int j=0; j<N; j++) {
				int score = Integer.parseInt(st.nextToken());
				arr[j] = score;
				total += score;
			}
			
			double mean = (total/N);	// 성적 평균
			
			double student = 0;	// 평균이 넘는 학생의 수
			
			// 평균이 넘는 학생 수 카운트
			for(int k=0; k<N; k++) {
				if(arr[k]>mean) {
					student++;
				}
			}

			// 평균이 넘는 학생 비율 출력
			System.out.printf("%.3f%%\n", (student/N)*100);
		}
	}
}