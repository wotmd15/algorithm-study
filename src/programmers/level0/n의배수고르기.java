package programmers.level0;

import java.util.Arrays;

public class n의배수고르기 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120905
     * Level 0
     * n의 배수 고르기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : [6, 9, 12] , 결과값 : " + solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}));
        System.out.println("기대값 : [10, 5] , 결과값 : " + solution(5, new int[]{1, 9, 3, 10, 13, 5}));
        System.out.println("기대값 : [120, 600, 12, 12] , 결과값 : " + solution(12, new int[]{2, 100, 120, 600, 12, 12}));
    }

    public static int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(value -> value % n == 0).toArray();
    }
}
