package programmers.level0;

public class 주사위의개수 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120845
     * Level 0
     * 주사위의 개수
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 1 , 결과값 : " + solution(new int[]{1, 1, 1},1));
        System.out.println("기대값 : 12 , 결과값 : " + solution(new int[]{10, 8, 6},3));
    }

    public static int solution(int[] box, int n) {
        return (box[0]/n) * (box[1]/n) * (box[2]/n);
    }
}
