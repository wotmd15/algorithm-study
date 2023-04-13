class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int mod = 2;
        int max = a > b ? a : b;
        while(mod <= max){
            if(a % mod == 0 && b % mod == 0){
                a /= mod;
                b /= mod;
                continue;
            } else {
                mod ++;
            }
        };
        
        int compare = 2;
        while(compare <= b){
            if(b % compare == 0){
                if(compare == 2 || compare == 5){
                    b = b/compare;
                    compare = 2;    
                } else {
                    answer = 2;
                    break;
                }
            } else {
                compare ++;
            }
        }

        return answer;
    }
}