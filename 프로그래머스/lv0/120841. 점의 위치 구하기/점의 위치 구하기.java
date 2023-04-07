import java.util.Arrays;

class Solution {
    public int solution(int[] dot) {
        Integer array[] = {3,1,-3,-1};
        Integer sum = (dot[0] < 0 ? -1 : 1) + (dot[1] < 0 ? -2 : 2);
        return Arrays.asList(array).indexOf(sum)+1;
    }
}