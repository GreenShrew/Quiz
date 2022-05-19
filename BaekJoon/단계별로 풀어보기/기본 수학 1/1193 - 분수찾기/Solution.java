import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int a = 0;
		
		while(X-1>a){
			a++;
			X -= a;
		}
		
		if(a%2==0) {
			System.out.println((a-X+2) + "/" + X);
		}else {
			System.out.println(X + "/" + (a-X+2));
		}
		
		
		
	}
}