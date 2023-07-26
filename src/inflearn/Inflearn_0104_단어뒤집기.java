package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Inflearn_0104_단어뒤집기 {
    public ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            //answer.add(new StringBuilder(x).reverse().toString()); //  String Builder 사용
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while(lt < rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(s));
        }
        return answer;
    }

    public static void main(String[] args) {
        Inflearn_0104_단어뒤집기 t = new Inflearn_0104_단어뒤집기();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = kb.next();
        }
        System.out.println(t.solution(str));

    }

}