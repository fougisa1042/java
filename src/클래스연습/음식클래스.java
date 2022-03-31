package 클래스연습;          //패키지는 비슷한 종류의 파일들을 성격에 맞게 분류하여 새 폴더에 저장시키는 방식을 뜻한다

import java.util.Scanner;

class food {             //클래스라는 틀을 만들어주고 틀안에 상속해줄 여러 변수와 메소드를 넣어준다

    String name;          //클래스라는 틀을 만들었기에 스트링 이라는 객체변수를 넣어주고 이름이라는 변수를 넣어준다 문자열이기 때문에 스트링을 넣어주었다
    int cost;              //cost는 숫자라 객체 변수를 int로 설정해 주었다
    int count;            //수량도 숫자라 객체 변수를  int로 설정해 주었다


    public void setName(String name) {  //셋네임이라는 메소드이다 보이드는 출력을 맡고 입력은 스트링 네임을 맡는다
        this.name = name ;
    }
    public  void  setCost(int cost){  //셋코스트라는 메소드이다
        this.cost = cost ;
    }
    public void setCount (int count){     //셋 카운트라는 메소드이다
        this.count = count;
    }

    public static void main(String[] args) { //접근자 아무나 가능 스테틱 끝까지 가게 해줌 보이드 리턴이 없어 메인과 같이감

        Scanner sc = new Scanner(System.in);

//호두
        food walnutpastry1 = new food(); //클래스 객체 = NEW 클래스
        food walnutpastry2 = new food(); //클래스 객체 = NEW 클래스
        food walnutpastry3 = new food(); //클래스 객체 = NEW 클래스

        walnutpastry1.setName("팥 호두과자 ");     //객체.메소드("팥 호두과자")
        walnutpastry2.setName("슈크림 호두과자 ");  //객체.메소드("슈크림 호두과자")
        walnutpastry3.setName("치즈 호두과자 ");  //객체.메소드("치즈 호두과자")

        walnutpastry1.setCost(6000);              //호두 가격 팥 슈크림 치즈 순
        walnutpastry2.setCost(5400);
        walnutpastry3.setCost(4800);

        walnutpastry1.setCount(walnutpastry1.count);
        walnutpastry2.setCount(walnutpastry2.count);
        walnutpastry3.setCount(walnutpastry3.count);

        System.out.print("팥 호두과자 수량을 입력하세요 : ");
        walnutpastry1.count = sc.nextInt();

        System.out.print("슈크림 호두과자 수량을 입력하세요 : ");
        walnutpastry2.count = sc.nextInt();

        System.out.print("치즈 호두과자 수량을 입력하세요 : ");
        walnutpastry3.count = sc.nextInt();



// 커피

        food coffee1 = new food();       //클래스 객체 = NEW 클래스
        food coffee2 = new food();       //클래스 객체 = NEW 클래스
        food coffee3 = new food();      //클래스 객체 = NEW 클래스


        coffee1.setName("아메리카노 ");           //객체.메소드 커피 1.셋네임 ("아메리카노")
        coffee2.setName("카푸치노 ");             //객체.메소드("카푸치노")
        coffee3.setName("핫초코 ");                  //객체.메소드("초코")

        coffee1.setCost(3000);              //호두 가격 팥 슈크림 치즈 순
        coffee2.setCost(3500);
        coffee3.setCost(2500);


        coffee1.setCount(walnutpastry1.count);
        coffee2.setCount(walnutpastry2.count);
        coffee3.setCount(walnutpastry3.count);


        System.out.print("아메리카노 수량을 입력하세요 : ");
        coffee1.count = sc.nextInt();

        System.out.print("카푸치노 수량을 입력하세요 : ");
        coffee2.count = sc.nextInt();

        System.out.print("핫초코 수량을 입력하세요 : ");
        coffee3.count = sc.nextInt();

        /*  coffoe1.setCount(int); */                 //객체.메소드("초코")



        System.out.println(walnutpastry1.name + walnutpastry1.cost + "원 " +  walnutpastry1.count+"개"); //sout ("객체.변수")
        System.out.println(walnutpastry2.name + walnutpastry2.cost + "원 " +  walnutpastry2.count+"개"); //sout ("객체.변수")
        System.out.println(walnutpastry3.name + walnutpastry3.cost + "원 " +  walnutpastry3.count+"개"); //sout ("객체.변수")

        System.out.println(coffee1.name + coffee1.cost + "원 "  +  coffee1.count+"개");
        System.out.println(coffee2.name + coffee2.cost + "원 "  +  coffee2.count+"개");
        System.out.println(coffee3.name + coffee3.cost + "원 "  +  coffee3.count+"개");


    }
}


   /* public String name2;
    int cost2;



    public static void main(String[] args) {
        food walnutpastry = new food();
        food coffoe = new food();

        System.out.println(walnutpastry.name);
        System.out.println(walnutpastry.cost);
        System.out.println(coffoe.name);
        System.out.println(coffoe.cost);
    }
}*/






        //퍼블릭이란 클래스를 정의할 때 나타내는 접근자로서 다른 패키지나 클래스에서 접근 할 수 있는 접근자이다
    //클래스란 어떠한 물건을 만들기위한 틀로서 이름이나 키 나이 색 그ㅡ리고 행동들을 넣어 줄 수 있다
    //예를 들어서 클래스의 이름으로 나이 이름 키 색 이렇것 들을 넣을수 있고 행동에는 달린다 뛴다 멈춘다 등을 넣을수 있다
    //퍼블릭 클래스는 어디에서나 접근을 할 수 있다는 것이고 음식 클래스를 정해주었다면 이제 필드와 행동을 넣어줄 수 있다
    //클래스는 그야말로 틀이나 껍데기에 불가하기 때문에 안에 내용물을 넣어 주어야 한다 그 내용물은 객체라고 말할 수 있다

//    food walnutpastry = new food();
//    food coffoe = new food;

    //food 라는 클래스에는 food는 껍데기이고 틀이기 때문에 아무것도 할 수가 없다 그럼에도 클래스는 아주 중요한 기능을 가지고 잇는데 그 기능은 객체를 만드는 기능이다
    //클래스는 객체를 만드는 기능이라고 햇다 클래스가 객체를 만드려면 new라는 키워드를 가지고 있어야 한다 food라는 키워드 안에 객체는 cokie coffoe walnut 등을 만들 수 있다
    //클래스 선언 객체 = new 클래스 선언
//    String name;
    //food라는 클래스에 String이라는 변수를 추가했다 클래스에 선언된 변수를 객체 변수라고 부른다 객체 변수는 변수이므로 값을 대입할 수 있을 것이다




