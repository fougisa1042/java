package 배열01;

public class 배열합치는법 {

    public static void main(String[] args) {

        int[] num = {10,2,4,3,6};
        int i = 0;
        int sum = 0;
        while (i < num.length) {
            sum = sum + num[i];
            i++;
        }
        System.out.println("배열 원소의 총합 = " + sum);
    }
}