package 기초2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class 원연습 {
    public static void main(String[] args) {
       // 별이 찍히긴 함
       int n=0 , i , j;
        Scanner sc = new Scanner(System.in);
        System.out.println("n값 입력");
        n = sc.nextInt();

        for (i = 0; i <= n * 2; i++) {
            for (j = 0; j <= n * 2; j++) {
                //원의 중심좌표(n,n)로부터 (i,j)사이의 거리를 구함
                int d = (int) sqrt((i - n) * (i - n) + (j - n) * (j - n));
                //(i,j)좌표가 (n,n)사이의 거리가 반지름의길이 이하일때  좌표를 찍는다.
                if (d <= n) {
                    System.out.print("  *");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }


/*

      // 별이 잘 안찍 힘
        int radius = n / 2;
        int bold = radius;
        int x, y ;


        System.out.println("n값 입력");
        n = sc.nextInt();

        for (y = 0; y <= n; y++) {
            for (x = 0; x <= n; x++) {
                int phyta = (x - radius) * (x - radius) + (y - radius) * (y - radius);
                if ((radius * radius) - bold <= phyta && phyta <= (radius * radius) + bold)
                    System.out.print(" *");
                else
                    System.out.print("   ");
            }
            System.out.println("");
        }
*/


    }
}
