import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int arrays[] = Arrays.stream(array).sorted().toArray();        
        return arrays[array.length/2];
        
    }
}