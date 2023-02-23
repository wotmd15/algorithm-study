package programmers.level0;

public class 나머지구하기 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120810
     * Level 0
     * 나머지 구하기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 1, 결과값 : " + solution(3,2));
        System.out.println("기대값 : 0, 결과값 : " + solution(10,5));
    }

    public static  int solution(int num1, int num2) {
        return num1 % num2;
    }
}
