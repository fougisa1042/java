package 파석6;
import java.util.Scanner;

public class Break6D {
    public static void main(String[] args) throws InterruptedException {
        //2 . 캐릭터 이름 입력 후 속성 선택
        Intro 인트로 = new Intro("src/BGM/공격1.mp3", false);
        인트로.start();
        Scanner scanner = new Scanner(System.in);
        Hero hero = new Hero();
         /* Eweapon iweapon = new Eweapon();
        iweapon.weaponBuy();*/

        /*ShopD shopD = new ShopD();
        shopD.sell(hero);*/

        System.out.println
                ("""
                        ______ ______  _____   ___   _   __        ______  _____  _____  _   __
                        | ___ \\| ___ \\|  ___| / _ \\ | | / /         | ___ \\|  _  |/  __ \\| | / /
                        | |_/ /| |_/ /| |__  / /_\\ \\| |/ /           | |_/ /| | | || /  \\/| |/ /\s
                        | ___ \\|    / |  __| |  _  ||    \\         |    / | | | || |    |    \\\s
                        | |_/ /| |\\ \\ | |___ | | | || |\\  \\          | |\\ \\ \\ \\_/ /| \\__/\\| |\\  \\
                        \\____/ \\_| \\_|\\____/ \\_| |_/\\_| \\_/        \\_| \\_| \\___/  \\____/\\_| \\_/""");

        System.out.println("BREAK ROCK\n");
        System.out.println("\t  마을이 위급한 상황입니다  몬스터를 무찌르고 마을을 구해주세요");
        System.out.println("❗❗❗❗❗❗마을이 위급한 상황입니다  몬스터를 무찌르고 마을을 구해주세요❗❗❗❗❗❗");
        System.out.println("\t  마을이 위급한 상황입니다  몬스터를 무찌르고 마을을 구해주세요\n");

        System.out.println("----------[캐릭터의 이름을 정해주세요]----------");
        String name = scanner.nextLine();
        hero.setName(name);
        System.out.println(hero.getName() + "님 반갑습니다 계란 마을을 구원해 주십시오\n");

        System.out.print("Loading");
        for (int i = 0; i < 30; i++) {
            System.out.print("-▶");
            Thread.sleep(25);
        }

        while (true) {
            System.out.println("\n\n----------[타입을 선택하세요]----------");
            System.out.println("1.화란 2.수란 3.캐릭터 상태보기");
            String type = scanner.nextLine();
            if (type.equals("1")) {
                System.out.println("화란을 선택하였습니다\n");
                hero = new FireHero("[화란]", 1, 0, 100, 100, 100, 100, 100);
                break;
            } else if (type.equals("2")) {
                System.out.println("수란을 선택하였습니다\n");
                hero = new WaterHero("[수란]", 1, 0, 50, 900, 900, 900, 900);
                break;
            } else if (type.equals("3")){
                System.out.println("----------[캐릭터 상태 보기]----------");
                hero = new FireHero("[화란]", 1, 0, 100, 100, 100, 100, 100);
                hero.miniState(hero);
                System.out.println();
                hero = new WaterHero("[수란]", 1, 0, 50, 900, 900, 900, 900);
                hero.miniState(hero);
            }
        }

        Time time = new Time();
        time.start();

        Monstar monstar = new Mon1("[10]", 10, 10, 10, 10, 10, 10, 10);
        Timeshow timeshow = new Timeshow(monstar);
        timeshow.start();

        //3. 이동 경로 선택하기
        while (true) {
            System.out.println("----------[화면 선택]----------");
            System.out.println("1. 상태보기 2.전장으로 3. 상점으로 4.스토리 0. 종료하기 ");
            String number = scanner.nextLine();

            //1. 상태보기
            if (number.equals("1")) {
                hero.setName("["+name+"]");
                hero.State(hero);

                //2. 전장으로
            } else if (number.equals("2")) {
                System.out.println("----------[전장선택]----------");
                System.out.println("1.메추리 2.거위알 3. 나무 4. 바위");
                number = scanner.nextLine();


                //메추리
                if (number.equals("1")) {
                    monstar = new Mon1("[메추리]", 1, 10, 10, 1000, 1000, 10, 10);

                    System.out.println("! ! ! ! ! 지 금 바 로 " + monstar.name + " 와 의 전 투 가 시 작 됩 니 다 ! ! ! ! !");
                    timeshow = new Timeshow(monstar);
                    timeshow.start();

                    //메추리와 전투 구현

                    hero.State(hero);
                    monstar.State(monstar);

                    Thread thread = new Thread(new MonThreadR(monstar , hero));
                    thread.start();

                    while (monstar.getHp() > 0 && hero.getHp() > 0 ) {//몬스터의 체력과 영웅의 체력이 0보다 클때 전투가 시작된다 상태를 보여주고 영웅이 떄리고 몬스터가 때린다
                            hero.attack(monstar);
                            monstar.attack(hero);
                            hero.stateShow(hero);
                            monstar.stateShow(monstar);
                    }
                    if (monstar.getHp() <= 0){//몬스터의 체력이 0보다 작다면 영웅에게 경험치와 돈을 준다
                        monstar.death(monstar);
                        hero.setExp(hero.getExp() + monstar.getExp());
                        hero.levelUp(hero);
                        hero.setMoney(hero.getMoney() + monstar.getMoney());
                        hero.stage[0] = 1; //메추리를 깨게 되면 백팩은 0에서 1이 된다

                    }else if (hero.getHp() <= 0){       //영웅의 체력이 0보다 작을 때 죽음
                        hero.death(hero);
                        break;
                    }
                }

                //거위
                else if (number.equals("2")) {
                    monstar = new Mon2("[거위]",2,20,200,2000,2000,20,200) ;

                    if (hero.stage[0] != 1) {//영웅의 백팩은 0이라면 1과 같지 않고 이코드를 넘어가게 된다
                        System.out.println("[메추리]를 쓰러뜨려야 입장 가능!\n");
                        continue;
                    }

                    인트로.close();
                    인트로 = new Intro("src/BGM/거위음악.mp3", true);
                    인트로.start();

                    System.out.println("! ! ! ! ! 지 금 바 로 " + monstar.name + " 와 의 전 투 가 시 작 됩 니 다 ! ! ! ! !");
                    timeshow = new Timeshow(monstar);
                    timeshow.start();

                    //거위와 전투 구현
                    hero.State(hero);
                    monstar.State(monstar);

                    Thread thread = new Thread(new MonThreadR(monstar , hero)); //전투 쓰레드 러너블
                    thread.start();

                    while (monstar.getHp() > 0 && hero.getHp() > 0 ) {//몬스터의 체력과 영웅의 체력이 0보다 클때 전투가 시작된다 상태를 보여주고 영웅이 떄리고 몬스터가 때린다
                        hero.attack(monstar);
                        monstar.attack(hero);
                        hero.stateShow(hero);
                        monstar.stateShow(monstar);
                    }
                    if (monstar.getHp() <= 0){//몬스터의 체력이 0보다 작다면 영웅에게 경험치와 돈을 준다
                        monstar.death(monstar);
                        hero.setExp(hero.getExp() + monstar.getExp());
                        hero.levelUp(hero);
                        hero.setMoney(hero.getMoney() + monstar.getMoney());
                        hero.stage[1] = 2;

                    }else if (hero.getHp() <= 0){//영웅의 체력이 0보다 작을 때 죽음
                        hero.death(hero);
                    }
                }


                //나무
                else if (number.equals("3")){
                    monstar = new Mon3("[나무]",3,30,300,3000,3000,300,300) ;

                    if (hero.stage[0] != 1 || hero.stage[1] != 2) {//영웅의 백팩은 0 또는 1이며 2와 같지 않다
                        System.out.println("[거위]를 쓰러뜨려야 입장 가능!\n");
                        continue;
                    }


                    인트로.close();
                    인트로 = new Intro("src/BGM/나무음악.mp3", true);
                    인트로.start();

                    System.out.println("! ! ! ! ! 지 금 바 로 " + monstar.name + " 와 의 전 투 가 시 작 됩 니 다 ! ! ! ! !");
                    timeshow = new Timeshow(monstar);
                    timeshow.start();

                    //나무와 전투 구현
                    hero.State(hero);
                    monstar.State(monstar);

                    Thread thread = new Thread(new MonThreadR(monstar , hero));
                    thread.start();

                    while (monstar.getHp() > 0 && hero.getHp() > 0 ) {//몬스터의 체력과 영웅의 체력이 0보다 클때 전투가 시작된다 상태를 보여주고 영웅이 떄리고 몬스터가 때린다
                        hero.attack(monstar);
                        monstar.attack(hero);
                        hero.stateShow(hero);
                        monstar.stateShow(monstar);
                    }
                    if (monstar.getHp() <= 0){//몬스터의 체력이 0보다 작다면 영웅에게 경험치와 돈을 준다
                        monstar.death(monstar);
                        hero.setExp(hero.getExp() + monstar.getExp());
                        hero.levelUp(hero);
                        hero.setMoney(hero.getMoney() + monstar.getMoney());
                        hero.stage[2] = 3;

                    }else if (hero.getHp() <= 0){//영웅의 체력이 0보다 작을 때 죽음
                        hero.death(hero);
                    }
                }

                //바위
                else if (number.equals("4")){
                    monstar = new Mon4("[바위]",5,500,500,5000,5000,500,500) ;
                    if (hero.stage[0] != 1 || hero.stage[1] != 2 || hero.stage[2] != 3) {//영웅의 백팩은 0 또는 1이며 2와 같지 않다
                        System.out.println("[나무]를 쓰러뜨려야 입장 가능!\n");
                        continue;
                    }
                    Thread thread = new Thread(new MonThreadR(monstar , hero));
                    thread.start();

                    인트로.close();
                    인트로 = new Intro("src/BGM/바위음악.mp3", true);
                    인트로.start();
                    System.out.println("! ! ! ! ! 지 금 바 로 " + monstar.name + " 와 의 전 투 가 시 작 됩 니 다 ! ! ! ! !");
                    timeshow = new Timeshow(monstar);
                    timeshow.start();

                    //바위와의 전투
                    hero.State(hero);
                    monstar.State(monstar);

                    while (monstar.getHp() > 0 && hero.getHp() > 0 ) {//몬스터의 체력과 영웅의 체력이 0보다 클때 전투가 시작된다 상태를 보여주고 영웅이 떄리고 몬스터가 때린다
                        hero.attack(monstar);
                        monstar.attack(hero);
                        hero.stateShow(hero);
                        monstar.stateShow(monstar);
                    }
                    if (monstar.getHp() <= 0){//몬스터의 체력이 0보다 작다면 영웅에게 경험치와 돈을 준다
                        monstar.death(monstar);
                        hero.setExp(hero.getExp() + monstar.getExp());
                        hero.levelUp(hero);
                        hero.setMoney(hero.getMoney() + monstar.getMoney());
                        hero.stage[3] = 4;

                        System.out.println("\n[축하합니다 바위를 부수고 마을을 구했습니다] \n");
                        System.out.println("{😎축하합니다 바위를 부수고 마을을 구했습니다😎} \n");
                        System.out.println("[축하합니다 바위를 부수고 마을을 구했습니다] \n");

                        System.out.println("마을을 구하였습니다 게임을 종료합니다");
                        time.win();

                    }else if (hero.getHp() <= 0){//영웅의 체력이 0보다 작을 때 죽음
                        hero.death(hero);
                    }


                    System.out.println();
                    System.out.println();
                    System.out.println();

                    인트로.close();
                    인트로 = new Intro("src/BGM/바위화남.mp3", true);
                    인트로.start();
                    Monstar monstar1 = new Mon4("[진짜로 화나 버린 작은 바위들]",5,500,500,50000,50000,10,500) ;
                    System.out.println("\n" + monstar1.getName() + "이젠 봐주지 않아..\n");
                    Thread thread1 = new Thread(new Mon4ThreadR(monstar1 , hero));
                    thread1.start();

                    while (true) {
                        //바위
                        hero.attack(monstar1);
                        if (monstar1.getHp() > 0) {
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ monstar1.getName() + "의 남은 체력 : " + monstar1.getHp() + "\n");
                        } else {
                            //Thread.interrupted();
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ monstar1.getName() + "가 쓰러졌습니다.");
                            인트로.close();
                            인트로 = new Intro("src/BGM/승리.mp3", true);
                            인트로.start();
                            System.out.println("경험치 +50");
                            System.out.println("돈 +2000");
                            hero.setExp(hero.getExp() + monstar1.getExp());
                            hero.levelUp(hero);
                            hero.setMoney(hero.getMoney() + monstar1.getMoney());
                            System.out.println("\n 드디어 진짜로 마을을 구하셨습니다 축하드립니다.");
                            System.out.println("\n 드디어 진짜로 마을을 구하셨습니다 축하드립니다.");
                            System.out.println("\n 드디어 진짜로 마을을 구하셨습니다 축하드립니다.");
                            time.win();
                            try {
                                Thread.sleep(5000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            monstar1.setHp(monstar1.getMaxHp() * 2);
                            System.exit(0);
                        }

                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ monstar1.getName() + "의 공격");
                        monstar1.attack(hero);
                        if (hero.getHp() > 0) {
                            System.out.println(hero.getName() + "의 남은 체력 : " + hero.getHp() + "\n");

                        } else {
                            System.out.println(hero.getName() + "이(가) 쓰러졌습니다.\n");
                            System.out.println("게임을 종료합니다.");
                            //time.win();
                            try {
                                Thread.sleep(5000);
                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            System.exit(0);

                        }
                    }
                } else {   //다른 것을 입력했을 때
                    System.out.println("제대로 입력해주세요");
                }
            }


            //3. 상점으로
            else if (number.equals("3")){
                Intro 문열기 = new Intro("src/BGM/문열기.mp3",false);   문열기.start();

                Thread thread = new Thread(new Shop(hero));

                Shop shop = new Shop(thread);
                shop.sell(hero);
            }




            else if (number.equals("4")){
                Typing loading = new Typing();
                loading.run();
            }

            else if (number.equals("0")) {
                System.exit(0);
            }

            else if (number.equals("00")){
                System.out.println("1. 재생 2. 정지 0. 뒤로가기");
                for (; ;) {
                    String num = scanner.nextLine();
                    if (num.equals("1")) {
                        인트로 = new Intro("src/BGM/인트로.mp3", true);
                        인트로.start();
                        System.out.println("인트로 시작됨");
                        break;
                    }
                    else if (num.equals("2")) {
                        인트로.interrupt();
                        인트로.close();
                        System.out.println("인트로 정지");
                        break;
                    }
                    else if (num.equals("0")){
                        System.out.println("뒤로가기");
                        break;
                    }
                    else {
                        System.out.println("다시 입력하세요");
                    }
                }
            }

            //개발자 치트 커맨드 키
            else if (number.equals("99")) {
                hero.setHp(hero.getHp() + 100000);
                hero.setMaxHp(hero.getMaxHp() + 100000);
                hero.setMoney(hero.getMoney() + 100000);
               // hero.setAd(hero.getAd() + 100000);

                System.out.println();
                hero.stateShow(hero);
            }
        }


    }
}
