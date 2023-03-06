package programmers.level0;

import java.util.Arrays;

public class 문자열정렬하기1 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120850
     * Level 0
     * 문자열 정렬하기 (1)
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : [1, 2, 2, 3, 9] , 결과값 : " + Arrays.toString(solution("hi12392")));
        System.out.println("기대값 : [2, 2, 4, 8] , 결과값 : " + Arrays.toString(solution("p2o4i8gj2")));
        System.out.println("기대값 : [0] , 결과값 : " + Arrays.toString(solution("abcde0")));
    }

    public static int[] solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[^0-9]","").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}
