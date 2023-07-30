package inflearn;

import java.util.Scanner;

public class Inflearn_0111_문자열압축 {

    public static String solution(String s) {
        /*
        빈문자 추가 없이 마지막 문장를 추가해주는 경우
        String answer = "";
        int count = 1;
        String lastStr = "";
        String[] sArray = s.split("");
        for(int i = 0; i < sArray.length -1 ; i++){
            lastStr = sArray[i+1];
            if(sArray[i].equals(sArray[i+1])){
                count ++;
            } else {
                answer += sArray[i] + (count > 1 ? count : "");
                count = 1;
            }
        }
        answer += lastStr + (count > 1 ? count : "");
        return answer;
        */

        String answer = "";
        s = s + " ";
        int count = 1;
        String[] sArray = s.split("");
        for(int i = 0; i < sArray.length -1 ; i++){
            if(sArray[i].equals(sArray[i+1])){
                count ++;
            } else {
                answer += sArray[i] + (count > 1 ? count : "");
                count = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str  = kb.nextLine();
        System.out.println(solution(str));
    }

}