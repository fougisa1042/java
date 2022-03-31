package 기초2;

import java.util.Scanner;

public class 원연습1 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("n값 입력");
            int n = sc.nextInt();

            //원의 방정식 : x^2 + y^2 = r^2
            for(int i = -n; i <= n; i++) {
                for(int j = -n; j <= n; j++) {
                    if(i * i + j * j <= n * n) {
                        System.out.print("  *");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
}
