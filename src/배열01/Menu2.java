package 배열01;

import java.util.List;
import java.util.Vector;

public class Menu2 {
    int num;
    String name;
    int price;

    Menu2(int a, String b, int c){
        num = a;
        name = b;
        price = c;
    }
}

class t2 {
    public static void main(String[] args) {
        List<Menu2> list = new Vector<Menu2>();
        list.add(new Menu2(1, "사과", 1000));
        list.add(new Menu2(2, "배", 1500));
        list.add(new Menu2(3, "자두", 500));
        list.add(new Menu2(4, "복숭아", 800));
        list.add(new Menu2(5, "살구", 1000));

        System.out.println("\n######### 메뉴 리스트 #########");
        System.out.println("# 번호 이름 가격 #");

        for(int i=0; i < list.size(); i++) {
            Menu2 showNum = list.get(i);
            System.out.print(showNum.num + "\t");
            System.out.print(showNum.name + "\t");
            System.out.println(showNum.price);
        }
        System.out.println("###############################");
    }
}

