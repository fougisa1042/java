package 배열01;

public class Menu1 {
    int nuber;
    String name;
    int price;

    Menu1(int number, String name, int preice) {
        nuber = number;
        this.name = name;
        price = preice;
    }
}

class t1 {
    public static void main(String[] args) {
        Menu1[] test = {
                new Menu1(1, "사과", 1000),
                new Menu1(2, "배", 1500),
                new Menu1(3, "자두", 500),
                new Menu1(4, "복숭아", 800),
                new Menu1(5, "살구", 1000),
                new Menu1(6, "수박", 2000)};

        System.out.println("\n####### 메뉴 리스트 #######");
        System.out.println("# 번호 이름 가격 #");
        for (int i = 0; i < test.length; i++)  {
            System.out.print(test[i].nuber + "\t");
            System.out.print(test[i].name + "\t");
            System.out.println(test[i].price);
        }
        System.out.println("######################");
    }
}

