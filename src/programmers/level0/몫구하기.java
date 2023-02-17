package programmers.level0;

public class 몫구하기 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120805
     * Level 0
     * 몫 구하기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 2 , 결과값 : " + solution(10, 5));
        System.out.println("기대값 : 3 , 결과값 : " + solution(7, 2));
    }

    public static int solution(int num1, int num2) {
        return num1/num2;
    }
}
