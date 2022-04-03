import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String temp;
        
        while((temp=br.readLine())!=null){
            st = new StringTokenizer(temp, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append((A+B)).append('\n');
        }
        System.out.println(sb);
    }
}