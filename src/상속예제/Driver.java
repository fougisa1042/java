package 상속예제;

public class Driver {

    public static void main(String[] args) {
        Pizza cheesePizza = new Pizza("치즈피자", "미국", 10000);

        cheesePizza.showName();     //치즈피자
        cheesePizza.showNation();   //미국
        cheesePizza.showPrice();    //10000

        Pasta creamPasta = new Pasta("크림파스타", "이탈리아", 12000);

        creamPasta.showName();     //크림파스타
        creamPasta.showNation();   //이탈리아
        creamPasta.showPrice();    //12000
    }

}
