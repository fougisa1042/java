package 기초예제1;
import java.util.Random;
import java.util.Scanner;
public class 스무고개 {

    public static void main(String args[]) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-----스무고개 게임-----");
            System.out.println("1.게임설명 / 2.시작/ 3.종료");
            int help = sc.nextInt();

            if (help == 1) {
                System.out.println("-------규칙-------");
                System.out.println("게임이 시작되면 컴퓨터는 1~100 중 ");
                System.out.println("랜덤으로 지정된 숫자를 사용자가 20번 안에 맞추면 된다");
                System.out.println("이제 게임을 시작해 주세요!!!");
                System.out.println();
            }

            else if (help == 2) {
                while (true) { // 게임을 무한 반복
                    System.out.println("죽음의 스무고개의 게임을 시작합니다.");
                    int cont = 0;
                    Random ram = new Random();
                    int com = ram.nextInt(100) + 1;
                    System.out.println("컴퓨터의 숫자가 정해졌다 맞춰 주세요");
                    while (cont < 20) { // 20번까지 반복
                        System.out.println("컴퓨터의 숫자는?");
                        int play = sc.nextInt();
                        ++cont;
                        if (play == com) {
                            System.out.println("정답입니다. " + cont + "번 만에 맞췄습니다.");
                            cont = 0;
                            System.out.println("게임을 계속 진행하시겠습니까?  1.예 / 2.아니요");
                            int go = sc.nextInt();
                            if (go == 2) {
                                System.out.println("게임 끝 수고하셨습니다.");
                                System.exit(0);
                            } else if (go == 1) {
                                System.out.println("게임을 계속 진행하겠습니다.");
                                break;
                            }
                        } else if (play > com) { // 입력한 숫자가 클시
                            System.out.println(cont + "번째 입력 >>> >> >[다운]");
                        } else if (play < com) {  // 입력한 숫자가 작을시
                            System.out.println(cont + "번째 입력 >>> >> >[업]");
                        }
                    }
                    System.out.println("\n------------- 정답은  :  " + com + "이였습니다.-------------\n\n");
                }
            }

            else if (help == 3) {
                System.out.println("프로그램 종료");
                System.exit(0);
            }

            else {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println();
            }
        }

    }
}
