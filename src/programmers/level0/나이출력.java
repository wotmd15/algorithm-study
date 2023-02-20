package programmers.level0;

public class 나이출력 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120820
     * Level 0
     * 나이 출력
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 1983 , 결과값 : " + solution(40));
        System.out.println("기대값 : 2000 , 결과값 : " + solution(23));
    }

    public static int solution(int age){
        return (2022-age)+1;
    }
}
