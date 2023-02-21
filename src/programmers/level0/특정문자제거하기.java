package programmers.level0;

public class 특정문자제거하기 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120826
     * Level 0
     * 특정 문자 제거하기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : abcde , 결과값 : " + solution("abcdef", "f"));
        System.out.println("기대값 : Cdbe , 결과값 : " + solution("BCBdbe", "B"));
    }

    public static String solution(String my_string, String letter) {
        return my_string.replaceAll(letter,"");
    }
}
