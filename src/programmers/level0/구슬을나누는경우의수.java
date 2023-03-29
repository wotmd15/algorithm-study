package programmers.level0;

import java.math.BigInteger;
import java.util.Arrays;

public class 구슬을나누는경우의수 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120840
     * Level 0
     * 구슬을 나누는 경우의 수
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : [3] , 결과값 : " + solution(3,2));
        System.out.println("기대값 : [10] , 결과값 : " + solution(5,3));
    }

    public static int solution(int balls, int share) {
        return Integer.valueOf(factorial(balls).divide(factorial(balls-share).multiply(factorial(share))).toString());
    }

    public static BigInteger factorial(int num){
        BigInteger total = new BigInteger("1");
        for(int i = 1; i <= num; i++){
             total = total.multiply(new BigInteger(String.valueOf(i)));
        }
        return total;
    }

}
