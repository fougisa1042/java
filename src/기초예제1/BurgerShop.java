package 기초예제1;

import java.util.Scanner;

class BurgerShop{

    int cnt1 = 0, cnt2 = 0, cnt3 = 0;
    int menu1 = 3200, menu2 = 4800, menu3 = 6700;

    boolean run = true;

    // 1.메뉴출력
    void showMenu() {
        System.out.println("=== 롯데리아 ===");
        System.out.println("1.치즈버거   : " + menu1);
        System.out.println("2.불고기버거 : " + menu2);
        System.out.println("3.싸이버거   : " + menu3);
        System.out.println("4.계산하기");
        System.out.print("메뉴 선택 : ");
    }
    // 2.1번 메뉴 주문받기
    void orderMenu1() {
        cnt1 = cnt1 + 1;
    }
    // 3.2번 메뉴 주문받기
    void orderMenu2() {
        cnt2 = cnt2 + 1;
    }
    // 4.3번 메뉴 주문받기
    void orderMenu3() {
        cnt3 = cnt3 + 1;
    }
    // 5.계산하기
    void count() {
        int total = cnt1*menu1 + cnt2*menu2 + cnt3*menu3;
        System.out.println("1.치즈버거 : " + cnt1 + "개");
        System.out.println("2.불고기버거 : " + cnt2 + "개");
        System.out.println("3.싸이버거 : " + cnt3 + "개");
        System.out.println("----------------");
        System.out.println("총금액 : " + total);
    }

    void run() {

        Scanner sc = new Scanner(System.in);

        while(run) {

            // 1.메뉴 출력
            showMenu();
            int sel = sc.nextInt();
            if(sel == 1) {
                orderMenu1();
            }
            else if(sel == 2) {
                orderMenu2();
            }
            else if(sel == 3) {
                orderMenu3();
            }
            else if(sel == 4) {
                count();
                run = false;
                sc.close();
            }

        }

    }

}

class Main {
    public static void main(String[] args) {

        BurgerShop bs = new BurgerShop();
        bs.run();

    }

}

