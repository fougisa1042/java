package 배열01;
import java.util.*;

public class Menu3 {
    int num;
    String name;
    int price;

    Menu3(int a, String b, int c) {
        num = a;
        name = b;
        price = c;
    }
}

class ListMenu{
    public void Showlist()  {
        List<Menu3> list = new Vector<Menu3>();
        list.add(new Menu3(1, "사과", 1000));
        list.add(new Menu3(2, "배", 1500));
        list.add(new Menu3(3, "자두", 500));
        list.add(new Menu3(4, "복숭아",800));
        list.add(new Menu3(5, "살구", 1000));

        System.out.println("\n######### 메뉴 리스트 #########");
        System.out.println("# 번호 이름 가격 #");

        for(int i=0; i < list.size(); i++) {
            Menu3 shownum = list.get(i);
            System.out.print(shownum.num + "\t");
            System.out.print(shownum.name + "\t");
            System.out.println(shownum.price);
        }
        System.out.println("###############################");
    }
}
class t3 {
    public static void main(String[] args) {
        ListMenu test = new ListMenu();
        test.Showlist();
    }
}
