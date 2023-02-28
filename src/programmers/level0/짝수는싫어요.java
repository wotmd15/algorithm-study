package programmers.level0;

public class 짝수는싫어요 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120813
     * Level 0
     * 짝수는 싫어요
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : [1, 3, 5, 7, 9] , 결과값 : " + solution(10));
        System.out.println("기대값 : [1, 3, 5, 7, 9, 11, 13, 15] , 결과값 : " + solution(15));
    }

    public static int[] solution(int n) {
        int[] answer = new int[n%2 == 0 ? n/2 : n/2+1];
        for(int i = 1; i <= n; i++){
            if(i%2 != 0){
                answer[i/2] = i;
            }
        }
        return answer;
        /*
         * 다른사람 풀이
         * return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
         * */

    }


}
