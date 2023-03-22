package programmers.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 중복된문자제거 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120888
     * Level 0
     * 중복된 문자 제거
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : [peol] , 결과값 : " + solution("people"));
        System.out.println("기대값 : [We arthwold] , 결과값 : " + solution("We are the world"));
        System.out.println("기대값 : [ R] , 결과값 : " + solution("  R"));
        System.out.println("기대값 : [Pp] , 결과값 : " + solution("PPpPpPpPp"));
    }

    public static String solution(String my_string) {
        String[] splitStr = my_string.split("");
        for(int i = 0; i < splitStr.length; i++){
            my_string = my_string.substring(0,my_string.indexOf(splitStr[i])+1) + my_string.substring(my_string.indexOf(splitStr[i])+1, my_string.length()).replaceAll(splitStr[i],"");
        }
        return my_string;
        /**
         * 스트림을 이용한 풀이
         * return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());
         * */
    }

}
