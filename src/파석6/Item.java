package 파석6;

public class Item {
    String name;
    int cost;
    int upGage;
    int count;

    Item(){}

    Item(String name , int cost , int upGage ,int count){       //이름 , 가격 , 업게이지 , 개수 , 내구도
        this.name = name;
        this.cost = cost;
        this.upGage = upGage;
        this.count = count;
    }

    void itemShow(){
        Eweapon weapon = new Eweapon();
        Earmor armor = new Earmor();
        Eaccess access = new Eaccess();

        Ipotion potion = new Ipotion();
        Ietc etc = new Ietc();

        name = "---------------[상점]---------------";
        System.out.println(name);
        weapon.weaponBuy();
        armor.armorShow();
        access.accessShow();

        potion.potionShow();
        etc.etcShow();
    }


    public static void main(String[] args) {
        Item item = new Item();
        item.itemShow();
    }
}



    /*Item(String name , int cost , int upGage){
        this(name , cost , upGage,0);
    }

    public int getCost() {    //get
        return cost;
    }

    public int getCount() {
        return count;
    }

    public int getUpGage() {
        return upGage;
    }


    public Item getAdEnhance() {//객체들
        return adEnhance;
    }

    public Item getHpPotion() {
        return hpPotion;
    }

    public Item getExpPotion() {
        return expPotion;
    }

    public Item getMaxHpEnhance() {
        return maxHpEnhance;
    }


    public void setCost(int cost) {    //set

        this.cost = cost;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setUpGage(int upGage) {
        this.upGage = upGage;
    }*/