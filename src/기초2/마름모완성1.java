package 기초2;

import java.util.Scanner;

public class 마름모완성1 {

        public static void main(String[] args) {

            int i , j,  n , k ;
            Scanner sc = new Scanner(System.in);

            System.out.println(" 입력값 입력");
            n = sc.nextInt();

//i , j , k의 변수 초기 값은 1이다 n값은 유저가 입력한대로 숫자가 정해진다
// n값의 예시를 5로 해보겠다
//삼각상과 삼각하를 합치면서 단차가 발생했는데 이를 맞추기위해 변수 초기값을 바꾸게 되었다
//i = 0 , k = 0

            //삼각상
            for (i = 0; i <= n; i++){  //칸수
                for (j = 1; j <= n - i ; j++){ //n - i = 5이고 i가 증가하기 때문에 5.4.3~ 공백
                    System.out.print("-");
                }
                for (k = 0; k <= 2 * i ; k++ ){  //2*i-1 = i가 증가할 수록 1.2.3... 이기 떄문에
                    System.out.print("*");  // 계산식만큼 (*을 출력한다 2*n-1은 홀수를 만드는 식이다
                }
                System.out.println(); // 위에서 아래로 내려오기 떄문에 개행을 해준다
            }

//다른점 j = 0
            //삼각하
            for (i = n; i >= 1; i--) {  //i = n  i >= 1   i--이기 떄문에 조건식이 충족하면 i값이 점점 적어진다
                for (j = 0; j <= n - i; j++) { //처음에 n - i = 0 fals가 떠서 그냥 넘어 간다
                    System.out.print("-");   //
                }
                for (k = 1; k <= 2 * i - 1; k++) {  //2*i-1 = i가 증가할 수록 1.2.3... 이기 떄문에
                    System.out.print("*");  //
                }
                System.out.println(); //
            }




        }
}
