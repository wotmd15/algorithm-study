package programmers.level0;

public class 옷가게할인받기 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120818
     * Level 0
     * 옷가게 할인 받기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 142,500 , 결과값 : " + solution(150000));
        System.out.println("기대값 : 464,000 , 결과값 : " + solution(580000));
    }

    public static int solution(int price) {
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
