import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        return Integer.valueOf(factorial(balls).divide(factorial(balls-share).multiply(factorial(share))).toString());
    }
    
    public BigInteger factorial(int num){
        BigInteger total = new BigInteger("1");
        for(int i = 1; i <= num; i++){
             total = total.multiply(new BigInteger(String.valueOf(i)));
        }
        return total;
    }
}