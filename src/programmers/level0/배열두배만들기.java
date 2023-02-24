package programmers.level0;

import java.util.Arrays;

public class 배열두배만들기 {


    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120809
     * Level 0
     * 배열 두 배 만들기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : [2, 4, 6, 8, 10] , 결과값 : " + Arrays.toString(solution(new int[]{1,2,3,4,5})));
        System.out.println("기대값 : [2, 4, 200, -198, 2, 4, 6] , 결과값 : " + Arrays.toString(solution(new int[]{1, 2, 100, -99, 1, 2, 3})));
    }

    public static int[] solution(int[] numbers) {
        //Stream을 사용하면 아래 코드를 사용할 수 잇다.
        //Arrays.stream(numbers).map(i -> i *2).toArray();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }
}
