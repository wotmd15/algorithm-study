class Solution {
    public int solution(int n) {
        int sum = 1;
        int i = 0;
        while(sum <= n){
            i++;
            sum = sum * i;
        }
        return i-1;
    }
}