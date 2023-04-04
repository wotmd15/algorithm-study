class Solution {
    public double solution(int[] numbers) {
        int total = 0;
        for(int num : numbers){
            total += num;
        }
        return (double)total/numbers.length;
    }
}