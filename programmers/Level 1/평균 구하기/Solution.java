class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double a = 0;
        int x = 0;
        for(int i : arr){
            a+=i;
            x++;
        }
        return answer = a/x;
    }
}