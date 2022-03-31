package 기초2;
import java.util.Scanner; // 스캐너

public class 마름모완성 {
    public static void main(String[] args) {

        int i , j , n , k;
        Scanner sc = new Scanner(System.in); //스캐너
        System.out.println("마름모 n 부분을 입력해주세요."); //스캐너 출력문장
        n = sc.nextInt(); //스캐너 입력

        // 윗 부분

        for ( i = 0; i <= n; i++) {
            for ( j = 0; j < n - i; j++) {
                System.out.print("/");  //공백
            }
            for ( k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");  //별
            }
            System.out.println(); //줄바꿈
        }

        //아래 부분


        for ( i = 0; i < n; i++) {
            for ( j = 0; j <= i; j++) {
                System.out.print(" ");  //공백
            }
            for ( k = 0; k < (2 * n - 1)-(2*i); k++) {
                System.out.print("*");  //별
            }
            System.out.println(); //줄바꿈
        }

    }
}