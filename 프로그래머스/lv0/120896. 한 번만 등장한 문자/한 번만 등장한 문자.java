import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        String temp = s;
        for(int i = 0; i < arr.length; i++){
            if(i != s.indexOf(arr[i])){
                temp = temp.replaceAll(arr[i],"");
            }
        }
        return Arrays.stream(temp.split("")).sorted().collect(Collectors.joining());
    }
}