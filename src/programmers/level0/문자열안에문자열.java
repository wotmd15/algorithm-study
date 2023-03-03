package programmers.level0;

import java.util.Arrays;

public class 문자열안에문자열 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120908
     * Level 0
     * 문자열안에 문자열
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 1 , 결과값 : " + solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
        System.out.println("기대값 : 2 , 결과값 : " + solution("ppprrrogrammers", "pppp"));
        System.out.println("기대값 : 2 , 결과값 : " + solution("AbcAbcA", "AAA"));

    }

    public static int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }

}
