package programmers.level0;

public class 문자반복출력하기 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120825
     * Level 0
     * 문자 반복 출력하기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : hhheeellllllooo , 결과값 : " + solution("hello",3));
    }

    public static String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        String[] strArray = my_string.split("");
        for(String str : strArray){
            for(int i =0; i < n; i++){
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
