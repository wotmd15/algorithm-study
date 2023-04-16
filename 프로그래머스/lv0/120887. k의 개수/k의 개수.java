import java.util.Arrays;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int num = i; num <= j; num++){
            answer += Arrays.stream(String.valueOf(num).split("")).filter(v -> v.equals(String.valueOf(k))).count();
        }       
        return answer;
    }
}