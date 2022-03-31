package 기초2;

import java.util.Scanner;

public class 원완 {
    public static void main(String[] args) {

        System.out.println("입력하셈");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = -n; i <= n; i++){
            for (int j = -n ; j <= n; j++){
                if ((i*i) + (j*j) <= n*n+1){
                    System.out.print("  *");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
