package 기초2;

import java.util.Scanner;

public class 마름모연습 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****홀수입력*****");

        int count = sc.nextInt(); // 홀수 입력받음 ex))5를 입력(이하 5를 입력했다는 가정하에 설명)

        int o = count / 2; // 입력받은 홀수 나누기2 ex)) 5/2 = 2.5 이지만 정수만남아 2

        for (int i = -o; i <= o; i++) { // 5를 입력하였으니 -2,-1,0,1,2 총 5번 돌게 되어있다.
            int k = 0; // 비교하기위해 k를 선언, 이중포문 탈출뒤 초기화;
            for (int j = 0; j < count - Math.abs(i); j++) { // Math.abs(a) 함수는 a를 절대값으로 인식한다 예를들어 -2일 경우 2로인식 /////따라서 이 포문은 3,4,5,4,3 번 돌게 되어있다.
                // 첫바퀴는 j = 0; j < 3 ; j ++ 인 샘이다.
                String result = k < Math.abs(i) ? " " : "*"; // 공백과 별을 구분하기위해 삼항연산자를 사용 비교자 k 가 절대값i보다 작으면 공백 크면 별을 찍어주는 공식. // 삼항연산자 숙지 >> 조건식 ? 조건이참일떄 : 조건이 거짓일때
                System.out.print(result);
                k++; // 한번돌때마다 k 를 증가시켜준다. 공백을 찍은걸 체크, Math.abs(i) 는 한줄의 공백의 갯수도 되는데 k가 공백의 갯수보다 더 찍혓으면 result 가 false 가 되어 *을찍게된다
            }
            System.out.println();
        }
    }



}



