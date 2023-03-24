package programmers.level0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class 한번만등장한문자 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120896
     * Level 0
     * 한 번만 등장한 문자
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : d , 결과값 : " + solution("abcabcadc"));
        System.out.println("기대값 : abcd , 결과값 : " + solution("abdc"));
        System.out.println("기대값 : eho , 결과값 : " + solution("hello"));
    }

    public static String solution(String s) {
        String[] arr = s.split("");
        String temp = s;
        for(int i = 0; i < arr.length; i++){
            if(i != s.indexOf(arr[i])){
                temp = temp.replaceAll(arr[i],"");
            }
        }
        return Arrays.stream(temp.split("")).sorted().collect(Collectors.joining());
    /**
     * Stream 풀이
         return Arrays.stream(s.split(""))
             .collect(Collectors.groupingBy(s1 -> s1))
             .entrySet()
             .stream()
             .filter(entry -> entry.getValue().size() <= 1)
             .map(Map.Entry::getKey)
             .sorted()
             .collect(Collectors.joining());
     * */

    }
}
