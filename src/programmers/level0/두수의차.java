package programmers.level0;

public class 두수의차 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120803
     * Level 0
     * 두 수의 차
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : -1 , 결과값 : " + solution(2, 3));
        System.out.println("기대값 : 98 , 결과값 : " + solution(100, 2));
    }

    public static int solution(int num1, int num2) {
        return num1-num2;
    }
}
