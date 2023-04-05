import java.util.Arrays;
import java.util.stream.IntStream;


class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return IntStream.range(0, numbers.length)
				.map(i -> i >= num1 && i <= num2 ? numbers[i] : -1)
				.filter(i -> i != -1)
				.toArray();

    }
}