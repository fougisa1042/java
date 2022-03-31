package 파석6;

public class Ipotion extends Item{

    Ipotion(String name, int cost, int upGage, int count) {
        super(name, cost, upGage, count);
    }

    Ipotion(){    }

    void potionShow(){
        Ipotion hpPotion1 = new Ipotion("[큰 체력 물약]" , 300 , 500,0);
        Ipotion hpPotion2 = new Ipotion("[작은 체력 물약]" , 100 , 100,0);
        Ipotion expPotion = new Ipotion("[경험치 물약]" , 100 , 100,0);

        name = "---------------물약---------------";
        System.out.println(name);
        System.out.print("1." + hpPotion1.name + " : " + hpPotion1.cost + " 원");
        System.out.print("\t2." + hpPotion2.name + " : " + hpPotion2.cost + " 원");
        System.out.println("\t3." + expPotion.name + " : " + expPotion.cost + " 원");
    }

    public static void main(String[] args) {
        Ipotion iPotion = new Ipotion();
        iPotion.potionShow();
    }
}
