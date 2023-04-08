import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int sortArray[] = Arrays.stream(numbers).sorted().toArray();
        return sortArray[numbers.length-1]*sortArray[numbers.length-2];
    }
}