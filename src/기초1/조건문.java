package 기초1;

import java.util.Scanner;

public class 조건문 {
    public static void main(String[] args) {

        /*
            쇼핑몰 뒤로가기
            1. 남성의류 2. 여성의류 3. 종료
                1. 남성의류
                1) 바지 2) 티셔츠 3)뒤로가기
                3. 여성의류
                1) 치마 2) 블라우스 3) 뒤로가기
         */
        Scanner sc =  new Scanner(System.in);
        int 샵메인 = 1;
        int 입력;
        int 남성옷 = 1;
        int 여성옷 = 1;
        System.out.println("===의류 쇼핑몰====");

        while (샵메인 == 1) {
            System.out.println("1. 남성의류 2. 여성의류 3. 종료");
            System.out.println("쇼핑하고 싶은 번호를 입력하세요");
            입력 = sc.nextInt();

            if (입력 == 1) {
                while (남성옷 == 1) {
                    System.out.println("1. 바지 2. 티셔츠 3. 뒤로가기");
                    입력 = sc.nextInt();

                    if (입력 == 1 ) {
                        System.out.println("바지 구입");
                    } else if (입력 == 2) {
                        System.out.println("티셔츠 구입");
                    } else if (입력 == 3) {
                        남성옷 = 0;
                    }
                }
            } else if (입력 == 2) {
                while (여성옷 == 1) {
                    System.out.println("1. 치마 2. 블라우스 3. 뒤로가기");
                    입력 = sc.nextInt();
                    if (입력 == 1 ) {
                        System.out.println("치마 구입");
                    } else if (입력 == 2) {
                        System.out.println("블라우스 구입");
                    } else if (입력 == 3) {
                        여성옷 = 0;
                    }

                }
            } else {
                샵메인 = 0;
                System.out.println("===쇼핑이 종료되었습니다===");
            }
        }
    }
}

