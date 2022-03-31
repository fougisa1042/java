package 기초2;

import java.util.Random;
import java.util.Scanner;
public class 스도쿠2 {
    public static void main(String[] args) {

        Random random = new Random(System.currentTimeMillis());
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int n = sc.nextInt();

        int[][] 배열크기 = new int[n][n];  //배열 크기라는 2차원 배열 n / n 크기로 생성
        for (int i = 0; i < n; i++){ //배열 크기 n만큼 증가 시킴
            for (int j = 0; j < n; j++){
                배열크기[i][j] = 0;  //0으로 초기화
            }
        }

        int rand; //랜덤상수 n만큼 자연수가 들어가게 함
        boolean 동일 = true;

        두번째루프: while (true){
            int 루프횟수 = 0; //초기화

            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++) {

                    첫번째루프:
                    while (true){
                        rand = random.nextInt(n)+1;
                        배열크기[i][j] = rand;


                        for (int a = j - 1; a >= 0; a--) {  //기준 왼쪽값들 일치 유뮤 검사
                            while (동일) {
                                if (배열크기[i][j] == 배열크기[i][a]) {
                                    continue 첫번째루프;
                                } else {
                                    동일 = false;
                                }
                            }
                            동일 = true;//빠져나오면 다시 초기화
                        }

                        for (int b = i - 1; b >= 0; b--) {  //기준 위쪽값들 일치유무검사
                            while (동일) {
                                if (배열크기[i][j] == 배열크기[b][j]) {
                                    루프횟수++;
                                    if (루프횟수 > 700) { //마지막에 가까운 값이 가로 세로 겹쳐서 무한루프가 도는 경우가 발생하는데 300번이상 루프를 돌면 처음부터 스도쿠를 짜게한다.
                                        continue 두번째루프;
                                    }
                                    continue 첫번째루프;
                                } else {
                                    동일 = false;
                                }
                            }
                            동일 = true;//빠져나오면 다시 초기화
                        }
                        break;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(String.valueOf(배열크기[i][j]).length() == 1) {
                        System.out.print("  "+배열크기[i][j]+" ");
                    }else{
                        System.out.print("  "+배열크기[i][j]);
                    }
                }
                System.out.println();
            }
            break;
        }
        sc.close();

    }
}
