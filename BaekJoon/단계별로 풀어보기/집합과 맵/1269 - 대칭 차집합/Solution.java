import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        Map<Integer,Integer> A = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> A_List = new ArrayList<>();
        List<Integer> B_List = new ArrayList<>();
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            A.put(num,0);
            A_List.add(num);
        }
        Map<Integer, Integer> B = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            B.put(num,0);
            B_List.add(num);
        }
        for (int num : A_List) {
            if (B.containsKey(num)) B.remove(num);
        }
        for (int num : B_List) {
            if (A.containsKey(num)) A.remove(num);
        }
        System.out.print(A.size() + B.size());
    }
}