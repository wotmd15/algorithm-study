package programmers.level0;

import java.util.Arrays;

public class 게임369 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120891
     * Level 0
     * 369게임
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 1 , 결과값 : " + solution(3));
        System.out.println("기대값 : 2 , 결과값 : " + solution(29423));
    }

    public static int solution(int order) {
        int answer = 0;

        for(String num : String.valueOf(order).split("")){
            if("3".equals(num) || "6".equals(num) || "9".equals(num)){
                answer++;
            }
        }
        return answer;

        //Stream 이용한 풀이
        //return (int) Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(i -> i == 3 || i == 6 || i == 9).count();

    }

}
