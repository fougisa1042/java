package 파석6;

public class Eaccess extends Equipment{

    Eaccess(String name, int cost, int upGage, int use , int count ) {
        super(name, cost, upGage, count , use);
    }

    Eaccess(){}

    void accessShow() {
        Eaccess eaccess1 = new Eaccess("[천 스티커]", 100, 100, 0 ,0);
        Eaccess eaccess2 = new Eaccess("[나무 스티커]", 500, 500, 0,0);
        Eaccess eaccess3 = new Eaccess("[철 스티커]", 1000, 1000, 0,0);

        name = "---------------악세---------------";
        System.out.println(name);
        System.out.print("1." + eaccess1.name + " : " + eaccess1.cost + " 원");
        System.out.print("\t2." + eaccess2.name + " : " + eaccess2.cost + " 원");
        System.out.println("\t3." + eaccess3.name + " : " + eaccess3.cost + " 원");
    }

    public static void main(String[] args) {
        Eaccess eaccess = new Eaccess();
        eaccess.accessShow();
    }
}
