package programmers.level0;

public class 두수의합 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120802
     * Level 0
     * 두수의 합
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 5 , 결과값 : " + solution(2, 3));
        System.out.println("기대값 : 102 , 결과값 : " + solution(100, 2));
    }

    public static int solution(int num1, int num2) {
        return num1 + num2;
    }
}
