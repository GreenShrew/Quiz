import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int[] input=new int[6];
		int maxR=0,maxC=0;
		int indexR=0,indexC=0;

		for (int i = 0; i < 6; i++) {
			st=new StringTokenizer(br.readLine());
			int dir=Integer.parseInt(st.nextToken());
			int distance=Integer.parseInt(st.nextToken());
			if(dir==3 || dir==4) {
				maxR=maxR<distance?distance:maxR;
				if (maxR==distance) indexR=i;
			}else {
				maxC=maxC<distance?distance:maxC;
				if (maxC==distance) indexC=i;
			}
			input[i]=distance;
			
		}
		int nextR1=input[5],nextC1=input[5];
		int nextR2=input[0],nextC2=input[0];
		if (indexC-1>-1) nextR1=input[indexC-1];
		if (indexC+1<6) nextR2=input[indexC+1];
		if (indexR-1>-1) nextC1=input[indexR-1];
		if (indexR+1<6) nextC2=input[indexR+1];
		
		System.out.println(area*N);

	}
}