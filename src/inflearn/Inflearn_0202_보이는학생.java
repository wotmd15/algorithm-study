package inflearn;

import java.util.Scanner;

public class Inflearn_0202_보이는학생 {

    public static int solution(int[] arr) {
        int answer = 1;
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                answer ++;
                max = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(solution(arr));
    }

}