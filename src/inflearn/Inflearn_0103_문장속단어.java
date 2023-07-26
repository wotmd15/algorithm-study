package inflearn;

import java.util.Scanner;

public class Inflearn_0103_문장속단어 {
    public String solution(String str){
        String answer = "";
        int maxSize = Integer.MIN_VALUE; // 0을 넣어도 무방
        for(String x : str.split(" ")){ // space 구분 시 \\s 사용해도 무관
            if(maxSize < x.length()){
                answer = x;
                maxSize = x.length();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Inflearn_0103_문장속단어 t = new Inflearn_0103_문장속단어();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(t.solution(str));
    }

}