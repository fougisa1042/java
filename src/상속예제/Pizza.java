package 상속예제;

public class Pizza extends WesternFood {
    private int price;

    public Pizza(String name, String nation, int price) {
        super(name, nation);
        this.price = price;
    }

    public void showPrice() {
        System.out.println(price);
    }
}