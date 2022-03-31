package 파석6;

import java.util.Scanner;

public class Shop extends Map implements Runnable{
    Thread thread;
    Hero hero;

    String shopName;
    int cost;
    int upGage;
    int count;


    Shop(String shopName , int cost , int upGage ,int count){
        this.shopName = shopName;
        this.cost = cost;
        this.upGage = upGage;
        this.count = count;
    }

    Shop(Thread thread){        //스레드 추가한거
        this.thread = thread;
        thread.start();
    }

    Shop(Hero hero){
        this.hero = hero;
    }

    Scanner scanner = new Scanner(System.in);
    void sell(Hero hero) {
            //Scanner scanner = new Scanner(System.in);
            Shop adEnhance = new Shop("[공격력 인챈트]" , 100 , 100,0);
            Shop maxHpEnhance = new Shop("[최대 체력 인챈트]" , 100 , 100,0);
            Shop hpPotion = new Shop("[체력 물약]" , 100 , 100,0);
            Shop expPotion = new Shop("[경험치 물약]" , 100 , 100,0);

        shopName = "---------------상점---------------";
        System.out.println(shopName + "[소지금] : " + hero.getMoney() + "원");
        System.out.println("1." + adEnhance.shopName + " : " + adEnhance.cost + " 원");
        System.out.println("2." + maxHpEnhance.shopName + " : " + maxHpEnhance.cost + " 원");
        System.out.println("3." + hpPotion.shopName + " : " + hpPotion.cost + " 원");
        System.out.println("4." + expPotion.shopName + " : " + expPotion.cost + " 원");
        System.out.println("5. 뒤로가기");

        String number = scanner.nextLine();

        if (number.equals("1")) {
            //힘 인챈트 가격보다 돈이 많을 때
            if (adEnhance.cost <= hero.getMoney()) {
                Intro 돈소리 = new Intro("src/BGM/돈소리.mp3",false);   돈소리.start();

                hero.setMoney(hero.getMoney() - adEnhance.cost);
                hero.setAd(hero.getAd()+ adEnhance.upGage);
                System.out.println(adEnhance.shopName+"를 구입이 하였습니다");
                System.out.println("인챈트에 성공하여 공격력이 " + adEnhance.upGage + " 만큼 증가 \n" + "현재 공격력 : " + hero.getAd());
                System.out.println("현재 남은 금액 : " + hero.getMoney() + "원 ");
                System.out.println();
            }else {
                System.out.println("소지금이 부족합니다\n");
            }
        }

        else if (number.equals("2")) {
            Intro 돈소리 = new Intro("src/BGM/돈소리.mp3",false);   돈소리.start();

            //최대 체력 인챈트 가격보다 돈이 많을 때
            if (maxHpEnhance.cost <= hero.getMoney()) {
                hero.setMoney(hero.getMoney() - maxHpEnhance.cost);
                hero.setMaxHp(hero.getMaxHp() + maxHpEnhance.upGage);
                System.out.println(maxHpEnhance.shopName+"를 구입이 하였습니다");
                System.out.println("인챈트에 성공하여 최대 체력이 " + maxHpEnhance.upGage + " 만큼 증가 \n" + "현재 최대 체력 : " + hero.getMaxHp());
                System.out.println("현재 남은 금액 : " + hero.getMoney()+ "원 ");
                System.out.println();
            }else {
                System.out.println("소지금이 부족합니다\n");
            }
        }

        else if (number.equals("3")) {
            Intro 돈소리 = new Intro("src/BGM/돈소리.mp3",false);   돈소리.start();

            //체력 포션 가격보다 돈이 많을 때
            if (hpPotion.cost <= hero.getMoney()) {
                hero.setMoney(hero.getMoney() - hpPotion.cost);
                hero.setHp(hero.getHp()+ hpPotion.upGage);
                System.out.println(hpPotion.shopName+"를 구입이 하였습니다");
                System.out.println("체력이 " + hpPotion.upGage + " 만큼 증가 \n" + "현재 체력 : " + hero.getHp());
                System.out.println("현재 남은 금액 : " + hero.getMoney()+ "원 ");
                System.out.println();
            }else {
                System.out.println("소지금이 부족합니다\n");
            }
        }

        else if (number.equals("4")) {
            Intro 돈소리 = new Intro("src/BGM/돈소리.mp3",false);   돈소리.start();

            //경험치 포션 가격보다 돈이 많을 때
            if (expPotion.cost <= hero.getMoney()) {
                hero.setMoney(hero.getMoney() - expPotion.cost);
                hero.setExp(hero.getExp()+ expPotion.upGage);
                System.out.println(expPotion.shopName+"를 구입이 하였습니다");
                System.out.println("경험치가 " + expPotion.upGage + " 만큼 증가 \n" +"현재 경험치 : " + hero.getExp());
                System.out.println("현재 남은 금액 : " + hero.getMoney()+ "원 ");
                System.out.println();
            }else {
                System.out.println("소지금이 부족합니다\n");
            }
        }else if (number.equals("5")){
            Intro 문열기 = new Intro("src/BGM/문열기.mp3",false);   문열기.start();

            System.out.println("(끼익... 철컥)\n");
        }

        else {
            Intro 문열기 = new Intro("src/BGM/문열기.mp3",false);   문열기.start();

            System.out.println("제대로 입력하지 않거면 나가");
        }

        thread.interrupt();
        //System.out.println("나가짐");
    }

    @Override
    public void run() {
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
    }



    /*   while (!Thread.currentThread().isInterrupted()) {  //현재 진행하는 스레드가 멈추지 않는다면
            hero.setHp(hero.getHp() + 10);
            hero.setAd(hero.getAd() + 10);
            hero.setMaxHp(hero.getMaxHp() + 10);
            //System.out.println();
            hero.stateShow(hero);

            try {       //만약 입력을 받으면 3초후 슬립이 걸린다
                System.out.println("트라이");
                if (number.equals("1") || number.equals("2") || number.equals("3") || number.equals("4")
                    || number.equals("5") || number.equals("6") || number.equals("7")){
                    System.out.println("안에 있는 스레드 실행");
                    Thread.sleep(1000);
                }
                //Thread.currentThread().interrupt();
                System.out.println("나가짐");

            } catch (InterruptedException e) {      //캐치의 인터럽트가 실행되어 와일문의 코드가 꺼지게 된다

            }
        }*/

     /* try {       //만약 입력을 받으면 3초후 슬립이 걸린다
                System.out.println("트라이");
                if (number.equals("1") || number.equals("2") || number.equals("3") || number.equals("4")
                    || number.equals("5") || number.equals("6") || number.equals("7")){
                    System.out.println("안에 있는 스레드 실행");
                }
                Thread.sleep(1000);
                //Thread.currentThread().interrupt();
                System.out.println("나가짐");

            } catch (InterruptedException e) {      //캐치의 인터럽트가 실행되어 와일문의 코드가 꺼지게 된다

            }*/

    /*
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {  //현재 진행하는 스레드가 멈추지 않는다면
            hero.setHp(hero.getHp() + 10);
            hero.setAd(hero.getAd() + 10);
            hero.setMaxHp(hero.getMaxHp() + 10);
            //System.out.println();
           hero.stateShow(hero);

            try {                           //만약 입력을 받으면 3초후 슬립이 걸린다
                if (number.equals(number)){
                    Thread.sleep(3000);
                    System.out.println(number);
                    Thread.interrupted();
                }
            } catch (InterruptedException e) {      //캐치의 인터럽트가 실행되어 와일문의 코드가 꺼지게 된다
            }
        }

    }*/
}
