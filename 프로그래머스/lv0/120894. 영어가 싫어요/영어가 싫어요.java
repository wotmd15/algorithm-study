class Solution {
    public long solution(String numbers) {
        String alpha[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < alpha.length; i++){
            numbers = numbers.replaceAll(alpha[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}