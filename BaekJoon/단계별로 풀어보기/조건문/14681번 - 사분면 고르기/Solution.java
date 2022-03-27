import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
        sc.close();

        if(A>0){
            if(B>0){
                System.out.print("1");  
            }else{
                System.out.print("4");
            }
        }else {
            if(B>0){
                System.out.print("2");  
            }else{
                System.out.print("3");
            }
        }
	}
}