package 파석6;

public class Mon4ThreadR implements Runnable {

    Monstar monstar;
    Hero hero;

    public Mon4ThreadR(Monstar monstar, Hero hero) {
        this.monstar = monstar;
        this.hero = hero;
    }

    @Override
    public void run() {
        System.out.println("작은 부스러기 돌덩이들이 미쳐 날뛰고 있습니다 대비하십시오");
        for (int i = 1; i < hero.getMaxHp() * 2; i++) {
            hero.setHp(hero.getHp() - i);
            if (hero.getHp() <= 0) {
                System.out.println(hero.getName() + "이 죽었습니다.\n게임을 종료합니다.");
                System.exit(0);
            } else if (hero.getHp() > 0) {
                System.out.println(hero.getName() + "의 남은 체력 : " + hero.getHp() + "\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (monstar.getHp() < 0) {
                break;
            }

        }
    }
}


       /* //타자를 맞추면 바위에게 데미지가 들어가고 피해를 받지 않는다
        //시간 제한이 있다 시간이 지나거나 틀리게 되면 피해를 받는다
        System.out.println("타자는 정확하게 노려야 하기에");
        System.out.println("신중해야하고");
        System.out.println("시간은 기다려주지 않기에");
        System.out.println("빨라야 한다");
        System.out.println("빠르면서 타자 또한 틀리지 않고 정확하게 노려야 한다 ");
        System.out.println("모든건 나의 손에 달렸다");

        //정답을 랜덤 값을 주게 되어 맞추면 확정적으로 쓰러트릴 수 있게 된다
        //틀리면 데미지를 크게 입게 된다
        System.out.println("나는 누구일까 1. 야구 타자 선수 2. 타자 속기사 3. 프로게이머 4.운에 맡기겠어 ");

        //전투씬*/


