package 기초1;

import java.util.Scanner;
public class Calendar윤년 {
    public static void main(String args[])
    {
        System.out.print("년도를 입력하세요 : ");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();

        // 윤년은 4의 배수'이고(AND)' 100배수는 '아니거나(OR)' 400의 배수이다.
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + "년은 윤년입니다.");
        else    // 윤년 아닐시
            System.out.println(year + "년은 윤년이 아닙니다.");
    }

}
