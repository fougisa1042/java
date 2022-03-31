package 배열01;

import java.util.ArrayList;
import java.util.List;

public class 리스트연습 {
    public static void main(String[] args) {
         /*
        System.out.println("첫번째 연습");
        List<String> testList = new ArrayList<String>();
        testList.add("1");
        testList.add("2");
        testList.add("3");
        testList.add("4");
        testList.add("5");
        System.out.println("Initial ArrayList:\n" + testList);
        testList.add("6");
        testList.add("7");
        System.out.println("Modified ArrayList:\n" + testList);
        */

        /*System.out.println("두번째 연습");
        String[] arr = new String[1];
        arr[0] = "1";
        List<String> testList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Initial ArrayListL:\n" + testList);
        testList.add("2");
        testList.add("3");
        testList.add("3");
        testList.add("222");
        System.out.println("Modified ArrayListL:\n" + testList);*/

       /* String[] arr = new String[1];
        arr[0] = "1";

        List<String> testList = new ArrayList<>(Arrays.asList(arr));

        testList.add("2");
        testList.add("3");

        arr = new String[testList.size()];
        testList.toArray(arr);*/

       /* String[] arr = new String[5];
        arr[0] = "1";
        arr[1] = "2";
        arr[2] = "3";
        arr[3] = "4";
        arr[4] = "5";

        System.out.println("Intial Array : \n" + Arrays.toString(arr) );

        int N = arr.length;

        arr = Arrays.copyOf(arr,N+1);
        arr[N] = "6";

        System.out.println("Modified Array : \n" + Arrays.toString(arr));*/

        ArrayList<Integer> arrayList = new ArrayList<>(); //임폴트 후 객체 생성 배열처럼 List Size를 최기화 할 필요가 없음
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();

        arrayList.add(0,10); //add 메소드 index
        arrayList.add(1,20);
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);

        arrayList2.add(0,100);
        arrayList2.add(1,200);
        arrayList2.add(10);
        arrayList2.add(20);
        arrayList2.add(30);


        arrayList3.add(40);
        arrayList3.add(50);

        arrayList.addAll(arrayList2);        //추가

        arrayList2.addAll(arrayList3);        //추가


        arrayList.remove(0);        //제거


        List<Integer> list = arrayList.subList(0,2);        //인덱스 범위 가져 오기


        for(int i : arrayList)
        {
            System.out.println("값 : " + i );
        }

        System.out.println("------------------------");

        for(int i : list)
        {
            System.out.println("subList 메소드로 가져온 List : " + i);
        }

    }
}
