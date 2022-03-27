import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
        sc.close();
        
        int m = A;
        
        if(A==B && A==C){
            System.out.print(10000+A*1000);
        }else if(A==B || A==C){
            System.out.print(1000+A*100);
        }else if(B==C){
            System.out.print(1000+B*100);
        }else{
            if(m<B){
                m = B;
            }
            if(m<C){
                m = C;
            }
            System.out.print(m*100);
        }
	}
}