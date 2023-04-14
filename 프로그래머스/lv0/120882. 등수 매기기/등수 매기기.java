import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        ArrayList<Double> averageArr = new ArrayList<>();  
        for(int i = 0; i < score.length; i++){
            averageArr.add(((double)(score[i][0] + score[i][1])/2));            
        }

        double avgArr[] = averageArr.stream().sorted(Collections.reverseOrder()).mapToDouble(Double::doubleValue).toArray();
        for(int i = 0; i < averageArr.size(); i++){
            for(int j = 0; j <avgArr.length; j++){
                if(averageArr.get(i) == avgArr[j]){
                    answer[i] = j+1;
                    break;
                }
            }
        }
        return answer;
    }
}