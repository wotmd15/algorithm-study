package programmers.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 가위바위보 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120839
     * Level 0
     * 가위 바위 보
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 0 , 결과값 : " + solution("2"));
        System.out.println("기대값 : 052 , 결과값 : " + solution("205"));
    }

    public static String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for(String str : rsp.split("")){
            if(str.equals("2")){
                sb.append("0");
            } else if(str.equals("0")){
                sb.append("5");
            } else{
                sb.append("2");
            }
        }
        //Arrays.stream(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());
        return sb.toString();
    }
}
