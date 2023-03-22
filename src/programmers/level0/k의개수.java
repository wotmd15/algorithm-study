package programmers.level0;

import java.util.Arrays;

public class k의개수 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120887
     * Level 0
     * k의 개수
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 6 , 결과값 : " + solution(1,13,1));
        System.out.println("기대값 : 5 , 결과값 : " + solution(10,50,5));
        System.out.println("기대값 : 0 , 결과값 : " + solution(3,10,2));
    }

    public static int solution(int i, int j, int k) {
        int answer = 0;
        for(int num = i; num <= j; num++){
            answer += Arrays.stream(String.valueOf(num).split("")).filter(v -> v.equals(String.valueOf(k))).count();
        };
        return answer;
    }
}
