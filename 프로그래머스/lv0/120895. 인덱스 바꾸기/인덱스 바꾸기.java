import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] arr = my_string.split("");
        String changeStr = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = changeStr;
        return Arrays.stream(arr).collect(Collectors.joining());
    }
}