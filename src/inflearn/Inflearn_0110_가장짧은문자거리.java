package inflearn;

import java.util.Scanner;

public class Inflearn_0110_가장짧은문자거리 {

    /**
     * 정방향 순회로 거리를 비교한 후 반대방 순회로 거리를 비교해 작은 거리를 넣는다.
     * */
    public static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;

        //정방향 순회
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == t){
                p = 0;
            } else {
                p ++;
            }
            answer[i] = p;
        }

        //반대 방향 순회
        p = 1000;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i)== t ){
                p = 0;
            } else {
                p ++;
            }
            //answer[i] = answer[i] < p ? answer[i] : p;
            answer[i] = Math.min(answer[i],p);
        }

        return answer;



    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str  = kb.nextLine();
        char c  = kb.nextLine().charAt(0);
        for(int x : solution(str, c)){
            System.out.print(x + " ");
        }
    }

}