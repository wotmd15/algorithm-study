package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Inflearn_0105_특정문자뒤집기 {
    public static String solution(String str) {
        int lt = 0, rt = str.length()-1;
        char[] s = str.toCharArray();

        while(lt < rt){
            if(!Character.isAlphabetic(s[lt])){          //특수문자 여부
                lt ++;
            } else if(!Character.isAlphabetic(s[rt])){   //특수문자 여부
                rt --;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt ++;
                rt --;
            }
        };
        return String.valueOf(s);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str  = kb.next();
        System.out.println(solution(str));

    }

}