package programmers.level0;

public class 두수의나눗셈 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120806
     * Level 0
     * 두 수의 나눗셈
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 1500 , 결과값 : " + solution(3, 2));
        System.out.println("기대값 : 2333 , 결과값 : " + solution(7, 3));
        System.out.println("기대값 : 62 , 결과값 : " + solution(1, 16));

    }

    public static int solution(int num1, int num2) {
        return (int)((double)num1/num2*1000);
    }

}

