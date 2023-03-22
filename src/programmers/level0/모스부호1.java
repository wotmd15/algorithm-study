package programmers.level0;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class 모스부호1 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120838
     * Level 0
     * 모스부호 (1)
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : hello , 결과값 : " + solution(".... . .-.. .-.. ---"));
        System.out.println("기대값 : python , 결과값 : " + solution(".--. -.-- - .... --- -."	));
    }

    public static String solution(String letter) {
        Map<String, String> morseMap = Arrays.asList(".-:a","-...:b","-.-.:c","-..:d",".:e","..-.:f",
                        "--.:g","....:h","..:i",".---:j","-.-:k",".-..:l",
                        "--:m","-.:n","---:o",".--.:p","--.-:q",".-.:r",
                        "...:s","-:t","..-:u","...-:v",".--:w","-..-:x",
                        "-.--:y","--..:z").stream().map(v -> v.split(":")).collect(Collectors.toMap(e -> e[0], e -> e[1]));
        StringBuilder sb = new StringBuilder();
        for(String str : letter.split(" ")){
            sb.append(morseMap.get(str));
        }
        return sb.toString();
    }
}
