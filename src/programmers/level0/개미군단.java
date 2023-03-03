package programmers.level0;

import java.util.Arrays;

public class 개미군단 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120837
     * Level 0
     * 개미 군단
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 5 , 결과값 : " + solution(23));
        System.out.println("기대값 : 6 , 결과값 : " + solution(24));
        System.out.println("기대값 : 201 , 결과값 : " + solution(999));
    }

    public static int solution(int hp) {
        return hp/5 + (hp%5)/3 + (hp%5)%3;
    }
}
