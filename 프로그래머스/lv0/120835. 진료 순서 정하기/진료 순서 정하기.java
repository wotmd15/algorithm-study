import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] sortArr = Arrays.stream(emergency).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        
        for(int i = 0; i < sortArr.length; i++){
            for(int j = 0; j < emergency.length; j++){
                if(sortArr[i] == emergency[j]){
                    answer[j] = i+1;
                    break;
                }
            }
        }
        return answer;
    }
}