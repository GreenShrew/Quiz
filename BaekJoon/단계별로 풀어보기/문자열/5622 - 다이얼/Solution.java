import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		int count = 0;
		
		for(int i=0; i<N.length(); i++) {
			char c = N.charAt(i);
			
			if(c=='A' || c=='B' || c=='C') {
				count += 3;
			}else if(c=='D' || c=='E' || c=='F') {
				count += 4;
			}else if(c=='G' || c=='H' || c=='I') {
				count += 5;
			}else if(c=='J' || c=='K' || c=='L') {
				count += 6;
			}else if(c=='M' || c=='N' || c=='O') {
				count += 7;
			}else if(c=='P' || c=='Q' || c=='R' || c=='S') {
				count += 8;
			}else if(c=='T' || c=='U' || c=='V') {
				count += 9;
			}else if(c=='W' || c=='X' || c=='Y' || c=='Z') {
				count += 10;
			}else{
				count += 11;
			}
		}
		
		System.out.println(count);
	}
}