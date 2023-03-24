package programmers.level0;

import java.util.Arrays;

public class 숨어있는숫자의덧셈2 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120864
     * Level 0
     * 숨어있는 숫자의 덧셈 (2)
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 37 , 결과값 : " + solution("aAb1B2cC34oOp"));
        System.out.println("기대값 : 133 , 결과값 : " + solution("1a2b3c4d123Z"));
    }

    public static int solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[^0-9]",",").split(","))
                .filter(v -> !"".equals(v))
                .mapToInt(Integer::parseInt).
                sum();
    }

}
