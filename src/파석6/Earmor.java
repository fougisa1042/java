package 파석6;

public class Earmor extends Equipment{

    Earmor(String name, int cost, int upGage, int use , int count ) {
        super(name, cost, upGage, count , use);
    }

    Earmor(){}

    void armorShow() {
        Earmor Armor1 = new Earmor("[천 갑옷]", 100, 100, 0 ,0);
        Earmor Armor2 = new Earmor("[나무 갑옷]", 500, 500, 0,0);
        Earmor Armor3 = new Earmor("[철 갑옷]", 1000, 1000, 0,0);

        name = "---------------갑옷---------------";
        System.out.println(name);
        System.out.print("1." + Armor1.name + " : " + Armor1.cost + " 원");
        System.out.print("\t2." + Armor2.name + " : " + Armor2.cost + " 원");
        System.out.println("\t3." + Armor3.name + " : " + Armor3.cost + " 원");
    }

    public static void main(String[] args) {
        Earmor iWear = new Earmor();
        iWear.armorShow();
    }
}
