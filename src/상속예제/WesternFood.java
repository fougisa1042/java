package 상속예제;

public class WesternFood extends Food {
    private String nation;

    public WesternFood(String name, String nation) {
        super(name);
        this.nation =nation;
    }

    public void showNation() {
        System.out.println(nation);
    }
}