package inflearn;

import java.util.Scanner;

public class Inflearn_0204_피보나치수열 {

    public static String solution(int n) {
        String answer = "1 1 ";
        int arr[] = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i < n; i++){
            arr[i] = arr[i-1] + arr[i-2];
            answer += arr[i] + " ";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(solution(n));
    }

}