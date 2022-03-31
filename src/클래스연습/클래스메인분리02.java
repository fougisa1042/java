package 클래스연습;

public class 클래스메인분리02 {
    public static void main(String[] args) {

        클래스메인분리01 pe = new 클래스메인분리01();

        pe.age = 40;
        pe.name = "James";
        pe.children = 3;
        pe.peopleinfo();


    }
}

class 클래스메인분리01 {


    public int age;
    public String name;
    public boolean isMarried;
    public int children;

    public void peopleinfo() {

        System.out.println("나이 :"+age);
        System.out.println("이름 :"+name);
        System.out.println("결혼 여부 :"+isMarried);
        System.out.println("자녀 수 :"+children);
    }
}
