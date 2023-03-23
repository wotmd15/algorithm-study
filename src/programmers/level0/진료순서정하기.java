package programmers.level0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class 진료순서정하기 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120835
     * Level 0
     * 진료 순서 정하기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : [3, 1, 2] , 결과값 : " + Arrays.toString(solution(new int[]{3, 76, 24})));
        System.out.println("기대값 : [7, 6, 5, 4, 3, 2, 1] , 결과값 : " + Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6, 7})));
        System.out.println("기대값 : [2, 4, 3, 5, 1] , 결과값 : " + Arrays.toString(solution(new int[]{30, 10, 23, 6, 100})));
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        Integer[] sortArr = Arrays.stream(emergency).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        for(int i = 0; i < sortArr.length; i++){
            for(int j = 0; j < emergency.length; j++){
                if(sortArr[i] == emergency[j]){
                    answer[j] = i+1;
                    break;
                }
            }
        }
        return answer;
    }
}
