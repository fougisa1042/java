package 상속예제;

public class Teacher extends person{

    private int 번호 ;
    private int 월급 ;
    private int 연차 ;

    public Teacher(String name, int age, int height, int weight,
                   int 번호, int 월급 , int 연차) {
        super(name, age, height, weight);
        this.번호 = 번호;
        this.월급 = 월급;
        this.연차 = 연차;
    }

    public int get번호() {
        return 번호;
    }

    public void set번호(int 번호) {
        this.번호 = 번호;
    }

    public int get월급() {
        return 월급;
    }

    public void set월급(int 월급) {
        this.월급 = 월급;
    }

    public int get연차() {
        return 연차;
    }

    public void set연차(int 연차) {
        this.연차 = 연차;
    }



    public void show(){
        System.out.println("________________");
        System.out.println("교사 이름 :" +getName());
        System.out.println("교사 나이 :" +getAge());
        System.out.println("교사 키 :" +getHeight());
        System.out.println("교사 몸무게 :" +getWeight());
        System.out.println("교사 번호 :" +get번호());
        System.out.println("교사 월급 :" +get월급());
        System.out.println("교사 연차 :" +get연차());
        System.out.println("-------------------");
    }



}
