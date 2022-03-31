package 쓰레드연습4;
//쓰레드 만들기(Thread 클래스 상속)

//hread 클래스를 상속받은 MyThread1을 사용하는 클래스
//Thread를 상속 받았으므로 MyThread1은 Thread이다.
//쓰레드를 생성하고, Thread 클래스가 가지고 있는 start()메소드를 호출한다.

public class MyThread1 extends Thread {
    String string;
    public MyThread1(String string){
        this.string = string;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(string);

            try {
                //컴퓨터가 너무 빠르기 때문에 수행결과를 잘 확인 할 수 없어서 Thread.sleep() 메서드를 이용해서 조금씩
                //쉬었다가 출력할 수 있게한다.
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("종료합니다");
    }
}

class ThreadExam1{
    public static void main(String[] args){
        // MyThread인스턴스를 2개 만듭니다.
        MyThread1 thread1 = new MyThread1("*");
        MyThread1 thread2 = new MyThread1("-");

        thread1.start();
        thread2.start();
        System.out.println("!!!!!");
    }
}
