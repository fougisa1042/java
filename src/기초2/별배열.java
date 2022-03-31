package 기초2;

import java.util.Scanner;

public class 별배열 {//배열
    public static void main(String[] args) {

        System.out.println("숫자를 입력해주세요");
        Scanner sc = new Scanner(System.in);

        int 입력값, 세로, 가로, 센터, 상단, 중단, 하단;
        int a, b ;

        입력값 = sc.nextInt(); //입력 받을 정수

        세로 = 입력값 * 3;  //별 세로 길이

        가로 = 입력값 * 6; //별 가로 길이

        //가로 길이 가 짝수면 가로에에 +1
        if (가로 % 2 == 0) {
            가로 += 1;
        }

        센터 = 가로 / 2; // 가로 중간 지점 생성

        //머리,몸통,다리 종료 위치 지정   비율 1:2:3
        상단 = 세로 / 3;
        중단 = 상단 * 2;
        하단 = 상단 * 3;

       /* 입력한 정수 = " + answer
          총 세로 길이 = " + heigt
          총 가로 길이 = " + width
          가로 중간 지점 = " + center
          상단= " + top
          중간= " + middle
          하단= " + bottom
*/

        char[][] 별 = new char[세로][가로]; //가로 세로 배열 생성

        int 시작점, 끝점, 하단시작점, 하단끝점;

        //별머리
        시작점 = 센터;
        끝점 = 센터;
        for (a = 0; a < 상단; a++) {
            for (b = 0; b < 가로; b++) {
                if (시작점 <= b && b <= 끝점) {
                    별[a][b] = '*';
                }else {
                    별[a][b] = ' ';
                }
            }
            시작점--;
            끝점++;
        }

        //별 몸통
        시작점 = 0;
        끝점 = 가로 - 1;
        for (a = 상단; a < 중단; a++) {
            for (b = 0; b < 가로; b++) {
                if (시작점 <= b && b <= 끝점) {
                    별[a][b] = '*';
                }else {
                    별[a][b] = ' ';
                }
            }

            시작점++;
            끝점--;
        }

        //별 다리
        하단시작점 = 센터;
        하단끝점 = 센터;
        for (a = 중단; a < 하단; a++) {
            for (b = 0; b < 가로; b++) {
                if (하단시작점 <= b && b <= 하단끝점) {
                    별[a][b] = ' ';
                } else {
                    별[a][b] = '*';
                }


                if (시작점 - 1 > b || 끝점 + 1 < b) {
                    별[a][b] = ' ';
                }
            }

            시작점--;
            끝점++;
            하단시작점 -= 4;
            하단끝점 += 4;
        }

        //별 배열
        for (a = 0; a < 세로; a++) {
                for (b = 0; b < 가로; b++) {
                    System.out.print(별[a][b]);
                }
                System.out.println();
            }
        }
    }


