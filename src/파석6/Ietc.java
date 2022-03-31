package 파석6;

public class Ietc extends Item {

    Ietc(String name, int cost, int upGage, int count) {
        super(name, cost, upGage, count);
    }

    Ietc() {
    }

    void etcShow() {
        Item mon1Tnt = new Item("[메추리 폭탄]", 100, 100, 0);
        Item mon2Tnt = new Item("[거위 폭탄]", 200, 200, 0);
        Item lucky = new Item("[복조리]", 100, 100, 0);

        name = "---------------기타---------------";
        System.out.println(name);
        System.out.print("1." + mon1Tnt.name + " : " + mon1Tnt.cost + " 원");
        System.out.print("\t2." + mon2Tnt.name + " : " + mon2Tnt.cost + " 원");
        System.out.println("\t3." + lucky.name + " : " + lucky.cost + " 원");
    }

    public static void main(String[] args) {
        Ietc ietc = new Ietc();
        ietc.etcShow();
    }


}
