package 파석6;

public class Monstar extends Character /* implements Runnable*/{
    Monstar(String name , int level , int exp , int maxExp ,int hp ,int maxHp , int ad , int money ){
        this.name = name;
        this.level = level;
        this.exp = exp;
        this.maxExp = maxExp;
        this.ad = ad;
        this.money = money;
        this.hp = hp;
        this.maxHp = maxHp;
    }

    Monstar(){
    }

    public void attack(Monstar monstar){
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ monstar.getName() + " 의 행 동 ! ! ! ! !");
    }



    void stateShow(Monstar monstar){
        if (monstar.getHp() > 0){//몬스터의 체력이 0보다 크다면 상태를 출력한다
            //monstar.miniState(monstar);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t몬스터의 상태");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ monstar.getName() + "의 힘 : " + monstar.getAd() + " 체력 : " + monstar.getHp());
        }
    }

    void death(Monstar monstar){
        Intro 사망 = new Intro("src/BGM/사망.mp3",false);   사망.start();

        if (monstar.getHp() <= 0){//몬스터의 체력이 0보다 작다면 영웅에게 경험치와 돈을 준다
            monstar.setHp(hp = 0);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + monstar.getName() + "이(가) 쓰러졌습니다.");
            System.out.println("[영웅]에게 경험치 + "+monstar.getExp());
            System.out.println("[영웅]에게 돈 + " + monstar.getMoney() + "원");
            System.out.println();
        }

    }

    public void State(Monstar monstar){
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t[몬스터의 상태]");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t이　름 : " + monstar.name + "\t\t\t\t체　력　: " + monstar.hp + "/" + monstar.maxHp);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t레　벨 : " + monstar.level + "\t\t\t\t\t 힘　: " + monstar.ad);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t경험치 : " + monstar.exp + "/" + monstar.maxExp + "\t\t\t\t 돈　: " + monstar.money+ " 원 ");
        System.out.println();
    }

    public void miniState(Monstar monstar){
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t몬스터의 상태");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t이　름 : " + monstar.name + "\t\t\t\t체　력　: " + monstar.hp + "/" + monstar.maxHp);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t레　벨 : " + monstar.level + "\t\t\t\t\t힘　: " + monstar.ad);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t경험치 : " + monstar.exp + "/" + monstar.maxExp + "\t\t\t\t 돈　: " + monstar.money+ " 원 ");
    }

    public void attack(Hero hero){
    }

   /* Monstar monstar;
    Hero hero;
    public Monstar(Monstar monstar, Hero hero) {
        this.monstar = monstar;
        this.hero = hero;
    }

    @Override
    public void run() {
        while (monstar.getHp() > 0) { //몬스터의 체력이 0보다 클 때 몬스터가 영웅을 때린다
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + monstar.getName() + "의 행 동");
            monstar.attack(hero);
            if (hero.getHp() > 0) {     //영웅의 체력이 0보다 클 때 체력을 보시한다
                System.out.println(hero.getName() + "의 남은 체력 : " + hero.getHp() + "\n");
            } else {        //아닐 때 영웅이 죽고 게임을 종료한다
                System.out.println(hero.getName() + "이(가) 쓰러졌습니다.\n");
                System.out.println("게임을 종료합니다.");
                System.exit(0);
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
        }
    }*/


    /*public void attack(Monstar monstar , Hero hero){
        if (monstar.getHp() > 0 ){
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t" + monstar.getName() + "의 공격");
            monstar.attack(hero);
        }
    }*/


    /*public void attack(Monstar monstar , Hero hero){
        if (monstar.getHp() > 0){
            monstar.attack();
            if (hero.getHp() > 0) {
                System.out.println(hero.getName() + "의 남은 체력 : " + hero.getHp() + "\n");
            } else {
                System.out.println(hero.getName() + "이(가) 쓰러졌습니다.\n");
                System.out.println("게임을 종료합니다.");
                System.exit(0);
            }
        }
    }*/


}
