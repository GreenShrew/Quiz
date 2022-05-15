import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		int result = 0;
		
		for(int i=0; i<N.length(); i++) {
			// c=, c-
			if(i<N.length()-1 && N.charAt(i)=='c' && (N.charAt(i+1)=='=' || N.charAt(i+1)=='-')) {
				i++;
			// d-, dz=
			}else if(i<N.length()-1 && N.charAt(i)=='d') {
				if(N.charAt(i+1)=='-') {
					i++;
				}else if(N.charAt(i+1)=='z' && i<N.length()-2) {
					if(N.charAt(i+2)=='=') {
						i+=2;
					}
				}
			// lj
			}else if(i<N.length()-1 && N.charAt(i)=='l' && N.charAt(i+1)=='j') {
				i++;
			// nj
			}else if(i<N.length()-1 && N.charAt(i)=='n' && N.charAt(i+1)=='j') {
				i++;
			// s=
			}else if(i<N.length()-1 && N.charAt(i)=='s' && N.charAt(i+1)=='=') {
				i++;
			// z=
			}else if(i<N.length()-1 && N.charAt(i)=='z' && N.charAt(i+1)=='=') {
				i++;
			}
			result++;
		}
		
		System.out.println(result);
	}
}