package programmers.level0;

public class 피자나눠먹기2 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120815
     * Level 0
     * 피자 나눠 먹기 (2)
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 1 , 결과값 : " + solution(6));
        System.out.println("기대값 : 5 , 결과값 : " + solution(10));
        System.out.println("기대값 : 2 , 결과값 : " + solution(4));
    }

    public static int solution(int n) {
        int answer = 1;
        while(!((6*answer)%n == 0)){
            answer++;
        }
        return answer;
    }
}
