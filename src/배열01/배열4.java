package 배열01;

public class 배열4 {
    public static void main(String[] args) {

        int[][] arr = new int[2][10];
        int k = 100;
        for (int i = 0; i < arr.length; i++) {//열 세로
            for (int j = 0; j < arr[i].length; j++) {//행 가로
                arr[i][j] = k; // 인덱스를 이용한 초기화
                k += 15;
            }
        }

        for (int i = 0; i < arr.length; i++) {//열
            for (int j = 0; j < arr[i].length; j++) {//행
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


    /*Random 랜덤 = new Random();
    int[] 배열 = new int[9];
            for (int i = 0; i < 배열.length; i++) {// 총 9칸이므로 '0~8'을 범위로 함
        배열[i] = 랜덤.nextInt(9); // 랜덤값을 배열[0]에 처음 넣는것부터 로직이 시작됨.
        for (int j = 0; j < i; j++) { // 검사조건을 나열해보니 'i'보다 작은 숫자로 일일이 비교해주는 규칙 찾음.
        // i=0 일 때는 검사가 필요없음.
        if (i > 0 && 배열[i] == 배열[j]) {
        i--;
        break;
        }
        } // 같은지 안같은지 검사용 for문의 끝괄호
        }
        int[][] 이차원배열 = new int[3][3]; // 2차원 배열 선언
        int 배열인덱스 = 0;
        for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
        System.out.print(이차원배열[j][k] = 배열[배열인덱스]); // j , k가 변수인 for문이 한바퀴 돌때마다 배열인덱스 값이 '0'에서부터 '1'씩 증가함.
        배열인덱스++;
        }
        }*/


    /*String[] 과목 = { "현대철학", "중세철학", "고대철학", "존재와 시간", "소유냐 존재냐" };
    int[] 점수 = new int[5];
    int 합계 = 0;
    double 평균 = 0.0;
    Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 점수.length; i++) {
        System.out.println("[" + 과목[i] + "]" + " 점수를 입력하세요");
        점수[i] = scanner.nextInt();
        합계 += 점수[i];
        }
        평균 = (double) 합계 / (double) 점수.length;
        for(int i = 0; i<과목.length; i++) {
        System.out.println(과목[i] + " 점수: " + 점수[i]);
        }

        System.out.println("총합: " + 합계);
        System.out.println("평균: " + 평균);*/




/* Scanner sc = new Scanner(System.in);
            System.out.println("n값 입력");
            int n = sc.nextInt();

            //데이터를 담을 배열
            int[] data = new int[n];
            for (int i = 0; i < n ; i++){
                System.out.print("data [" + "] : ") ;
                data[i] = sc.nextInt();
            }

            //바뀌기전
            for (int i = 0; i < n; i++){
                System.out.print(data[i] + " ");
            }
            System.out.println();


            //오른쪽으로 1칸 Shit
            int temp = data[n-1];
            for (int i = n-1; i>=1; i-- ){
                data[i] = data[i-1];
            }
            data[0] = temp;

            //바뀐 후
            for (int i = 0; i<n; i++){
                System.out.print(data[i] + "");
            }
            System.out.println();

            sc.close();*/