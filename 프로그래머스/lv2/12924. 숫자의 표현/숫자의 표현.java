class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        while(i <= n){
            int sum = 0;
            for(int j = i; j <= n; j++){
                sum += j;
                if(sum == n){
                    answer ++;
                } else if(sum > n){
                    break;
                }
            }
            i++;
        }
        return answer;
    }
}