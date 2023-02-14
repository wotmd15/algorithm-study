package programmers.level0;

public class 두수의곱 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120804
     * Level 0
     * 두 수의 곱
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 12 , 결과값 : " + solution(3, 4));
        System.out.println("기대값 : 513 , 결과값 : " + solution(27, 19));
    }

    public static int solution(int num1, int num2) {
        return num1*num2;
    }
}
