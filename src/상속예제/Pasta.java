package 상속예제;

public class Pasta extends WesternFood {
    private int price;

    public Pasta(String name, String nation, int price) {
        super(name, nation);
        this.price = price;
    }

    public void showPrice() {
        System.out.println(price);
    }
}