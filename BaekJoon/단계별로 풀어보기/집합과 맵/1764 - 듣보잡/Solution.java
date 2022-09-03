import java.util.*;
public class back1764 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        HashSet <String> set=new HashSet<>();
        ArrayList<String> array=new ArrayList<>();
        scanner.nextLine();
        for(int i=0;i<num1;i++){
            String temp=scanner.nextLine();
            set.add(temp);
        }
        for(int i=0;i<num2;i++){
            String temp=scanner.nextLine();
            if(set.contains(temp)){
                array.add(temp);
            }
        }
        Collections.sort(array);
        System.out.println(array.size());
        for(String str:array){
            System.out.println(str);
        }
    }
}
출처: https://binsblog.tistory.com/entry/백준-1764-듣보잡-Java [빈v:티스토리]