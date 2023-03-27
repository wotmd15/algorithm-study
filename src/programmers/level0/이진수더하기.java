package programmers.level0;

public class 이진수더하기 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120885
     * Level 0
     * 이진수 더하기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 101 , 결과값 : " + solution("10","11"));
        System.out.println("기대값 : 11000 , 결과값 : " + solution("1001","1111"));
    }

    public static String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1,2) + Integer.parseInt(bin2,2));
    }

}
