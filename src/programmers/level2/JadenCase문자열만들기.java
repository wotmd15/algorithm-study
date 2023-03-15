package programmers.level2;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class JadenCase문자열만들기 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/12951
     * Level 2
     * JadenCase 문자열 만들기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 3people Unfollowed Me , 결과값 : " + solution("3people unFollowed me"));
        System.out.println("기대값 : For The Last Week , 결과값 : " + solution("for the last  week"));
        System.out.println("기대값 : Abcc   , 결과값 : " + solution("Abcc  "));
    }

    public static String solution(String s) {
        return Arrays.stream((s+="*").toLowerCase().split(" ")).map(v -> !"".equals(v) ? v.substring(0,1).toUpperCase() + (v.length() > 1 ? v.substring(1) : "") : "").collect(Collectors.joining(" ")).replaceAll("\\*","");
    }
}
