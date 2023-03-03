package programmers.level0;

public class 제곱수판별하기 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120909
     * Level 0
     * 제곱수 판별하기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 1 , 결과값 : " + solution(144));
        System.out.println("기대값 : 2 , 결과값 : " + solution(976));
    }

    public static int solution(int n) {
        return Math.sqrt(n)%1 == 0 ? 1 : 2;
    }
}
