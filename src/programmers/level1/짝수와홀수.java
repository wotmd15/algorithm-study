package programmers.level1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 짝수와홀수 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/12937
     * Level 1
     * 짝수와 홀수
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : Odd, 결과값 : " + solution(3));
        System.out.println("기대값 : Even, 결과값 : " + solution(4));
    }

    public static String solution(int num) {
        return num%2 == 0 ? "Even" : "Odd";
    }
}
