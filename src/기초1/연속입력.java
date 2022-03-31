package 기초1;

import java.util.Scanner;

public class 연속입력 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = scanner.next();

        System.out.print("태어난 년도를 입력해주세요 : ");
        int num1 = scanner.nextInt();
        System.out.println("태어난 달을 입력해주세요 : ");
        int num2 = scanner.nextInt();
        System.out.println("태어난 일을 입력해주세요 : ");
        int num3 = scanner.nextInt();

        System.out.println(">> 당신의 이름은 " + name + " 입니다.");
        System.out.printf(">> 당신의 생년월일은  %d, %d, %d 입니다.\n", num1, num2, num3);
    }
}
