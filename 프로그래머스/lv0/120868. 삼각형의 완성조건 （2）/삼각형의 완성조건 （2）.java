import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int min = sides[0];
        int max = sides[1];
        //max가 최고 클경우 
        for(int i = 1; i <= max; i++){ //주어진 배열 중 가장 긴 변이 있을 경우
           answer += (max < min+i) && i <= max ? 1 : 0;
        }
        for(int i = max+1; i < min+max; i++){ //주어진 배열 중 가장 긴 변이 없을 경우
            answer++;
        }
        return answer;
    }
}