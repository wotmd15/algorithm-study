class Solution {
    public int solution(int price) {
        if(price >= 500000){
            price = (int) Math.floor(((double)price * 0.8));
        } else if(price >= 300000){
            price = (int) Math.floor(((double)price * 0.9));
        } else if(price >= 100000){
            price = (int) Math.floor(((double)price * 0.95));
        }
        return price;
    }
}