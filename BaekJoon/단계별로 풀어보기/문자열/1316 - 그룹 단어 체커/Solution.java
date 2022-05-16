import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 그룹 단어의 갯수
		int N = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		for(int i=0; i<N; i++) {
			// 그룹 단어와 판별용 배열, 그룹단어 판별용 boolean 생성
			String str = br.readLine();
			boolean[] bool = new boolean[26];
			boolean result = true;
			
			for(int j=0; j<str.length(); j++) {
				int a = str.charAt(j) - 'a';
				
				// 다음 단어가 다르다면 true로 변환
				if(bool[a]!=true && j<str.length()-1) {
					if(str.charAt(j)!=str.charAt(j+1)) {
						bool[a]=true;
					}
				// 만약 이전에 true로 바뀐 상태라면 그룹단어가 아니다!
				}else if(bool[a]) {
					result = false;
					break;
				}
			}
			
			// result가 true면 그룹단어!
			if(result) {
				count++;
			}
		}
		
		// 결과 출력
		System.out.println(count);
	}
}