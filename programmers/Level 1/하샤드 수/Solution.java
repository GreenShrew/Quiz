class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int y = x;
        int z = 0;
        while(y>0){
            z += y%10;
            y /= 10;
        }
        if(x%z != 0){
            answer = false;
        }
        return answer;
    }
}