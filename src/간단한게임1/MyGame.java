package 간단한게임1;


import java.util.Scanner;

public class MyGame {
    Scanner scanner = new Scanner(System.in);


    Character c;

    Item[] items;


    //몬스터는 싸울때마다 만들어줄거다


    MyGame() { //생성자만드는것

        c = new Character(" 가렌 ", 100, 50, 20, 10);

        items = new Item[10];

        items[0] = new Item("무한의 대검", 0, 0, 0, 10);

        items[1] = new Item("가시갑옷", 0, 0, 0, 10);


    }


    public static void main(String[] args) {

        // TODO Auto-generated method stub


        //class 만든 3개로 여기서 만들어야 한다.


        new MyGame().start();


    }


    void start() {


        while (true) {

            System.out.println("1.내정보 \t2.사냥 \t3.종료");

            int input = scanner.nextInt();


            switch (input) {

                case 1:

                    c.showInfo();

                    break;

                case 2:

                    hunt();

                    break;

                case 3:

                    System.out.println(" 종료되었습니다. ");

                    System.exit(0);   //프로그램을 종료시키는 메소드 0은 아무렇게나 넣으면 됨.

                    break;


            }


        }

    }


    void hunt() {

        Monster m = new Monster("고블린", 20, 10, 15, 10, new Item[]{items[0], items[1]}); //아이템은 배열이기때문에

        //배열을 초기화해서 넣어준것.

        System.out.println(m.name + "를 만났습니다. 전투를 시작합니다. ");


        int input = 0;

        battle:
        while (true) {  //battle 은 while 문에 붙인 이름 반복문에 이름을 붙일 수 있다.

            System.out.println("1. 공격\t2. 도망");

            input = scanner.nextInt();

            switch (input) {

                case 1:

                    c.attack(m);

                    //몬스터가 죽어야 하니까 죽는 내용을 만들어줘야한다.,

                    if (m.hp <= 0) {

                        System.out.println(m.name + "을 처치하였습니다.");

                        c.getExp(150);

                        c.getItem(m.itemDrp());

                        break battle; //몬스터가 죽으면 전투를 종료하는것 .

                    }

                    m.attack(c);

                    break;


                case 2:

                    break battle;


            }

        }


    }

}



