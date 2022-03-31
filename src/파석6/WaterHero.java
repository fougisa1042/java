package 파석6;

import java.util.Scanner;

public class WaterHero extends Hero {

    public WaterHero(String name , int level , int exp , int maxExp ,int hp ,int maxHp , int ad , int money ) {
        super(name, level, exp, maxExp, hp, maxHp, ad, money);
    }
    public WaterHero(){}

    public int beat() {
        return this.getAd() * this.getLevel();
    }//렙 오르면 쌔지는 공격

    public int waterBeat() {
        System.out.println("물렁 박치기!!!");
        return this.getAd() * 2;
    } //초반에 썐 스킬

    public void attack(Monstar monstar) {
        System.out.println(this.getName() + "의 행동을 선택해주세요");
        System.out.println("1. 몸통 박치기 2. 물렁 박치기 3. 가방열기 4. 도망가기 "); /*3. 가방(미구) 4. 도망가기(미구)*/
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==1){
            Intro 공격2 = new Intro("src/BGM/공격2.mp3",false);   공격2.start();

            System.out.println(this.getName() +"의 몸통 박치기!!!");
            monstar.setHp(monstar.getHp()-this.beat());
        }
        else if(num==2){
            Intro 스킬1 = new Intro("src/BGM/스킬1.mp3",false);   스킬1.start();
            System.out.println(this.getName() +"의 물렁 박치기!!!");
            monstar.setHp(monstar.getHp()-this.waterBeat());
        }else if (num == 3 ){
            /*backpack;*/
        } else if (num ==4){
            run();
        } else {
            System.out.println("다시 입력해주세요");
        }
    }
}
