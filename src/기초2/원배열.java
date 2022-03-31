package 기초2;

import java.util.Scanner;

public class 원배열 {
    public static void main(String[] args) {
        System.out.println("숫자를 입력해주세요");
        Scanner scanner = new Scanner(System.in);

        int answer;     //입력받은 정수
        int heigt;      //총 가로 길이
        int width;      //총 가로 길이
        int top;        //상단
        int radius;     //반지름

        answer = scanner.nextInt();         //입력받은 정수 저장

        heigt = answer * 18;        //총 세로 길이 생성
        width = answer * 48;        //총 가로 길이 생성
        top = heigt  / 2;         //상단,하단 종료 위치 지정
        radius = heigt / 2 + 1;     //반지름

        /*System.out.println("입력한 정수 : " + answer);
        System.out.println("총 세로 길이 : " + heigt);
        System.out.println("총 가로 길이 : " + width);
        System.out.println("상단 : " + top);
        System.out.println("반지름 : " + radius);*/

        char [][] star = new char[heigt][width];

        int start = 0;
        int end = 0;

        for (int a = top; a > 0; a--) {
            int bLine = (int) Math.round(Math.sqrt(Math.pow(radius - 1, 2) - Math.pow(a, 2)));       //피타고라스 공식
            bLine = (bLine + 1) * 2;

            //System.out.println(a+"행의 길이는 " + bLine + "입니다");

            int realRow = Math.abs(a - top);
            start = (width / 2) - bLine;
            end = ((width / 2) - 1) + bLine;

           // System.out.println("시작 : " + start + "/ 종료 : " + end);

            //배열에 원 상단 입력
            for (int b = 0; b < width; b++) {
                if (start <= b && b < end) {
                    star[realRow][b] = '*';
                } else {
                    star[realRow][b] = ' ';
                }
            }
        }

            //원 상단 출력
            for (int a = 0; a < top; a++ ){
                for (int b = 0; b < width; b++){
                    System.out.print(star[a][b]);
                }
                System.out.println();
            }

            //원 하단 출력( 상단을 반전해서 출력
            for(int a = top - 1; a >= 0; a--){
                for (int b = 0; b < width; b++){
                    System.out.print(star[a][b]);
                }
                System.out.println();
            }



    }
}
