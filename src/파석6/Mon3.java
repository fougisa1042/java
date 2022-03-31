package 파석6;

import java.util.Random;

//나무
public class Mon3 extends Monstar{
    public Mon3(String name , int level , int exp , int maxExp , int hp , int maxHp , int ad , int money ){
        super(name, level, exp, maxExp, hp, maxHp, ad, money);
    }

     Mon3(){    }

    //공격하기 메소드

    public int treeBeat(){
        int attack = this.getAd() /* * 3*/;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + getName() + "의 덤불 주먹!");
        return attack;
    }

    public void treeHeal(){
        this.setHp(this.getHp() + 100);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ getName() + "의 생명의 힘!!!!!");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ this.getName() + "체력이 " + getLevel() * 100 + " 증가했습니다");
    }

    public void attack(Hero hero){
        Random rd = new Random();
        int num = rd.nextInt(2) + 1 ;
        if (num == 1){
            Intro 나무공격1 = new Intro("src/BGM/나무공격1.mp3",false);   나무공격1.start();

            hero.setHp(hero.getHp() - this.treeBeat());
        }else if (num == 2){
            Intro 회복 = new Intro("src/BGM/회복.mp3",false);   회복.start();

            this.treeHeal();
        }
    }
}
