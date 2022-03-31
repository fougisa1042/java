package 기초1;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class UpDownGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean game = true;

        while (game) {
            System.out.println("Up & Down 게임입니다 정답을 맞춰 보세요 ※기회는 5번 (1 ~ 100");
            Random random = new Random();
            int k = random.nextInt(100); //0~99까지 임의의 정수 생성
            int n = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.println(i + "번째 시도 입니다>>>");

                try {
                    n = scanner.nextInt();// 숫자 입력

                    if (n < 0 || n > 99) {      //n이 0보다 작거나 n이 99보다 크다면 잘못했습니다 출력
                        System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
                        i--;
                        continue;
                    }

                    if (n == k) {       //정답 시
                        System.out.println("축하드립니다 정답입니다");
                        break;
                    } else if (n < k) {     // Up
                        System.out.println("[Up]");
                    } else {                 //Down
                        System.out.println("[Down]");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("잘못입력하였습니다 . 다시 입력해주세요");
                    scanner.next();
                    i--;
                    continue;
                }
            }

            if (n != k) {
                System.out.println("아쉽습니다. 5회 안으로 맞히지 못하였습니다");
                System.out.println("정답은 " + k + " 었습니다");
            }

            System.out.println("다시 하시겠습니까? (Y/N");
            if (scanner.next().equals("Y")||scanner.next().equals("y")) {
            } else if(scanner.next().equals("N")||scanner.next().equals("n")){
                game = false;
            }else {
                System.out.println("다른 값을 입력해습니다 다시 입력해주셍");
            }
        }
        System.out.println("게임이 종료되었습니다");
    }
}
