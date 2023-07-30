package inflearn;

import java.util.Scanner;

public class Inflearn_0112_암호 {

    public static String solution(int n, String s) {
        String answer = "";
        /*
        * 풀이
        * 7개씩 n 라인 만큼 짤라서 String을 2진수로 변환한 값을 아스키코드로 변환한다.
        * */
        for(int i = 0; i < n; i++){
            String tmp = s.substring(0,7).replaceAll("#","1").replaceAll("\\*","0");
            s = s.substring(7); //s = s.substring(7,s.length());
            answer += (char)Integer.parseInt(tmp,2); // String to 2진수 변환 후 char 변환
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str  = kb.next();
        System.out.println(solution(n, str));
    }

}