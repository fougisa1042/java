package 기초예제1;

import java.util.Scanner;

public class BurgerShop01 {
    Scanner scan = new Scanner(System.in);

    String ShopName = "";		// 가게 이름
    String[] Menu = {"치즈버거", "불고기버거", "감자튀김", "콜라"}; //메뉴 이름
    int[] Price = {    2500,       3800,     1500,  1000};  //메뉴 금액
    int[] Sulag = new int[4];  //수량
    int TotalPrice = 0;  // 총금액
    int InputMoney = 0;  // 넣은 금액
    int money2 = 0; //거스름돈
    int cash = 0; //
    int count = 0; //

    void showMenu() {  //시작 할 때 메뉴와 금액을 보여주는 메소드
        for (int i = 0; i < Menu.length; i++) {
            System.out.print((i + 1) + " " + Menu[i] + " " + Price[i] + " 원  "); //메뉴와 금액들을 배열에 지정해 준대로 열거해준다
        }
        System.out.println();
    }

    void select1() {  // 1을 선택하였을 경우
        Sulag[0] += 1;
    }

    void select2() {
        Sulag[1] += 1;
    }

    void select3() {
        Sulag[2] += 1;
    }

    void select4() {
        Sulag[3] += 1;
    }

    void getReceipt() { //영수증을 보여주는 메소드
        System.out.println("=====영수증=====");
        System.out.println("주문내역: " );
        for (int i = 0; i < Sulag.length; i++) {
            if (Sulag[i] != 0) {
                TotalPrice += Price[i] * Sulag[i];  //총금액 = 음식값 * 수량
                System.out.println("메뉴명: " + Menu[i] + " 수량: " + Sulag[i] +"개" );
            }
        }

        while (true) {
            System.out.println("총 금액: " + TotalPrice + " 원");
            System.out.println("\n지불하실 금액을 입력하세요: ");
            InputMoney = scan.nextInt();  // 넣은 금액 입력
            cash += InputMoney; //
            if (cash > TotalPrice) {
                money2 = InputMoney - TotalPrice;
                break;
            } else if (cash == TotalPrice) {
                money2 = 0;
                break;
            } else if (cash > TotalPrice) {
                System.out.println("지불하신 금액이 부족합니다");
                continue;
            }
        }

        System.out.println("지불하신 총 금액 " + cash +"원");
        System.out.println("거스름돈 " + money2 +"원");
        InputMoney = 0;
        money2 = 0;
        TotalPrice = 0;
        count = 0;

        for (int i = 0; i < Sulag.length; i++) {
            Sulag[i] = 0;
        }
    }

    void run() {
        while (true) {
            showMenu();
            System.out.println("주문하실 메뉴의 번호를 입력하세요  (5.종료 6.결제)");
            int num = scan.nextInt();
            if (num == 1) {
                select1();
            } else if (num == 2) {
                select2();
            } else if (num == 3) {
                select3();
            } else if (num == 4) {
                select4();
            } else if (num == 5) {
                System.out.println("주문을 종료합니다");
                break;
            } else if (num == 6) {
                getReceipt();
            }
        }
    }
}


class Methodex15 {
    public static void main(String[] args) {
        BurgerShop01 moms = new BurgerShop01();
        System.out.println("==================버거머겅==================");
        moms.ShopName = "맘츠터치 햄버거";
        moms.run();
    }
}

