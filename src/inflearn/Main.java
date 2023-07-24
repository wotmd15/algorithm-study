package inflearn;

import java.util.Scanner;

public class Main {
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        /*
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == t){     //캐릭터 비교는 charAt으로 조회 후 == 으로 비교한다.
                answer ++;
            }
        }
        */
        for(char x : str.toCharArray()){ // String => char Array 생성 가능
            if(x == t){
                answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0); //
        System.out.println(t.solution(str,c));
    }

}