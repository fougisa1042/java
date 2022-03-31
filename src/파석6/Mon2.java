package 파석6;

import java.util.Random;

//거위알
public class Mon2 extends Monstar {
    public Mon2(String name, int level, int exp, int maxExp, int hp, int maxHp, int ad, int money) {
        super(name, level, exp, maxExp, hp, maxHp, ad, money);
    }
    Mon2(){}

    //공격하기 메소드
    public int GooseBeat() {
        int attack = this.getAd() * 2;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 재채기!");
        return attack;
    }

    public int GooseBeater() {
        int attack = 0;
        Random rd = new Random();
        int rand = rd.nextInt(2) + 1;
        if (rand == 2) {
            attack = (int) ((this.getAd() + this.getLevel()) * 2.5);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + getName() + "의 재채기보다 더 쌔버린 생채기!");
        } else {
            Intro 빗나감 = new Intro("src/BGM/빗나감.mp3",false);   빗나감.start();

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + getName() + "의 공격이 빗나갔습니다");
        }
        return attack;
    }

    public void attack(Hero hero) {
        Random rd = new Random();
        int num = rd.nextInt(2) + 1;
        if (num == 1) {
            Intro 공격4 = new Intro("src/BGM/공격4.mp3",false);   공격4.start();

            hero.setHp(hero.getHp() - this.GooseBeater());
        } else if (num == 2) {
            Intro 공격5 = new Intro("src/BGM/공격5.mp3",false);   공격5.start();

            hero.setHp(hero.getHp() - this.GooseBeat());
        }
    }



}
