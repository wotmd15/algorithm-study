class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i == 0 && j == 0) answer = numbers[0] * numbers[1];
                if(i != j){
                    answer = numbers[i] * numbers[j] >= answer ? numbers[i] * numbers[j] : answer;    
                } 
            }
        }
        return answer;
    }
}