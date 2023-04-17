import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split("")).map(v -> Character.isLowerCase(v.charAt(0)) ? v.toUpperCase() : v.toLowerCase()).collect(Collectors.joining());
    }
}