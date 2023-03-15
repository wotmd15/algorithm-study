package programmers.level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 최솟값만들기 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/12941
     * Level 2
     * 최솟값 만들기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 29   , 결과값 : " + solution(new int[]{1, 4, 2}, new int[]{5,4,4}));
        System.out.println("기대값 : 10   , 결과값 : " + solution(new int[]{1,2}, new int[]{3,4}));
    }

    public static int solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < A.length; i++){
            answer += A[i] * B[(B.length-1)-i];
        }
        return answer;
    }
}
