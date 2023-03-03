package programmers.level0;

import java.util.Arrays;

public class 자릿수더하기 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120906
     * Level 0
     * 자릿수 더하기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 10 , 결과값 : " + solution(1234));
        System.out.println("기대값 : 16 , 결과값 : " + solution(930211));
    }

    public static int solution(int n) {
        int answer = 0;
        for(String str : String.valueOf(n).split("")){
            answer += Integer.valueOf(str);
        }
        //Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
        return answer;



    }
}
