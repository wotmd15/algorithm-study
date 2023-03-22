package programmers.level0;

public class 팩토리얼 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120848
     * Level 0
     * 팩토리얼
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 10 , 결과값 : " + solution(3628800));
        System.out.println("기대값 : 3 , 결과값 : " + solution(7));
    }

    public static int solution(int n) {
        int sum = 1;
        int i = 0;
        while(sum <= n){
            i++;
            sum = sum * i;
        }
        return i-1;
    }

}
