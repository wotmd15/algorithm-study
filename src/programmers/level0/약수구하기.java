package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;

public class 약수구하기 {


    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120897
     * Level 0
     * 약수 구하기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : [1, 2, 3, 4, 6, 8, 12, 24] , 결과값 : " + Arrays.toString(solution(24)));
        System.out.println("기대값 : [1, 29] , 결과값 : " + Arrays.toString( solution(29)));
    }

    public static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
