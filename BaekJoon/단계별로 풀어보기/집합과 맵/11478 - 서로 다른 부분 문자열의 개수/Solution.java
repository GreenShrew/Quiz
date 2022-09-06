import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        HashSet<String> list = new HashSet<>();

        for (int i = 0; i <= s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (!list.contains(s.substring(i, j))) {
                    list.add(s.substring(i, j));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(list.size()+"\n");
        System.out.println(sb);

    }
}