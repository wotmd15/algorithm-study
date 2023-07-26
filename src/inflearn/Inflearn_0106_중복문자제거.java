package inflearn;

import java.util.Scanner;

public class Inflearn_0106_중복문자제거 {
    public static String solution(String str) {
        String answer = "";
        for(int i = 0; i < str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i){    // i번째 문자와 indexOf 문자의 Index가 동일하면 중복이 아닌 문자임
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str  = kb.next();
        System.out.println(solution(str));

    }

}