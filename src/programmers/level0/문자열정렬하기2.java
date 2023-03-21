package programmers.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 문자열정렬하기2 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120911
     * Level 0
     * 문자열 정렬하기 (2)
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : abcd , 결과값 : " + solution("Bcad"));
        System.out.println("기대값 : ehllo , 결과값 : " + solution("heLLo"));
        System.out.println("기대값 : hnopty , 결과값 : " + solution("Python"));
        System.out.println("기대값 : abcd , 결과값 : " + solution("Bcad"));
    }

    public static String solution(String my_string) {
        return Arrays.stream(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());
    }


}
