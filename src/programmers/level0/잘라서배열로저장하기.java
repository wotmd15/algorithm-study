package programmers.level0;

import java.util.Arrays;

public class 잘라서배열로저장하기 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120913
     * Level 0
     * 잘라서 배열로 저장하기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : [abc1Ad, dfggg4, 556b] , 결과값 : " + Arrays.toString(solution("abc1Addfggg4556b",6)));
        System.out.println("기대값 : [abc, def, 123] , 결과값 : " + Arrays.toString(solution("abcdef123",3)));
    }

    public static String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length()%n == 0 ? my_str.length()/n : (my_str.length()/n)+1];

        for(int i = 0; i < answer.length; i ++){
            if(my_str.length() < n){
                answer[i] = my_str;
            } else {
                answer[i] = my_str.substring(0,n);
                my_str = my_str.substring(n,my_str.length());
            }
        };
        return answer;
    }
}
