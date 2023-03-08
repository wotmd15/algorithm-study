package programmers.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 인덱스바꾸기 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120895
     * Level 0
     * 인덱스 바꾸기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : hlelo , 결과값 : " + solution("hello",1,2));
        System.out.println("기대값 : i l veoyou , 결과값 : " + solution("I love you",3,6));
    }


    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] arr = my_string.split("");
        String str = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = str;
        return Arrays.stream(arr).collect(Collectors.joining());
    }
}
