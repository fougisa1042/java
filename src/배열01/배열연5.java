package 배열01;

import java.util.Arrays;

public class 배열연5 {
    public static void main (String[] args){

       int[] arr = {1,2,3,4,5};

       for (int i = 0; i < arr.length; i++){
           System.out.print(arr[i]+ ",");

           System.out.println(Arrays.toString(arr));
       }

    }
}
