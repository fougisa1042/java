package 클래스연습;

public class MethodEx03 {
        public static void sum(int a) { // int a 매개변수
            int sum = 0;
            for (int i = 0; i <= a; i++) { // a = 15
                sum += i;
            }
            System.out.println(sum);
        }

        public static void sum(int a, int b) { // int a, b 매개변수 / 메소드 오버로딩
            int sum = 0;
            for (int i = a; i <= b; i++) { // a = 5, b = 20
                sum += i;
            }
            System.out.println(sum);
        }

        public static void main(String[] args) {
            sum(15); // sum(int a); 호출 및 값 전달
            sum(5, 20); // sum(int a, b); 호출 및 값 전달
        }
    }

