package 쓸것;
import java.util.Scanner;

public class Street2 implements Runnable {
    public int restValue = 6; // 회복 수치
    public Hero2 hero;

    public Street2(Hero2 hero) {
        this.hero = hero;
    }

    public void printAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("길거리에서 휴식을 취했다.");

        System.out.println();
        Thread restAtStreet = new Thread(new Street2(hero), "Street");

        restAtStreet.start();   // 일정 간격마다 회복을 하는 쓰레드가 실행됨.
        scanner.nextLine(); // 유저로 부터 입력을 받음.
        restAtStreet.interrupt(); // 유저가 입력을 하면, 쓰레드를 중단시킴.
    }

    public void run() {
        while (true) {

            if (Thread.interrupted()) {
                System.out.println("휴식을 중단했습니다.");
                return;
            }

            hero.healHp(restValue);    // hero에 회복하는 코드
            hero.healMp(restValue);
            System.out.println();

            System.out.println();
            System.out.println("============================================================================");
            System.out.println("                       길거리에서 휴식을 취하고 있습니다.");
            System.out.println("                    Enter를 누르면 휴식을 멈출 수 있습니다.");
            System.out.println();
            System.out.println("                           [ Enter 키를 눌러주세요. ]");            System.out.println("============================================================================");
            System.out.println();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                return;
            }
        }

    }
}


class Hero2 {
    public String name;
    public int hp;
    public int mp;
    public int maxHp;
    public int maxMp;

    public Hero2(String name, int maxHp, int maxMp) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;

        this.maxMp = maxMp;
        this.mp = maxMp;
    }

    public void healHp(int restValue) {
        hp += restValue;
        hp = Math.min(hp, maxHp);

        System.out.printf("%s가 %d만큼 회복하고 있습니다. [현재체력 : %d ] ", name, restValue, hp); // 메세지 표시 예시
    }

    public void healMp(int restValue) {
        mp += restValue;
        mp = Math.min(mp, maxMp);
    }
}
