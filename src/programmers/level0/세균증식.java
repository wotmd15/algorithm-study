package programmers.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 세균증식 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120910
     * Level 0
     * 세균 증식
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 2048 , 결과값 : " + solution(2,10));
        System.out.println("기대값 : 229,376 , 결과값 : " + solution(7,15));
    }

    public static int solution(int n, int t) {
        for(int i = 1; i <= t ; i++){
            n *= 2;
        }
        return n;

    }
}
