package 파석6;

import java.util.ArrayList;

public class Bag {
    int backpack;
    Shop shop;
    ArrayList<String> 인벤 = new ArrayList<>();   //전부 다 들어있음
    ArrayList<String> 가방 = new ArrayList<>();   //포션 , 소지품
    ArrayList<String> 장비 = new ArrayList<>();   //무기 , 갑옷 , 악세
    ArrayList<String> 무기 = new ArrayList<>();
    ArrayList<String> 갑옷 = new ArrayList<>();
    ArrayList<String> 악세 = new ArrayList<>();
    ArrayList<String> 포션 = new ArrayList<>();
    ArrayList<String> 소지품 = new ArrayList<>();

    void 인벤(){
        System.out.println("[인벤토리]");
        System.out.println("장비 착용 상태 " );
        System.out.println("무기 : " + 무기);
        System.out.println("갑옷 : " + 갑옷);
        System.out.println("악세 : " + 악세);
        System.out.println("[아이템]");
        System.out.println("포션 : " + 포션 );
        System.out.println("소지품 : " + 소지품);
        System.out.println("[인벤] : " + 인벤);
    }

    void 장비(){
        System.out.println("장비 : " + 장비);
    }

    void 가방(){
        System.out.println("[가방] : " + 가방);

    }

    void 담다(){
    }
}
