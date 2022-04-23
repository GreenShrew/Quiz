import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫번째 줄 시험 본 과목 갯수 N 길이의 배열 생성
		double arr[] = new double[Integer.parseInt(br.readLine())];
		
		// 두번째 줄 시험 성적들 띄어쓰기 기준으로 분리 후 토큰에 저장
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// arr 배열에 저장된 토큰들 넣기
		for(int i=0; i<arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		// 배열을 오름차순 정렬, 마지막 값이 가장 큰 점수이다.
		Arrays.sort(arr);
		
		double total = 0;
		for(int i=0; i<arr.length; i++) {
			total += (arr[i]/arr[arr.length-1]*100);
		}
		double avg = total/arr.length;
		
		System.out.println(avg);
	}
}