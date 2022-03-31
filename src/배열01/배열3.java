package 배열01;

public class 배열3 {

    public static void main(String[] args) {
        int i,j,O=0;
        int N = 100;

        int[][] array = new int[N][N];


        for (i=O; i<N; i++){
            for (j=O; j<N; j++){
                array[i][j]= (int)(Math.random()*10);
            }

        }
        for (i=O; i<N; i++){
            for (j=O; j<N; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();

        }






    }
}
