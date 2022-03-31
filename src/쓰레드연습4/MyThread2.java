package 쓰레드연습4;

//쓰레드 만들기(Runnable 인터페이스 구현)
//Runnable 인터페이스를 구현해서 쓰레드를 만드는 방법
//Runnable 인터페이스가 가지고 있는 run()메소드를 구현한다.

//Runnable 인터페이스를 구현한 MyThread2 사용하는 방법
//MyThread2는 Thread를 상속받지 않았기 때문에 Thread가 아니다.
//Thread를 생성하고, 해당 생성자에 MyThread2를 넣어서 Thread를 생성한다.
//Thread 클래스가 가진 start() 메소드를 호출한다.

public class MyThread2 implements Runnable{
    String string;
    public MyThread2(String string){
        this.string = string;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++){
            System.out.println(string);
        }
        try {
            Thread.sleep((int)(Math.random()*1000));
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class ThreadExan2{
    public static void main(String[] args) {
        MyThread2 myThread1 = new MyThread2("*");
        MyThread2 myThread2 = new MyThread2("-");

        Thread thread1 = new Thread(myThread1);
        Thread thread2 = new Thread(myThread2);

        thread1.start();
        thread2.start();
        System.out.println("!!!!!");
    }
}