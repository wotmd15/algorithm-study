package programmers.level0;

public class 모음제거 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120849
     * Level 0
     * 모음 제거
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : bs , 결과값 : " + solution("bus"));
        System.out.println("기대값 : nc t mt y , 결과값 : " + solution("nice to meet you"));
    }

    public static String solution(String my_string) {
        return my_string.replaceAll("[aeiou]","");
    }

}
