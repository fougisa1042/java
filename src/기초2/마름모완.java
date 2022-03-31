package 기초2;

import java.util.Scanner;

public class 마름모완 {
    public static void main(String[] args) {

        System.out.println("입력하세요");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n +1; i ++){
            for (int j = 1; j <= n-i +1; j++){
                System.out.print("-");
            }
            for (int k = 1; k <= i*2 -1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++ ){
            for (int j = 1; j <= i*2 -i; j++){
                System.out.print("-");
            }
            for (int k = n; k <= n*3 - i*2 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*for (int i = 1; i <= 5 + 1; i++){
            for (int j = 1; j <= 5 - i + 1; j++){
                System.out.print("-");
            }
            for (int k = 1; k <= i*2 -1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++){ //층수
            for (int j = n; j <= n + i - 1; j++){ //n 점점 작아짐
                System.out.print("-");
            }
            for (int k = n; k <= n*3-(i*2); k++){
                System.out.print("*");
            }
            System.out.println();
        }*/






    }
}
