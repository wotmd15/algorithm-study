class Solution {
    public int[] solution(int[] numbers, String direction) {
          int tempNum = "right".equals(direction) ? numbers[numbers.length-1] : numbers[0];
        if(direction.equals("right")){
            for(int i = numbers.length-1; i > 0; i--){
                numbers[i] = numbers[i-1];
            }
            numbers[0] = tempNum;
        } else {
            for(int i = 0; i < numbers.length-1; i++){
                numbers[i] = numbers[i+1];
            }
            numbers[numbers.length-1] = tempNum;
        }
        return numbers;
    }
}