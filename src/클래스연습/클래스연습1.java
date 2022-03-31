package 클래스연습;

public class 클래스연습1 {
    static class car{
        String name;
        String color;
        int cost;

        public void setCost(int cost){
            this.cost = cost ;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void setColor(String color) {
            this.color = color;
        }

        public static void main(String[] args) {
            car 국산차1 = new car();
            car 국산차2 = new car();

            car 외제차1 = new car();
            car 외제차2 = new car();

            국산차1.setName("현대차 ");
            국산차2.setName("기아차 ");

            국산차1.setColor("빨강 ");
            국산차2.setColor("노랑 ");

            국산차1.setCost(20000);
            국산차2.setCost(15000);


            외제차1.setName("포르쉐 ");
            외제차2.setName("페라리 ");

            외제차1.setColor("빨강 ");
            외제차2.setColor("노랑 ");

            외제차1.setCost(30000);
            외제차2.setCost(25000);

            System.out.println(국산차1.name + 국산차1.color + 국산차1.cost );
            System.out.println(국산차2.name + 국산차2.color + 국산차2.cost );

            System.out.println(외제차1.name + 외제차1.color + 외제차1.cost );
            System.out.println(외제차2.name + 외제차2.color + 외제차2.cost );
        }
    }
}
