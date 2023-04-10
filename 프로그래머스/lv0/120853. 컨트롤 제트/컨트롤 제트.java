class Solution {
    public int solution(String s) {
        int answer = 0;
        int before = 0;
        for(String str : s.split(" ")){
            if("Z".equals(str)){
                answer -= before;
            } else {
                before = Integer.parseInt(str);
                answer += before;
            }
        }
        return answer;
    }
}