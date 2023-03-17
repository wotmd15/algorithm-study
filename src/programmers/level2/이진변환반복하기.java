package programmers.level2;

import java.util.Arrays;

public class 이진변환반복하기 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/70129
     * Level 2
     * 이진 변환 반복하기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : [3,8] , 결과값 : " + Arrays.toString(solution("110010101001")));
        System.out.println("기대값 : [3,3] , 결과값 : " + Arrays.toString(solution("01110")));
        System.out.println("기대값 : [4,1] , 결과값 : " + Arrays.toString(solution("1111111")));
    }

    public static int[] solution(String s) {
        int replaceCount = 0;
        int round = 0;
        while(!"1".equals(s)){
            round++;
            replaceCount += Arrays.stream(s.split("")).filter(v -> "0".equals(v)).count();
            s = Integer.toBinaryString(s.replaceAll("0","").length()); //2진수

            /*
            Java 내장 함수 Integer.toBinaryString 사용하지 않을경우 아래와 같이 10진수를 2진수로 변환한다.
            StringBuffer sb = new StringBuffer();
            int strLength = s.replaceAll("0","").length();
            while(strLength > 0){
                sb.append(strLength%2);
                strLength = strLength/2;
            }
            s = sb.reverse().toString();
             */
        }

        return new int[]{round, replaceCount};
    }
}
