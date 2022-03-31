package 배열01;

public class 반복문과배열1 {
    public static void main(String[] args) {

        int [] a = new int [4];  // [] <- 넣을 개수 5개까지 출력한다

        for( int i=0; i<3; i++ )
        {
            a[i] = i*2;
        }

        for( int i=0; i<4; i++ )
        {
            System.out.println( i +"번 요소 :"+ a[i] );
        }

    }
}
