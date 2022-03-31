package 기초2;

import java.util.Scanner;  //

public class 마름모연습1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("마름모 윗 부분 크기를 입력해주세요.");

        int height = sc.nextInt();

        //윗부분
        int i=0;
        while(i<=height) {
            //공백
            int j=0;
            while(j<=height-i) {
                System.out.print("a");
                j++;
            }
            //별표
            int k=0;
            while(k<2*i+1) {
                System.out.print("*");
                k++;
            }
            System.out.println("");
            i++;
        }


        //아래부분
        int l=height-1;
        while(l>=1) {
            //공백
            int j=0;
            while(j<height-l) {
                System.out.print("a");
                j++;
            }
            //별표
            int k=0;
            while(k<2*l-1) {
                System.out.print("*");
                k++;
            }
            System.out.println("");
            l--;
        }
    }
}