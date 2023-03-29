package programmers.level0;

import java.util.Arrays;

public class 외계어사전 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120869
     * Level 0
     * 외계어 사전
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : [2] , 결과값 : " + solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println("기대값 : [1] , 결과값 : " + solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println("기대값 : [2] , 결과값 : " + solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }

    public static int solution(String[] spell, String[] dic) {
        int answer = 2;

        for(String dicStr : dic){
            if(dicStr.length() != spell.length) continue;
            for(String spellStr : spell){
                dicStr = dicStr.replaceFirst(spellStr, "");
            }
            if("".equals(dicStr)){
                answer=1;
                break;
            }
        }
        return answer;
    }

}
