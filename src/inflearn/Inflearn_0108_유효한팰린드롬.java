package inflearn;

import java.util.Scanner;

public class Inflearn_0108_유효한팰린드롬 {
    public static String solution(String str) {
        String answer = "YES";
        str = str.replaceAll("[^a-zA-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)){ // ==> 대소문자 구분하지 않고 비교 해준다.
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        /**
         * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
         * */
        Scanner kb = new Scanner(System.in);
        String str  = kb.nextLine();
        System.out.println(solution(str));
    }

}