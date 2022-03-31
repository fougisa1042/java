package 기초1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class 입력덧셈 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            int A = random.nextInt(100);
            int B = random.nextInt(100);
            System.out.println();
            System.out.print(A + " + " + B + " 정답은 ?");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int Answer = Integer.parseInt(br.readLine());
            if (A + B == Answer) {
                System.out.print("정답입니다");
            } else {
                System.out.print("오답입니다")
                ;
            }
        }

    }
}
