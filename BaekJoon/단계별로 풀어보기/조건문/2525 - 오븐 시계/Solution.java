import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
        sc.close();

        A += C/60;
        B += C%60;
        
        if(B > 59){
            A += 1;
            B -= 60;
        }
        if(A>23){
            A -= 24;
        }
        
        System.out.print(A +" " + B);
	}
}