package programmers.level0;

public class 공던지기 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120843
     * Level 0
     * 공 던지기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : [3] , 결과값 : " + solution(new int[]{1, 2, 3, 4},2));
        System.out.println("기대값 : [3] , 결과값 : " + solution(new int[]{1, 2, 3, 4, 5, 6},5));
        System.out.println("기대값 : [2] , 결과값 : " + solution(new int[]{1, 2, 3},3));
        System.out.println("기대값 : [2] , 결과값 : " + solution(new int[]{1, 2, 3, 4, 5, 6, 7},5));
        System.out.println("기대값 : [1] , 결과값 : " + solution(new int[]{1, 2, 3},4));
    }

    public static int solution(int[] numbers, int k) {
        int answer = 0;
        int cnt = 0;
        int idx = 0;

        while(cnt < k){
            System.out.println("cnt => " + cnt +"/ k => " + k );
            answer = numbers[idx];
            if(idx + 2 > numbers.length -1){
                idx = idx + 2 == numbers.length ? 0 : 1; //배열의 개수가 짝수면 0번 인덱스로 리턴
            } else {
                idx += 2;
            }
            cnt++;
        }

        // 반복문을 이용하지 않은 풀이
        //answer = numbers[((1 + ((k-1)*2))%numbers.length) - 1];
        return answer;
    }
}
