package 기초2;

import java.util.Scanner;

public class 별완 {
    public static void main(String[] args) {

        System.out.println("입력하셈");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        //별 머리
        for (int i = 1; i <=  number + 1; i++){ //층수 n +1
            for (int j =1; j <= (number * 5) - i ;  j++ ){// 공백이 n값에서 - i로 줄어듬
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++ ){//별은 맨 처음 1에서 홀수로 증가 후 개행
                System.out.print("*");
            }
            System.out.println("");
        }

        //몸통 이등변 사타리꼴
        for (int i = 1; i <= number ; i++){ //층수
            for (int j = 1; j <= (i * 3) - 1 ; j++ ){ //공백 * 3
                System.out.print(" ");
            }
            for (int k = 1; k<= (number * 10)+ 1 - (i * 6) ; k++ ){ //
                System.out.print("*");
            }
            System.out.println();
        }

        //허벅지
        for (int i = 1; i <= (number * 0.1) ; i++){ //층수
            for (int j = 1; j <= (number * 3)  - i ; j++ ){ //공백 * 3
                System.out.print(" ");
            }
            for (int k = 1; k<= (number * 4)  -1 + (i * 2) ; k++ ){ //
                System.out.print("*");
            }
            System.out.println();

        }


        //양쪽 다리
        for (int i = 1; i <= (number + 1 ) ; i++){ //층수
            for (int j = 1; j <= (number * 3) -1 - i ; j++ ){ //공백 * 3
                System.out.print(" ");
            }
            for (int k = 1; k<= (number * 2) + 3 - (i * 2) ; k++ ){ //
                System.out.print("*");
            }
            for (int l = 1; l <= (i * 6) - 5; l++ ){//별은 맨 처음 1에서 홀수로 증가 후 개행
                System.out.print(" ");
            }
            for (int m = 1; m <= (number * 2) + 3 - (i * 2) ; m++ ){ //
                System.out.print("*");
            }

            System.out.println();
        }





    }
}
