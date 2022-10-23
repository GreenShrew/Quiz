import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main24416 {

   static int A, B;
   static int[] memo;

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      memo = new int[N + 1];
      fibonacci(N);
      fibonacci_dp(N);
      System.out.printf("%d %d", A, B);
   }

   private static int fibonacci_dp(int n) {
      memo[1] = memo[2] = 1;
      for (int i = 3; i <= n; i++) {
         B++;
         memo[i] = memo[i - 1] + memo[i - 2];
      }
      return memo[n];
   }

   private static int fibonacci(int n) {
      if (n == 1 || n == 2) {
         A++;
         return 1;
      }
      return fibonacci(n - 1) + fibonacci(n - 2);
   }

}