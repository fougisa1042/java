package 파석6;

public class Hero extends Character {


    /*private int maxExpUp;*/

    int [] stage = new int[100];


    public Hero(String name , int level , int exp , int maxExp ,int hp ,int maxHp , int ad , int money ) {
        this.name = name;
        this.level = level;
        this.exp = exp;
        this.maxExp = maxExp;
        this.ad = ad;
        this.money = money;
        this.hp = hp;
        this.maxHp = maxHp;
    }
    Hero(){}

    public void attack(Hero hero){
        System.out.println(hero.getName() + " 의 공 격 ! ! ! ! !");
    }

    void stateShow(Hero hero){
        if (hero.getHp() > 0) {//영웅의 체력이 0보다 크다면 상타를 출력한다
            //hero.miniState(hero);
            System.out.println("영웅의 상태");
            System.out.println(hero.getName() + "의 힘 : " + hero.getAd() + " 체력 : " + hero.getHp() + "\n");
        }
    }

    void death(Hero hero){
        Intro 사망 = new Intro("src/BGM/사망.mp3",false);   사망.start();
        if (hero.getHp() <= 0) {//영웅의 체력이 0보다 작다면 죽는다
            System.out.println(hero.getName() + "은 쓰러졌습니다.\n");
            System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
                               "████▌▄▌▄▐▐▌█████\n" +
                               "████▌▄▌▄▐▐▌▀████\n" +
                               "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀\n");
            /*hero.setHp(hp = 0);
            hero.miniState(hero);*/
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.exit(0);
        }
    }

    public void State(Hero hero){
        System.out.println();
        System.out.println("\t[영웅의 상태]");
        System.out.println("\t이　름 : " + hero.name + "\t\t\t\t체　력　: " + hero.hp + "/" + hero.maxHp);
        System.out.println("\t레　벨 : " + hero.level + "\t\t\t\t\t 힘　: " + hero.ad);
        System.out.println("\t경험치 : " + hero.exp + "/" + hero.maxExp + "\t\t\t\t 돈　: " + hero.money + " 원 ");
        System.out.println();
    }
    public void miniState(Hero hero){
        System.out.println("[영웅의 상태]");
        System.out.println("이　름 : " + hero.name + "\t\t체　력　: " + hero.hp + "/" + hero.maxHp);
        System.out.println("레　벨 : " + hero.level + "\t\t\t힘　: " + hero.ad);
        System.out.println("경험치 : " + hero.exp + "/" + hero.maxExp + "\t\t 돈　: " + hero.money + " 원 ");
    }


    public int beat() throws InterruptedException {
        Thread.sleep(3000);
        return 0;
    }
    public int waterBeat(){
        return 0;
    }
    public int fireBeat(){
        return 0 ;
    }
    public void attack(Monstar monstar){
    }



    public void levelUp(Hero hero){
        if (getExp() >= getMaxExp()){
            Intro 레벨업 = new Intro("src/BGM/레벨업.mp3",false);    레벨업.start();

            int level;
            level = getLevel();
            level++;
            setLevel(level);
            setExp(0);
            setMaxExp(getMaxExp() * getLevel());

            setMaxHp(getMaxHp() + 500);
            setHp(getHp() + 500);
            //setHp(getMaxHp());
            setAd(getAd() + 500);
            setMoney(getMoney() + 500);
            System.out.println("🔼🔼🔼🔼🔼🔼🔼🔼🔼🔼🔼[레벨 업]🔼🔼🔼🔼🔼🔼🔼🔼🔼🔼🔼" );
            System.out.println("각종 능력치가 올라갔습니다");
           /* System.out.println("이　름 : " + hero.name + "\t\t체　력　: " + hero.hp + "/" + hero.maxHp);
            System.out.println("레　벨 : " + hero.level + "\t\t\t힘　: " + hero.ad);
            System.out.println("경험치 : " + hero.exp + "/" + hero.maxExp + "\t\t 돈　: " + hero.money + " 원 ");*/
            System.out.println("다음 레벨업까지 " + getMaxExp() + " 남았습니다");
            System.out.println();

            if (getLevel() == 3){
                setName("든든한 " + getName());
                System.out.println("껍질이 두꺼워지며 든든해졌다 거위알도 깰 수 있는 느낌이 든다");
            }/*else if (getLevel() <= 5){
                setName("다이아  " + getName());
                System.out.println("세상에서 가장 단단합니다 너무도 강합니다");
            }*/

        }
    }

    public boolean run() {
        if (Math.random() <= 0.3){
            Intro 도망 = new Intro("src/BGM/도망.mp3",false);   도망.start();

            System.out.println("도망 성공");
            return true;
        }

        else {
            Intro 도망실패 = new Intro("src/BGM/놉.mp3",false);  도망실패.start();

            System.out.println("도망에 실패하였습니다");
            return false;
        }
    }

    /*public void drink(Hero hero) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        System.out.println("포션을 마십니다.");
        if (num.equals("1")) {
            if (Potion1.count >= 1) {
                Potion1.count -= 1;
                hero.hp+= Potion1.upGage;
            }

            }else if (num.equals("2")){
                if (Potion2.count >= 1){
                    Potion2.count -= 1;
                    hero.exp += Potion2.upGage;
                }
            }else{
            System.out.println("포션이 없습니다");
        }
    }*/
}
