package 파석6;

import java.util.Random;

public class Mon4 extends Mon3 {
    public Mon4(String name , int level , int exp , int maxExp , int hp , int maxHp , int ad , int money ){
        super(name, level, exp, maxExp, hp, maxHp, ad, money);
    }
    Mon4(){}


    public int rockBeat() {
        int attack = this.getAd() * this.getLevel();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ getName() + "의 멈출 수 없는 힘");
        return attack;
    }

    public void rockAnger() {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ getName() + "의 더욱 더 단단하게!!!!!");
        this.setAd(this.getLevel() * 100);
    }

    public void attack(Hero hero) {
        Random rd = new Random();
        int num = rd.nextInt(4) + 1;
        if (num == 1) {
            Intro 바위공격2 = new Intro("src/BGM/바위공격2.mp3",false);   바위공격2.start();

            hero.setHp(hero.getHp() - this.rockBeat());
        } else if (num == 2) {
            Intro 단단 = new Intro("src/BGM/단단.mp3",false);   단단.start();

            this.rockAnger();
        } else if (num == 3) {
            Intro 나무공격2 = new Intro("src/BGM/나무공격2.mp3",false);   나무공격2.start();

            hero.setHp(hero.getHp() - this.treeBeat());
        } else if (num == 4) {
            Intro 회복 = new Intro("src/BGM/회복.mp3",false);   회복.start();

            this.treeHeal();
        }
    }
}
