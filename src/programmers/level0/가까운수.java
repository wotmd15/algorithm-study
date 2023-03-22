package programmers.level0;

public class 가까운수 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120890
     * Level 0
     * 가까운 수
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 28 , 결과값 : " + solution(new int[]{3, 10, 28},20));
        System.out.println("기대값 : 12 , 결과값 : " + solution(new int[]{10, 11, 12},13));
    }

    public static int solution(int[] array, int n) {
        int answer = array[0];
        int diff = Math.abs(0 - n);
        for(int i = 0; i < array.length; i++){
            int cal = Math.abs(array[i] - n);
            if(diff > cal){
                diff = cal;
                answer = array[i];
            }
            else if(diff == cal){
                answer = answer > array[i] ? array[i] : answer;
            }
        }

        return answer;
    }

}
