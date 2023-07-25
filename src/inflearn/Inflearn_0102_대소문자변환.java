package inflearn;

import java.util.Scanner;

public class Inflearn_0102_대소문자변환 {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            //Character.isLowerCase ==> 소문자여부 판단
       //     answer += Character.isLowerCase(x) ? Character.toUpperCase(x) : Character.toLowerCase(x);


            // ASCII Number 사용법
            // 대문자 : 65 ~ 90
            // 소문자 : 97 ~ 122
            //answer += x >= 65 && x <= 90 ? Character.toLowerCase(x) : Character.toUpperCase(x);
            answer += x >= 65 && x <= 90 ? (char)(x-32): (char)(x+32);

            /*
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
            */
        }
        return answer;
    }

    public static void main(String[] args) {
        Inflearn_0102_대소문자변환 t = new Inflearn_0102_대소문자변환();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(t.solution(str));
    }

}