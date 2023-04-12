class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        for(String key : keyinput){
            if("left".equals(key)){
                answer[0] = (-(board[0]/2) <= answer[0] - 1) ? answer[0] - 1 : answer[0];
            } 
            else if("right".equals(key)){
                answer[0] = (board[0]/2 >= answer[0] + 1) ? answer[0] + 1 : answer[0];
            }
            else if("down".equals(key)){
                answer[1] = (-(board[1]/2) <= answer[1] - 1) ? answer[1] - 1 : answer[1];
            }
            else if("up".equals(key)){
                answer[1] = (board[1]/2 >= answer[1] + 1) ? answer[1] + 1 : answer[1];
            }
        }
        return answer;
    }
}