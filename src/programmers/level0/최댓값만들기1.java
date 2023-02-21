package programmers.level0;

import java.util.Arrays;

public class 최댓값만들기1 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120847
     * Level 0
     * 최댓값 만들기(1)
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 20 , 결과값 : " + solution(new int[]{1, 2, 3, 4, 5}));
        System.out.println("기대값 : 744 , 결과값 : " + solution(new int[]{0, 31, 24, 10, 1, 9}));
    }

    public static int solution(int[] numbers) {
        int sortArray[] = Arrays.stream(numbers).sorted().toArray();
        return sortArray[numbers.length-1]*sortArray[numbers.length-2];
    }
}
