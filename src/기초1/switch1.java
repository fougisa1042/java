package 기초1;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int 입력값 = 0;
        /*int month = "";*/

        System.out.println("병무청 : 몇월에 오시게요 그래도 몇월에 오는지는 알아야 할거 아니에요");
        String 개월입력 = scanner.nextLine();
        System.out.println("정명수 : "+ 개월입력 +"월에 갈거임");

        switch (입력값) {
            case 1:  개월입력 = "January";
                break;
            case 2:  개월입력 = "February";
                break;
            case 3:  개월입력 = "March";
                break;
            case 4:  개월입력 = "April";
                break;
            case 5:  개월입력 = "May";
                break;
            case 6:  개월입력 = "June";
                break;
            case 7:  개월입력 = "July";
                break;
            case 8:  개월입력 = "August";
                break;
            case 9:  개월입력 = "September";
                break;
            case 10: 개월입력 = "October";
                break;
            case 11: 개월입력 = "November";
                break;
            case 12: 개월입력 = "December";
                break;
            default: 개월입력 = "Invalid month";
                break;
        }
        System.out.println(개월입력);
    }
}
