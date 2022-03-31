package 기초2;

import java.util.Random;
import java.util.Scanner;

public class 스도쿠1 {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력 ");
        int n = scanner.nextInt();

        int[][] result = new int[n][n]; //2차원 배열 n크기로 생성

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = 0; //배열 0으로 초기화
            }
        }

        //랜덤상수 n만큼 자연수가들어가게함
        int rand = random.nextInt(n) + 1;
        boolean 같다 = true;
        int 루프횟수 =0;
/*
        long curTime = System.currentTimeMillis();
        *//*System.out.println("시작시간: "+ (curTime / 1000));*/

        두번째루프: while (true) {
            루프횟수=0;//초기화

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int 세로줄 = j; //제이임
                    int 가로줄 = i;    //아이임


                    첫번째루프:while (true) {
                        rand = random.nextInt(n) + 1;
                        result[i][j] = rand;

                        for (int a = 세로줄 - 1; a >= 0; a--) {//a  //기준 왼쪽값들 일치유무검사
                            while (같다 == true) {


                                if (result[i][j] == result[i][a]) {
                                    같다 = true;
                                    continue 첫번째루프;
                                } else {
                                    같다 = false;
                                }
                            }
                            같다 = true;//빠져나오면 다시 초기화
                        }


                        for (int b = 가로줄 - 1; b >= 0; b--) {//b  //기준 위쪽값들 일치유무검사
                            while (같다 == true) {
                                if (result[i][j] == result[b][j]) {
                                    루프횟수++;
                                    if (루프횟수 > 300) { //마지막에 가까운 값이 가로 세로 겹쳐서 무한루프가 도는 경우가 발생하는데 300번이상 루프를 돌면 처음부터 스도쿠를 짜게한다.
                                        continue 두번째루프;
                                    }

                                    같다 = true;
                                    continue 첫번째루프;
                                } else {
                                    같다 = false;
                                }
                            }
                            같다 = true;//빠져나오면 다시 초기화
                        }


                        break;
                    }
                }
            }
            /*long curTime2 = System.currentTimeMillis();
            System.out.println("종료시간: " + (curTime2 / 1000));
            System.out.println("걸린시간: " + ((curTime2 - curTime)/1000));*/

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(String.valueOf(result[i][j]).length() == 1) {
                        System.out.print("  "+result[i][j]+" ");
                    }else{
                        System.out.print("  "+result[i][j]);
                    }
                }
                System.out.println();
            }
            break ;
        }
    }
}
