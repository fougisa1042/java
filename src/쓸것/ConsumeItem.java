package 쓸것;

// 회복 아이템에 대한 클래스
// 사용시 hero의 hp 혹은 mp를 회복시켜준다.

public class ConsumeItem {

    public String name;    // 아이템 이름
    public String description;    // 아이템에 대한 설명
    public int price;    // 가격
    public int amount; // 회복량
    public int count;   // 아이템 소지 갯수


    public String type; // <체력> or <마나>


    public ConsumeItem(String name, String description, String type, int amount, int price, String target) {
        this.name = name;
        this.description = description;

        this.type = type;
        this.amount = amount;
        this.count = 1;

        assert (this.type.equals("체력") || this.type.equals("마나"));
    }


    // 아이템에 대한 정보를 출력함.

    public void printDisplayItem() {
        System.out.printf("[ %s ] %5dG - %d개\n", name, price, count);
        System.out.printf("   설명 : %s\n", description);
    }


    // hero가 ConsumeItem을 사용함.

    public void usedItem(Hero2 hero) {
        System.out.printf("%s 을 사용합니다.\n", name);

        usedItemToTarget(hero, false);
        System.out.println();
    }

    // 사용시 메세지를 키거나 끌 수 있다.
    // usedItem(hero)를 통해 사용된 경우, 메세지가 출력되면 중복된 메세지가 출력되기 떄문에, false()를 출력.

    public void usedItemToTarget(Hero2 hero, boolean isMessaged) {
        if (isMessaged) {
            System.out.printf("%s 을 사용합니다.", name);
        }
        if (type.equals("체력")) {
            hero.healHp(amount);
        } else if (type.equals("마나")) {
            hero.healMp(amount);
        }
    }
}

