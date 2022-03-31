package 기초2;

import java.util.Scanner;

public class 마름모연습2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력");
        int n = scanner.nextInt();
        int j,k,i;

        for (k = 1; k < (n + 1); k++) {
            for (i = 0; i < n - k; i++) {
                System.out.print(" ");
            }
            for (j = 0; j < k; j++) {
                if(j == 0)
                    if(k == n+1)
                        System.out.print("*");
                    else
                        System.out.print(" *");
                else{
                    System.out.print("$*");
                }
            }
            System.out.println("");
        }

        for (k = 1; k < n; k++) {
            for (i = 0; i < k; i++) {
                System.out.print(" ");
            }
            for (j = 0; j < n - k; j++) {
                if(j == 0)
                    if(k == n+1)
                        System.out.print("*");
                    else
                        System.out.print(" *");
                else{
                    System.out.print("$*");
                }
            }
            System.out.println("");
        }





    }
}
