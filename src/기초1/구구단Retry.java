package 기초1;

public class 구구단Retry {
    public static void main(String[] args) {
        int calc = 0;
        for (int i=2; i<=9 ; i++){
            System.out.println("ㅡㅡㅡ< "+i+"단 >ㅡㅡㅡ");
            for(int j=1; j<=9;j++){
                calc = i*j;
                System.out.print(i + "*" + j + "=" + calc +"\t\n");

        }
            System.out.println(   );
    }
}
}

