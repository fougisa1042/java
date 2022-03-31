package 파석6;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopD extends Map /*implements Runnable*/ {

    Scanner scanner = new Scanner(System.in);

    Thread thread;
    Hero hero;

    ShopD(){}

    ShopD(Thread thread) {        //스레드 추가한거
        this.thread = thread;
        thread.start();
    }

    ShopD(Hero hero) {
        this.hero = hero;
    }


    ArrayList<String> 가방 = new ArrayList<>();
    ArrayList<String> 장비 = new ArrayList<>();
    ArrayList<String> 무기 = new ArrayList<>();
    ArrayList<String> 갑옷 = new ArrayList<>();
    ArrayList<String> 악세 = new ArrayList<>();
    ArrayList<String> 포션 = new ArrayList<>();
    ArrayList<String> 소지품 = new ArrayList<>();

    void sell(Hero hero) {
        Eweapon weapon = new Eweapon();
        Earmor armor = new Earmor();
        Eaccess access = new Eaccess();

        Ipotion potion = new Ipotion();
        Ietc etc = new Ietc();


        while(true) {
            hero.setMoney(hero.getMoney() + 1000);
            System.out.println(hero.getMoney());
            System.out.println();
            System.out.println("[상점]");
            System.out.println("1. 장비 2. 포션 3. 아이템 4. 인벤보기");
            String number = scanner.nextLine();

            switch (number) {
                case "1":
                    System.out.println("[장비]");
                    System.out.println("1. 무기 2. 갑옷 3. 악세 4. 나가기 ");
                    number = scanner.nextLine();
                    switch (number) {
                        case "1":
                            System.out.println("[무기]");
                            weapon.weaponBuy();
                            무기.add("왕 무기");
                            break;

                        case "2":
                            System.out.println("[갑옷]");
                            armor.armorShow();
                            number = scanner.nextLine();
                            switch (number) {
                                case "1":
                                    갑옷.add("왕 갑옷");
                                    break;
                                case "2":
                                    갑옷.add("중간 갑옷");
                                    break;
                                case "3":
                                    갑옷.add("소 갑옷");
                                    break;
                                default:
                                    System.out.println("나가기");
                                    break;
                            }
                            break;

                        case "3":
                            System.out.println("[악세]");
                            access.accessShow();
                            number = scanner.nextLine();
                            switch (number) {
                                case "1":
                                    악세.add("왕 악세");
                                    break;
                                case "2":
                                    악세.add("중간 악세");
                                    break;
                                case "3":
                                    악세.add("소 악세");
                                    break;
                                default:
                                    System.out.println("나가기");
                                    break;
                            }
                            break;

                        default:
                            System.out.println("나가기");
                            break;
                    }
                    break;

                case "2":
                    System.out.println("[포션]");
                    potion.potionShow();
                    number = scanner.nextLine();
                    switch (number) {
                        case "1":
                            포션.add("왕 포션");
                            break;
                        case "2":
                            포션.add("중간 포션");
                            break;
                        case "3":
                            포션.add("경험치 포션");
                            break;
                        default:
                            System.out.println("나가기");
                            break;
                    }
                    break;

                case "3":
                    System.out.println("[아이템]");
                    etc.etcShow();
                    number = scanner.nextLine();
                    switch (number) {
                        case "1":
                            소지품.add("복조리");
                            break;
                        case "2":
                            소지품.add(" 메추리 폭탄");
                            break;
                        case "3":
                            소지품.add("거위알 폭탄");
                            break;
                        default:
                            System.out.println("나가기");
                            break;
                    }
                    break;

                case "4" :
                    System.out.println("[인벤토리]");
                    System.out.println("장비 착용 상태 " );
                    System.out.println("무기 : " + 무기);
                    System.out.println("갑옷 : " + 갑옷);
                    System.out.println("악세 : " + 악세);
                    System.out.println("[아이템]");
                    System.out.println("포션 : " + 포션 );
                    System.out.println("소지품 : " + 소지품);
                    System.out.println("[가방] : " + 가방);
                    System.out.println();


                default:
                    System.out.println("나가기");
                    break;
            }
        }

        /*System.out.println("인벤토리보기");
        String number = scanner.nextLine();
        switch(number){
            case  "1" :
                System.out.println("[인벤토리]");
                System.out.println("장비 착용 상태 " );
                System.out.println("무기 : " + 무기);
                System.out.println("갑옷 : " + 갑옷);
                System.out.println("악세 : " + 악세);
                System.out.println("[아이템]");
                System.out.println("포션 : " + 포션 );
                System.out.println("소지품 : " + 소지품);
                System.out.println("[가방] : " + 가방);
                break;

            default:
                break;
        }*/


        /*@Override
        public void run () {
            while (!Thread.currentThread().isInterrupted()) {  //현재 진행하는 스레드가 멈추지 않는다면
                hero.setHp(hero.getHp() + 10);
                hero.setAd(hero.getAd() + 10);
                hero.setMaxHp(hero.getMaxHp() + 10);
                //System.out.println();
                //hero.stateShow(hero);

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread.currentThread().isInterrupted();
                    break;
                }
            }
        }*/

    }


}


class zzz{
    public static void main(String[] args) {
        Hero hero = new Hero();
        ShopD shopD = new ShopD();
        shopD.sell(hero);
    }
}
