class Solution {
    public int solution(int order) {
        int answer = 0;
        for(String num : String.valueOf(order).split("")){
            if("3".equals(num) || "6".equals(num) || "9".equals(num)){
                answer++;
            }
        }
        return answer;
    }
}