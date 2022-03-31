package 배열01;

public class Menu4 {
    int num;
    String fname ;
    int price;

    Menu4() {  }
    Menu4(int a, String b, int c) {
        num = a;
        fname = b;
        price = c;
    }

    public void View(Menu4[] aaa) {
        for(int i=0; i<aaa.length; i++) {
            System.out.print(aaa[i].num + "\t");
            System.out.print(aaa[i].fname + "\t");
            System.out.println(aaa[i].price);
        }
    }
}
class t4 {
    public static void main(String[] args) {
        Menu4[] test = {new Menu4(1, "사과", 1000),
                new Menu4(2, "배", 1500),
                new Menu4(3, "자두", 500),
                new Menu4(4, "복숭아", 800),
                new Menu4(5, "살구", 1000)};
        Menu4 t2 = new Menu4();
        t2.View(test);
    }
}
