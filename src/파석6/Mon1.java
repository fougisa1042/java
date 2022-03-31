package 파석6;

import java.util.Random;

//메추리
public class Mon1 extends Monstar {
    public Mon1(String name, int level, int exp, int maxExp, int hp, int maxHp, int ad, int money) {
        super(name, level, exp, maxExp, hp, maxHp, ad, money);
    }
    Mon1(){}

    public int QauilBeat() {
        int attack = this.getAd() * this.getLevel();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + getName() + "의 그냥 박치기");
        return attack;
    }

    public int QauilBeater() {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + getName() + "의 머리 쌔게 박아서 박아버리기!!!");
        int QauilBeaterUp = 0;
        Random rd = new Random();
        int rand = rd.nextInt(10) + 1;
        if (rand < 3) {
            QauilBeaterUp = getAd() * 2;
        } else {
            QauilBeaterUp = this.getAd();
        }
        return QauilBeaterUp;
    }

    public void attack(Hero hero) {
        Random rd = new Random();
        int num = rd.nextInt(2) + 1;
        if (num == 1) {
            Intro 공격2 = new Intro("src/BGM/공격2.mp3",false);   공격2.start();

            hero.setHp(hero.getHp() - this.QauilBeat());
        } else if (num == 2) {
            Intro 공격4 = new Intro("src/BGM/공격4.mp3",false);   공격4.start();

            hero.setHp(hero.getHp() - this.QauilBeater());
        }
    }

    /*public void attack(Qauil qauil , Hero hero){
        if (qauil.getHp() > 0) {
            System.out.println("\n" + qauil.getName() + "의 공격");
            qauil.attack(hero);
        }
    }*/
}
