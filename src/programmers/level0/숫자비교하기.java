package programmers.level0;

public class 숫자비교하기 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120807
     * Level 0
     * 숫자 비교하기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : -1 , 결과값 : " + solution(2, 3));
        System.out.println("기대값 : 1 , 결과값 : " + solution(11, 11));
    }

    public static int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}
