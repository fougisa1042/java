package 기초1;

public class 구구단 {
    public static void main(String[] args) {
        for(int i =2; i<10; i= i+1  ){
            System.out.println("---<"+i+"단>---");
            for(int j = 1; j< 10; j= j+1 ){
                System.out.println(i+"x"+j+"="+(i*j));
            }
        }
        System.out.println("\"수고하셨습니다\""+"\n\"열심히 공부 하십시오\"");

    }
}
