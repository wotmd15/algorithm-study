package programmers.level0;

import java.util.Arrays;
import java.util.Collections;

public class 배열뒤집기 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120821
     * Level 0
     * 배열 뒤집기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : [5, 4, 3, 2, 1] , 결과값 : " + Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println("기대값 : [2, 1, 1, 1, 1, 1] , 결과값 : " + Arrays.toString(solution(new int[]{1, 1, 1, 1, 1, 2})));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i =0; i < num_list.length; i++){
            answer[i] = num_list[num_list.length -(i+1)];
        }
        return answer;
    }

}
