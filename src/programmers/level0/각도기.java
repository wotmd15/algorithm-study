package programmers.level0;

import java.util.Arrays;

public class 각도기 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120829
     * Level 0
     * 각도기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 1 , 결과값 : " + solution(70));
        System.out.println("기대값 : 3 , 결과값 : " + solution(91));
        System.out.println("기대값 : 4 , 결과값 : " + solution(180));
    }

    public static int solution(int angle) {
        int answer = 0;
        if(angle < 90){
            answer = 1;
        } else if(angle == 90){
            answer = 2;
        } else if(angle < 180){
            answer = 3;
        } else if(angle == 180){
            answer = 4;
        }
        return answer;
    }
}
