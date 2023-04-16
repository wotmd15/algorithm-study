import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int[] newSides = Arrays.stream(sides).sorted().toArray();
        return newSides[2] < newSides[0] + newSides[1] ? 1 : 2;
    }
}