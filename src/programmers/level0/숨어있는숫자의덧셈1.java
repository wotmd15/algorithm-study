package programmers.level0;

import java.util.Arrays;

public class 숨어있는숫자의덧셈1 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120851
     * Level 0
     * 숨어있는 숫자의 덧셈 (1)
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 10 , 결과값 : " + solution("aAb1B2cC34oOp"));
        System.out.println("기대값 : 16 , 결과값 : " + solution("1a2b3c4d123"));
    }

    public static int solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[^0-9]","").split("")).mapToInt(Integer::parseInt).sum();
    }
}
