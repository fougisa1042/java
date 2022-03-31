package 파석6;

import java.util.Scanner;

public class Eweapon extends Equipment{
    Scanner scanner = new Scanner(System.in);
    Hero hero;

    String weapon1name = "[천 글러브]";
    int weapon1cost = 100;
    int weapon1upgage = 100;
    int weapon1use = 0;
    int weapon1count = 0;

    String weapon2name = "[나무 글러브]";
    int weapon2cost = 500;
    int weapon2upgage = 500;
    int weapon2use = 0;
    int weapon2count = 0;

    String weapon3name = "[철 글러브]";
    int weapon3cost = 1000;
    int weapon3upgage = 1000;
    int weapon3use = 0;
    int weapon3count = 0;



    Eweapon(String name, int cost, int upGage, int use  , int count ) {
        super(name, cost, upGage, count , use);
    }

    Eweapon(){}

    void weaponBuy() {
        name = "---------------무기---------------";
        System.out.println(name);
        System.out.print("1." + weapon1name + " : " + weapon1cost + " 원");
        System.out.print("\t2." + weapon2name + " : " + weapon2cost + " 원");
        System.out.println("\t3." + weapon3name + " : " + weapon3cost + " 원");
        String number = scanner.nextLine();
        hero.setMoney(hero.getMoney() + 1000);

        switch (number) {
            case "1":
                Intro 돈소리 = new Intro("src/BGM/돈소리.mp3",false);   돈소리.start();

                if (weapon1cost <= hero.getMoney()) {
                    hero.setMoney(hero.getMoney() - weapon1cost);
                    hero.setMaxHp(hero.getMaxHp() + weapon1upgage);
                    System.out.println(weapon1name+"를 구입이 하였습니다");
                    System.out.println("인챈트에 성공하여 최대 체력이 " + weapon1upgage + " 만큼 증가 \n" + "현재 최대 체력 : " + hero.getMaxHp());
                    System.out.println("현재 남은 금액 : " + hero.getMoney()+ "원 ");
                    System.out.println();
                }else {
                    System.out.println("소지금이 부족합니다\n");
                }
                break;
            case "2":
                돈소리 = new Intro("src/BGM/돈소리.mp3",false);   돈소리.start();

                //최대 체력 인챈트 가격보다 돈이 많을 때
                if (weapon2cost <= hero.getMoney()) {
                    hero.setMoney(hero.getMoney() - weapon2cost);
                    hero.setMaxHp(hero.getMaxHp() + weapon2upgage);
                    System.out.println(weapon2name +"를 구입이 하였습니다");
                    System.out.println("인챈트에 성공하여 최대 체력이 " + weapon2upgage + " 만큼 증가 \n" + "현재 최대 체력 : " + hero.getMaxHp());
                    System.out.println("현재 남은 금액 : " + hero.getMoney()+ "원 ");
                    System.out.println();
                }else {
                    System.out.println("소지금이 부족합니다\n");
                }
                break;
            case "3":
                돈소리 = new Intro("src/BGM/돈소리.mp3",false);   돈소리.start();

                //최대 체력 인챈트 가격보다 돈이 많을 때
                if (weapon3cost <= hero.getMoney()) {
                    hero.setMoney(hero.getMoney() - weapon3cost);
                    hero.setMaxHp(hero.getMaxHp() + weapon3upgage);
                    System.out.println(weapon3name +"를 구입이 하였습니다");
                    System.out.println("인챈트에 성공하여 최대 체력이 " + weapon3upgage + " 만큼 증가 \n" + "현재 최대 체력 : " + hero.getMaxHp());
                    System.out.println("현재 남은 금액 : " + hero.getMoney()+ "원 ");
                    System.out.println();
                }else {
                    System.out.println("소지금이 부족합니다\n");
                }
                break;
            default:
                System.out.println("나가기");
                break;
        }
    }


    /*void weaponPay(Hero hero){
        Eweapon eweapon1 = new Eweapon("[천 글러브]", 100, 100, 0 ,0);
        Eweapon eweapon2 = new Eweapon("[나무 글러브]", 500, 500, 0,0);
        Eweapon eweapon3 = new Eweapon("[철 글러브]", 1000, 1000, 0,0);

        name = "---------------무기---------------";
        System.out.println(name);
        System.out.print("1." + eweapon1.name + " : " + eweapon1.cost + " 원");
        System.out.print("\t2." + eweapon2.name + " : " + eweapon2.cost + " 원");
        System.out.println("\t3." + eweapon3.name + " : " + eweapon3.cost + " 원");
        //hero.setMoney(10000);

        String number = scanner.nextLine();
        switch (number) {
            case "1":
                Intro 돈소리 = new Intro("src/BGM/돈소리.mp3",false);   돈소리.start();

                if (eweapon1.cost <= hero.getMoney()) {
                    hero.setMoney(hero.getMoney() - eweapon1.cost);
                    hero.setMaxHp(hero.getMaxHp() + eweapon1.upGage);
                    System.out.println(eweapon1.name+"를 구입이 하였습니다");
                    System.out.println("인챈트에 성공하여 최대 체력이 " + eweapon1.upGage + " 만큼 증가 \n" + "현재 최대 체력 : " + hero.getMaxHp());
                    System.out.println("현재 남은 금액 : " + hero.getMoney()+ "원 ");
                    System.out.println();
                }else {
                    System.out.println("소지금이 부족합니다\n");
                }
                break;
            case "2":
                돈소리 = new Intro("src/BGM/돈소리.mp3",false);   돈소리.start();

                //최대 체력 인챈트 가격보다 돈이 많을 때
                if (eweapon2.cost <= hero.getMoney()) {
                    hero.setMoney(hero.getMoney() - eweapon2.cost);
                    hero.setMaxHp(hero.getMaxHp() + eweapon2.upGage);
                    System.out.println(eweapon2.name+"를 구입이 하였습니다");
                    System.out.println("인챈트에 성공하여 최대 체력이 " + eweapon2.upGage + " 만큼 증가 \n" + "현재 최대 체력 : " + hero.getMaxHp());
                    System.out.println("현재 남은 금액 : " + hero.getMoney()+ "원 ");
                    System.out.println();
                }else {
                    System.out.println("소지금이 부족합니다\n");
                }
                break;
            case "3":
                돈소리 = new Intro("src/BGM/돈소리.mp3",false);   돈소리.start();

                //최대 체력 인챈트 가격보다 돈이 많을 때
                if (eweapon3.cost <= hero.getMoney()) {
                    hero.setMoney(hero.getMoney() - eweapon3.cost);
                    hero.setMaxHp(hero.getMaxHp() + eweapon3.upGage);
                    System.out.println(eweapon3.name+"를 구입이 하였습니다");
                    System.out.println("인챈트에 성공하여 최대 체력이 " + eweapon3.upGage + " 만큼 증가 \n" + "현재 최대 체력 : " + hero.getMaxHp());
                    System.out.println("현재 남은 금액 : " + hero.getMoney()+ "원 ");
                    System.out.println();
                }else {
                    System.out.println("소지금이 부족합니다\n");
                }
                break;
            default:
                System.out.println("나가기");
                break;
        }
    }*/

    /*public static void main(String[] args) {
        Eweapon iweapon = new Eweapon();
        iweapon.weaponPay(iweapon.hero);
    }*/
}
