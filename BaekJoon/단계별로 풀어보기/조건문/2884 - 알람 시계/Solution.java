import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
        sc.close();

        if(M<45){
            M += 15;
            H--;
            if(H<0){
                H = 23;
            }
        }else {
            M -= 45;
        }
        System.out.print(H +" " + M);
	}
}