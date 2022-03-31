package 기초2;

import java.util.Scanner;

public class 별완성 {
    public static void main(String[] args) {
        int i, j, n , k, a;

        Scanner sc = new Scanner(System.in);

        System.out.println("n값을 입력해주세요");
        n = sc.nextInt();
        a = n * 3;


        //별 머리
        for (i = 0; i <= n; i++) {  //n값을 5를 받는다고 친다 그리고 i , j , k,의 초기값은 전부 1 그리고 수행한 뒤에는 변수 값에다가 ++를 해준다
            for (j = 1; j <= a - i +1; j++) { //n - i = 5 - 1 = 4 이기 때문에
                System.out.print(" ");   // 4만큼 공백을 출력한다
            }
            for (k = 1; k <= 2 * i - 1; k++) {  //2*i-1 = i가 증가할 수록 1.2.3... 이기 떄문에
                System.out.print("*");  // 계산식만큼 (*을 출력한다 2*n-1은 홀수를 만드는 식이다
            }
            System.out.println(); // 위에서 아래로 내려오기 떄문에 개행을 해준다
        }


        for (i = a; i >= a * 2 / 2.6; i--) {  //i = n i >= 1 i--이기 떄문에 조건식이 충족하면 i값이 점점 적어진다
            for (j = 1; j <= a - i; j++) { //처음에 n - i = 0 fals가 떠서 그냥 넘어 간다
                System.out.print(" ");
            }
            for (k = 1; k <= 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

/*

        for (i = 1; i <= a/2.5; i++) {  //수행한 뒤에는 변수 값에다가 ++를 해준다
            for (j = 1; j <= a/2.5 - i; j++) { //n - i = 5 - 1 = 4 이기 때문에
                System.out.print(" ");   // 4만큼 공백을 출력한다
            }
            for (k = 1; k <= 2 * j - 1; k++) {  //2*i-1 = i가 증가할 수록 1.2.3... 이기 떄문에
                System.out.print("*");  // 계산식만큼 (*을 출력한다 2*n-1은 홀수를 만드는 식이다
            }


            for (j = 1; j <= 6 * i - 5; j++) { //n - i = 5 - 1 = 4 이기 때문에
                System.out.print(" ");
            }
            for (k = 1; k <=  a-1-i*2-1; k++) {  //2*i-1 = i가 증가할 수록 1.2.3... 이기 떄문에
                System.out.print("*");  // 계산식만큼 (*을 출력한다 2*n-1은 홀수를 만드는 식이다
            }


            System.out.println();
        }
*/


        //별 아래 부분
        for (i = n; i >= 1; i--) {  //n값을 5를 받는다고 친다 그리고 i , j , k,의 초기값은 전부 1 그리고 수행한 뒤에는 변수 값에다가 ++를 해준다
            for (j = 1; j <= a/1.5-i ; j++) { //n - i = 5 - 1 = 4 이기 때문에
                System.out.print(" ");   // 4만큼 공백을 출력한다
            }
            for (k = 1; k <= 2 * i + -1; k++) {  //2*i-1 = i가 증가할 수록 1.2.3... 이기 떄문에
                System.out.print("*");  // 계산식만큼 (*을 출력한다 2*n-1은 홀수를 만드는 식이다
            }


            for (j = i; j <= a/1.3-i+1 ; j++) { //n - i = 5 - 1 = 4 이기 때문에
                System.out.print(" ");   // 4만큼 공백을 출력한다
            }
            for (k = 1; k <=  2 * i + -1 ; k++) { //n - i = 5 - 1 = 4 이기 때문에
                System.out.print("*");   // 4만큼 공백을 출력한다
            }
            System.out.println(); // 위에서 아래로 내려오기 떄문에 개행을 해준다
        }





 /*for (i = 1; i <= n; i++) {  //수행한 뒤에는 변수 값에다가 ++를 해준다
            for (j = 1; j <= n - i; j++) { //n - i = 5 - 1 = 4 이기 때문에
                System.out.print(" ");   // 4만큼 공백을 출력한다
            }
            for (k = 1; k <= 2 * j - 1; k++) {  //2*i-1 = i가 증가할 수록 1.2.3... 이기 떄문에
                System.out.print("*");  // 계산식만큼 (*을 출력한다 2*n-1은 홀수를 만드는 식이다
            }
            System.out.println();
        }*/


        /*for( i=1; i<=a*2/2.6; i++){
            for( j=0; j<a/2-i+1; j++) {
                System.out.print("*");
            }
            for( j=0; j<i*2-1; j++) {
                System.out.print(" ");
            }
            for( k=0; k<a/2-i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

    }
}
