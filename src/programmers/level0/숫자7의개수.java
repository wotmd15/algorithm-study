package programmers.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 숫자7의개수{

        /**
         * https://school.programmers.co.kr/learn/courses/30/lessons/120912
         * Level 0
         * 7의 개수
         * */
        public static void main(String[] args) {
            System.out.println("기대값 : 4 , 결과값 : " + solution(new int[]{7, 77, 17}));
            System.out.println("기대값 : 0 , 결과값 : " + solution(new int[]{10, 29}));
        }

        public static int solution(int[] array) {
            String str = Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining()).replaceAll("[^7]","");
            /*
             Stream만 이용한 풀이

             (int)Arrays.stream(
                                Arrays.stream(array)
                                        .mapToObj(String::valueOf)
                                         .collect(Collectors.joining())
                                         .split(""))
                        .filter(i -> i.equals("7"))
                         .count()
            */
            return !"".equals(str) ? str.split("").length : 0;
        }
}
