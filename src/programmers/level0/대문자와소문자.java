package programmers.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 대문자와소문자 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120893
     * Level 0
     * 대문자와 소문자
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : CCCccc , 결과값 : " + solution("cccCCC"));
        System.out.println("기대값 : ABcDeFGHij , 결과값 : " + solution("abCdEfghIJ"));
    }

    public static String solution(String my_string) {
        return Arrays.stream(my_string.split("")).map(v -> Character.isLowerCase(v.charAt(0)) ? v.toUpperCase() : v.toLowerCase()).collect(Collectors.joining());
    }
}
