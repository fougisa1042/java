package 클래스연습;

public class MethodEx01 {

    public static void sum(){ // 메소드 정의
        int sum=0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) { // main 메소드
        sum(); // 메소드 호출
        sum(); // 메소드 호출
        sum(); // 메소드 호출
    }


}


