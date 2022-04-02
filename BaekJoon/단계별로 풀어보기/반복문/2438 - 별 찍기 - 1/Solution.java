import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        br.close();
        
        for(int i=0; i<N; i++){
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}