package inflearn;

import java.util.Scanner;

public class Inflearn_0109_숫자만추출 {
    public static int solution(String str) {
        //return Integer.valueOf(str.replaceAll("[^0-9]",""));

        //다른 방법 For을 돌리는 방법
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)) answer += Character.toString(x);
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str  = kb.nextLine();
        System.out.println(solution(str));
    }

}