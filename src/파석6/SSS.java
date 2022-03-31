/*
package 파석6;

import java.util.Scanner;

public class SSS extends Thread {
    Monstar monstar;
    static int time;
    static int sec;
    static int day = 1; //하루를 1분으로 설정
    public static int time() {
        return time;
    }
    public static int day() {
        return day;
    }

    SSS(Monstar monstar){
        this.monstar = monstar;
    }


    @Override
    public void run() {
        int minute = 0;

        while (true) {
            //60으로 바꾸기
            minute++;
            sec = minute % 10;
            time = minute / 10 % 10;

            if (time == 0 && sec <= 1) {
                System.out.println("지금은 [낮]입니다.");
                System.out.println("        .\n" +
                                   "      \\ | /\n" +
                                   "    '-.;;;.-'\n" +
                                   "   -==;;;;;==-\n" +
                                   "    .-';;;'-.\n" +
                                   "      / | \\\n" +
                                   "jgs     '");
                monstar.setHp(monstar.getHp() - 9);
                monstar.setMaxHp(monstar.getMaxHp() - 9);
                monstar.setAd(monstar.getAd() - 9);
                monstar.stateShow(monstar);
                System.out.println(" 아침 해가 밝았습니다 ");
            }

            else if (time == 1 && sec <= 0) {
                System.out.println("지금은 [밤]입니다. ");
                System.out.println("         _.._\n" +
                                   "       .' .-'`\n" +
                                   "      /  /\n" +
                                   "      |  |\n" +
                                   "      \\  \\\n" +
                                   "jgs    '._'-._\n" +
                                   "          ```");
                monstar.setHp(monstar.getHp() + 9);
                monstar.setMaxHp(monstar.getMaxHp() + 9);
                monstar.setAd(monstar.getAd() + 9);
                monstar.stateShow(monstar);
                System.out.println("몬스터들이 달빛의 정기를 받아 평소보다 강해집니다");
            }


            else if (day == 5){
                System.out.println("제한시간에 클리어하지 못하여 게임이 종료 됩니다 ");
                System.exit(0);
            }

            else if (time == 2) {
                minute = 0;
                day++;
                System.out.println(day() + "일 입니다");
            }
            System.out.println(time + ":" + sec);

            //예외처리
            try {
                sleep(1000); //1초로 바꾸기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. 메추리 2. 거위 3. 나무 4. 바위 5. 스탑(첨부터다시 6. 런(말그대로 7. 인터럽트(x 8.노티파이(x 9. 노티파이올(x 10.웨잇(x ");
        System.out.println("11.조인(x 12.리줌(x 13. 시스펙스 14.");
        Intro 인트로 = new Intro("src/BGM/인트로.mp3", true);
        인트로.start();

        Monstar monstar = new Mon1("[000]", 0, 0, 0, 10, 10, 10, 0);
        SSS show = new SSS(monstar);
        show.start();

        while (true) {
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    monstar = new Mon1("[메추리]", 1, 10, 10, 1000, 1000, 10, 10);
                    show = new SSS(monstar);
                    show.start();
                    System.out.println("메추리 선택");
                    break;
                case 2:
                    인트로.close();
                    인트로 = new Intro("src/BGM/거위음악.mp3", true);
                    인트로.start();

                    monstar = new Mon2("[거위]", 2, 20, 200, 2000, 2000, 20, 200);
                    show = new SSS(monstar);
                    show.start();
                    System.out.println("거위 선택");
                    break;
                case 3:
                    monstar = new Mon3("[나무]", 3, 30, 300, 3000, 3000, 300, 300);
                    show = new SSS(monstar);
                    show.start();
                    System.out.println("나무 선택");
                    break;
                case 4:
                    monstar = new Mon4("[바위]", 5, 500, 500, 5000, 5000, 500, 500);
                    show = new SSS(monstar);
                    show.start();
                    System.out.println("바위 선택");
                    break;

                case 00:
                    System.out.println("1. 재생 2. 정지 0. 뒤로가기");
                    for (; ; ) {
                        String num = scanner.nextLine();
                        if (num.equals("1")) {
                            인트로 = new Intro("src/BGM/인트로.mp3", true);
                            인트로.start();
                            System.out.println("인트로 시작됨");
                            break;
                        } else if (num.equals("2")) {
                            인트로.interrupt();
                            인트로.close();
                            System.out.println("인트로 정지");
                            break;
                        } else {
                            System.out.println("다시 입력하세요");
                        }
                    }
                    break;

                default:
                    System.out.println("다시입력해주세요");
                    break;
            }
        }
    }

}*/
