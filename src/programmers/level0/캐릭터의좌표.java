package programmers.level0;

import java.util.Arrays;

public class 캐릭터의좌표 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120861
     * Level 0
     * 캐릭터의 좌표
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : [2,1] , 결과값 : " + Arrays.toString(solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11,11})));
        System.out.println("기대값 : [0,-4] , 결과값 : " + Arrays.toString(solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7,9})));
    }

    public static int[] solution(String[] keyinput, int[] board) {
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
