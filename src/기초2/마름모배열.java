package 기초2;
import java.util.Scanner;
public class 마름모배열 {
    public static void main(String[] args) {

        System.out.println("숫자를 입력해주세요");
        Scanner scanner = new Scanner(System.in);

        int center;
        int answer;

        answer = scanner.nextInt(); //스캐너로 정수 입력받기

        answer = answer * 2 + 1; //입력받은 정수를 가공해 마름모가 그려질 가로 세로 길이 구하기

        center = answer / 2;  //가운데 행 위치 지정

        char[][] dia = new char[answer][answer]; //가공한 정수를 배열 생성에 사용

        int start = center; //점을 찍을 시작 지점
        int end = center; // 점을 찍을 마지막 지점

        // 마름모 생성 
        for (int a = 0; a < answer; a++){
            for (int b = 0; b < answer; b++){
                if (start <= b && b <= end){
                    dia[a][b] = '*';
                }else{
                    dia[a][b] = ' ';
                }
            }
            
            //중간에 점 찍는 위치 반전 
            if (a < center){
                start--;
                end++;
            }else {
                start++;
                end--;
            }
        }

        //마름모 배열 출력
        for (int a = 0; a < answer; a++) {
            for (int b = 0; b < answer; b++) {
                System.out.print(dia[a][b]);
            }
            System.out.println();
        }

    }
}
