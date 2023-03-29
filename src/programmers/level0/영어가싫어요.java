package programmers.level0;

public class 영어가싫어요 {


    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120894
     * Level 0
     * 컨트롤 제트
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : 4 , 결과값 : " + solution("1 2 Z 3"));
        System.out.println("기대값 : 100 , 결과값 : " + solution("10 20 30 40"));
        System.out.println("기대값 : 1 , 결과값 : " + solution("10 Z 20 Z 1"));
        System.out.println("기대값 : 0 , 결과값 : " + solution("10 Z 20 Z"));
        System.out.println("기대값 : -3 , 결과값 : " + solution("-1 -2 -3 Z"));
    }

    public static int solution(String s) {
        int answer = 0;
        int before = 0;
        for(String str : s.split(" ")){
            if("Z".equals(str)){
                answer -= before;
            } else {
                before = Integer.parseInt(str);
                answer += before;
            }
        }
        return answer;
    }
}
