class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            answer += isCompositeNumber(i) ? 1 : 0;
        }
        return answer;
    }
    
    public boolean isCompositeNumber(int num){
        int result = 0;
        for(int i = 1; i <= num; i++){
            result += num%i == 0 ? 1 : 0; 
        }
        return result >= 3 ? true : false;
    }
}