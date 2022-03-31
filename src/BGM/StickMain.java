package BGM;

import java.util.Scanner;

public class StickMain {
    public static void main(String[] args) {

        /*Stick bgmMusic = new Stick("src/BGM/전투.mp3", false);
        bgmMusic.start();*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. 재생 2. 정지 3. 다시재생 4. 뒤로가기");
        Stick 인트로 = new Stick("src/BGM/인트로.mp3", true);
        인트로.start();



        while (true) {
            System.out.println("zzz");

            label:
            for (; ; ) {
                String num = scanner.nextLine();
                switch (num) {
                    case "1":
                        인트로 = new Stick("src/BGM/인트로.mp3", true);
                        인트로.start();
                        System.out.println("시작됨");
                        break;
                    case "2":
                        인트로.interrupt();
                        인트로.close();
                        System.out.println("정지됨");
                        break;
                    case "3":

                        System.out.println("다시재생");
                        break;
                    case "4":
                        System.out.println("뒤로가기");
                        break label;
                    default:
                        System.out.println("다시 입력하세요");
                        break label;
                }
            }
            break;
        }

        System.out.println("뒤로 가졌음");
        인트로.close();
        인트로 = new Stick("src/BGM/거위음악.mp3", true);
        인트로.start();






        //인트로

/*
        //영웅의 공격
        Stick 공격1 = new Stick("src/BGM/공격1.mp3", false);
        공격1.start();
        Stick 스킬1 = new Stick("src/BGM/스킬1.mp3", false);
        스킬1.start();
        Stick 스킬2 = new Stick("src/BGM/스킬2.mp3", false);
        스킬2.start();
        Stick 물알공격 = new Stick("src/BGM/물알공격.mp3", false);
        물알공격.start();
        Stick 불알공격 = new Stick("src/BGM/불알공격.mp3", false);
        불알공격.start();

        //메추리
        Stick 메추리1 = new Stick("src/BGM/메추리공격.mp3", false);
        메추리1.start();

        //거위알
        Stick 거위알1 = new Stick("src/BGM/거위알공격.mp3", false);
        거위알1.start();

        //나무의 공격
        Stick 나무1 = new Stick("src/BGM/나무공격1.mp3", false);
        나무1.start();
        Stick 나무2 = new Stick("src/BGM/나무공격2.mp3", false);
        나무2.start();
        Stick 나무3 = new Stick("src/BGM/나무공격3.mp3", false);
        나무3.start();

        //바위
        Stick 바위1 = new Stick("src/BGM/바위공격1.mp3", false);
        바위1.start();
        Stick 바위2 = new Stick("src/BGM/바위공격2.mp3", false);
        바위2.start();
        Stick 바위스킬 = new Stick("src/BGM/바위스킬.mp3", false);
        바위스킬.start();*/

    }
}

