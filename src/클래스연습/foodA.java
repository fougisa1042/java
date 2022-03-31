package 클래스연습;


public class foodA extends menuA {
        public static void main(String[] args) {

            foodA walpastry1 = new foodA();

            walpastry1.setName("팥 호두과자");

            System.out.println(walpastry1);
        }
    }

class menuA {

    String name;
    int cost;
    int count;

    public void setName(String name) {
        this.name = name;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setCount(int count) {
        this.count = count;
    }
}

