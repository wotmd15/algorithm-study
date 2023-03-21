package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;

public class 숫자찾기 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120904
     * Level 0
     * 숫자 찾기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 3 , 결과값 : " + solution(29183,1));
        System.out.println("기대값 : 4 , 결과값 : " + solution(232443,4));
        System.out.println("기대값 : -1 , 결과값 : " + solution(123456,7));
    }

    public static int solution(int num, int k) {
        return String.valueOf("@"+num).indexOf(String.valueOf(k));
        /*
        //for문 풀이
        int answer = -1;
        String arr[] = String.valueOf(num).split("");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(String.valueOf(k))){
                answer = i+1;
                break;
            }
        }
        return answer;
        */
    }
}
