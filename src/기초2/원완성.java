package 기초2;

import java.util.Scanner;

public class 원완성 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("n값 입력");
        int n = sc.nextInt();

//처음 i 그대로 j만 증가 j가 입력값 만큼 최대치로 증가할 때 포문이 끝나 개행해주는 칸을 지나 i가 증가하고 i의 부호가 +가 될 때 규칙이 반전되어 별찍는 횟수가 적어진다
//if문은 n값이 작을 때는 거짓이 되어 공백이 출력 클때는 참이 되어 별이 출력된다

        for (int i=-n; i<= n ; i++) {  // i++ 개행하고 증가 - > + 변해감
            for (int j = -n; j <= n; j++) { //j++
                if ((i * i) + (j * j) <= n * n) {
                    System.out.print("  *");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

            sc.close();

        }
    }
}
