import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int X = N;
        int i = 0;
        
        do{
        	N = (((N%10)*10) + ((N/10)+(N%10))%10);
        	i++;
        }while(N!=X);
        System.out.println(i);
    }
}