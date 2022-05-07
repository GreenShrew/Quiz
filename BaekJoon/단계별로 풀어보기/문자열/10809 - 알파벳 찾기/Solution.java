import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 값이 모두 -1인 26자리 배열 생성(a~z는 26개)
		int[] a = new int[26];
		for(int i=0; i<a.length; i++) {
			a[i] = -1;
		}
		
		String S = br.readLine();
		
		// 입력된 예제를 하나씩 뜯고, 'a'로 뺄셈하여 숫자로 변환, 그 자리의 값이 -1일시 j값 입력
		for(int j=0; j<S.length(); j++) {
			char c = S.charAt(j);
			if(a[c-'a']==-1) {
				a[c-'a']=j;
			}
		}
		
		// 배열 출력
		for(int k : a) {
			System.out.print(k+" ");
		}
	}
}