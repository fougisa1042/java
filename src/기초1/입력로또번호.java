package 기초1;

import java.io.IOException;
import java.util.*;

public class 입력로또번호 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();

        int[] numArray = new int[6];
        int temp; // 앞의 숫자와 뒤의 숫자의 크기를 비교해서 순서를 바꿔주기 위해 사용
        for (int i = 0; i < 6; i++){
            numArray[i] = random.nextInt(45)+1;
            for (int j = 0; j < i; j++){
                if (numArray[i] == numArray[j]){
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < numArray.length; i++){
            for (int j = 0; j < i; j++) {
                if (numArray[i] < numArray[j]) {
                    temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numArray));
        System.out.println();


        for (int k = 0; k < 3; k ++) {
            Set<Integer> set = new HashSet<>();
            while (set.size() < 6) {
                Double d = Math.random() * 45 + 1;
                set.add(d.intValue());
            }
            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            System.out.println(list);
        }
    }
}
