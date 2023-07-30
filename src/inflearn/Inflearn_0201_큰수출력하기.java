package inflearn;

import java.util.Scanner;

public class Inflearn_0201_큰수출력하기 {

    public static String solution(String[] arr) {
        String answer = "";
        /*
        * 풀이
        *
        * */
        answer = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            if(Integer.valueOf(arr[i]) < Integer.valueOf(arr[i+1])){
                answer += " " + arr[i+1];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str[] = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = kb.next();
        }
        System.out.println(solution(str));
    }

}