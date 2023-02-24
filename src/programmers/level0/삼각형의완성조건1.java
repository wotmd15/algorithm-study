package programmers.level0;

import java.util.Arrays;

public class 삼각형의완성조건1 {


    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120889
     * Level 0
     * 삼각형의 완성조건 (1)
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 2 , 결과값 : " + solution(new int[]{1, 2, 3}));
        System.out.println("기대값 : 2 , 결과값 : " + solution(new int[]{3, 6, 2}));
        System.out.println("기대값 : 1 , 결과값 : " + solution(new int[]{199, 72, 222}));

    }

    public static int solution(int[] sides) {
        int[] newSides = Arrays.stream(sides).sorted().toArray();
        return newSides[2] < newSides[0] + newSides[1] ? 1 : 2;
    }


}
