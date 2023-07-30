package inflearn;

import java.util.Scanner;

public class Inflearn_0203_가위바위보 {
    /**
     * 1 : 가위
     * 2 : 바위
     * 3 : 보
     * */
    public static String solution(int arr1, int arr2) {
        String answer = "";


        //A가 이기는 경우만 정의
        if(arr1 == arr2){
            answer = "D";
        } else if(arr1 == 1 && arr2 == 3){
            answer = "A";
        } else if(arr1 == 2 && arr2 == 1){
            answer = "A";
        } else if(arr1 == 3 && arr2 == 2){
            answer = "A";
        } else{
            answer = "B";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for(int i = 0; i < n; i++){
            arr1[i] = kb.nextInt();
        }

        for(int i = 0; i < n; i++){
            arr2[i] = kb.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.println(solution(arr1[i], arr2[i]));
        }

    }

}