import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;
class Solution {
    
    public String solution(String letter) {
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