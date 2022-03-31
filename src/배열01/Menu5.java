package 배열01;

public class Menu5 {

    String name;
    int cost;
    int count;
    int sum = 0;


    Menu5(String a, int b, int c) {
        name = a;
        cost = b;
        count = c;
    }
}

class Food {
    public static void main(String[] args) {
        Menu5[] walnutpastry = {


                new Menu5("팥 호두과자", 6000, 1),
                new Menu5("슈크림 호두과자", 6000, 1),
                new Menu5("치즈 호두과자", 6000, 1),
        };
        for (int i = 0; i < walnutpastry.length; i++) {

            System.out.println("____________________________________");
            System.out.print(walnutpastry[i].name + "\t");
            System.out.print(walnutpastry[i].cost + "\t");
            System.out.println(walnutpastry[i].count);

            System.out.println("");
            System.out.println(walnutpastry[0].name + walnutpastry[0].cost);


        }
        System.out.println("____________________________________");
    }
}


