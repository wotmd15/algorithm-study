package inflearn;

import java.util.Scanner;

public class Inflearn_0107_회문문자열 {
    public static String solution(String str) {
        String answer = "YES";
        str = str.toLowerCase();
        /*
        int lt = 0, rt = str.length()-1;
        while(lt < rt){
            if(str.charAt(lt) != str.charAt(rt)){
                answer = "NO";
                break;
            }
            lt++; rt--;
        }
        */
        //다른 풀이
        int len = str.length();
        for(int i = 0; i < len/2; i++){
            if(str.charAt(i) != str.charAt(len - i - 1)){ // gooG => 4 - 0 - 1 => 3번 인덱스
                answer = "NO";
                break;
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