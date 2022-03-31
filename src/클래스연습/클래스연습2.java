package 클래스연습;

public class 클래스연습2 {
    static class food{

      String name;
      int cost ;
      int count ;

      public void setName(String name ) {
          this.name = name;
      }
      public void setCost(int cost){
          this.cost = cost;
      }
      public void setCount(int count){
          this.count = count;
      }

        public static void main(String[] args) {
            food walpastry1 =  new food();
            food walpastry2 = new food();

            food coffoe1 = new food();
            food coffoe2 = new food();

            walpastry1.setName("팥 호두과자 ");
            walpastry2.setName("슈크림 호두과자 ");

            walpastry1.setCost(6000);
            walpastry2.setCost(5800);

            coffoe1.setName("아메리카노");
            coffoe2.setName("카푸치노 ");

            coffoe1.setCost(3000);
            coffoe2.setCost(3500);


            System.out.println(walpastry1.name+walpastry1.cost+"원");
            System.out.println(walpastry2.name+walpastry2.cost+"원");

            System.out.println(coffoe1.name+coffoe1.cost+"원");
            System.out.println(coffoe2.name+coffoe2.cost+"원");


        }


    }
}
