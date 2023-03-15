package programmers.level2;

import java.util.Arrays;

public class 최댓값과최솟값 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/12939
     * Level 2
     * 최댓값과 최솟값
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 1 4 , 결과값 : " + solution("1 2 3 4"));
        System.out.println("기대값 : -4 -1 , 결과값 : " + solution("-1 -2 -3 -4"));
        System.out.println("기대값 : -1 -1 , 결과값 : " + solution("-1 -1"));
    }

    public static String solution(String s) {
        int[] convertArr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        return convertArr[0] + " " + convertArr[convertArr.length-1];
    }
}
