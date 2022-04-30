public class Main {
	public static void main(String[] args) {
		boolean arr[] = new boolean[10001];
		
		for(int i=1; i<=10000; i++) {
			int n = fun1(i);
			
			// 생성자가 있는 숫자를 true로 변경
			if(n<=10000) {
				arr[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int j=1; j<=10000;j++) {
			// arr에 false인 index를 sb에 추가.
			if(!arr[j]) {
				sb.append(j).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	
	// 매개변수로 전달된 값을 생성자로 가지는 숫자를 찾아내기.
	// 예를들어, 39는 39 + 3 +9 =51 이므로, 39는 51의 생성자이다.
	public static int fun1(int i) {
		int N = i;
		
		while(i != 0) {
			N = N + (i%10);
			i = i/10;
		}
		
		return N;
	}
}