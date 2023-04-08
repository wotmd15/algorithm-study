import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        rec_func(num1, num2);
    }

    static void rec_func(int num1,int num2){
        System.out.println(num1 + num2);
    }
}
