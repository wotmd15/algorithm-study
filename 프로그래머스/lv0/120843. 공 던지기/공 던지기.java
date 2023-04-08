class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int cnt = 0;
        int idx = 0;
        while(cnt < k){
            answer = numbers[idx];
            if(idx + 2 > numbers.length -1){
                idx = idx + 2 == numbers.length ? 0 : 1; 
            } else {
                idx += 2;
            }
            cnt++;
        }
        return answer;
    }
}