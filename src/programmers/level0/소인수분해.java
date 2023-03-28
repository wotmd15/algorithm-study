package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;

public class 소인수분해 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120852
     * Level 0
     * 소인수분해
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : [2,3] , 결과값 : " + Arrays.toString(solution(12)));
        System.out.println("기대값 : [17] , 결과값 : " + Arrays.toString(solution(17)));
        System.out.println("기대값 : [2,3,5,7] , 결과값 : " + Arrays.toString(solution(420)));
    }

    public static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = 2;
        while(temp <= n){
            if(n % temp == 0){
                list.add(temp);
                n /= temp;
                temp = 2;
            } else{
                temp++;
            }
        }

        return list.stream().distinct().mapToInt(Integer::intValue).toArray();
    }
}
