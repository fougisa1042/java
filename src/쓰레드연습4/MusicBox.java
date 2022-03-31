package 쓰레드연습4;

public class MusicBox {

    synchronized void playMusicA(){
        for (int i = 1; i <= 10; i++){      //신나는 음악!!!이란 메세지가 1초 이하로 쉬면서 10번 반복출력
            System.out.println("신나는 음악!!!");
            try{
                Thread.sleep((int)(Math.random()*1000));
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    void playMusicB(){
        for (int i = 1; i <= 10; i++) {     //슬픈 음악!!!이란 메세지가 1초 이하로 쉬면서 10번 반복출력
            synchronized(this) {
                System.out.println("슬픈 음악!!!");
            }
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void playMusicC() {
        for (int i = 1; i <= 10; i++) {     //슬픈 음악!!!이란 메세지가 1초 이하로 쉬면서 10번 반복출력
            System.out.println("카페 음악!!!!!");
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

//MusicBox를 가지는 Thread객체 MusicPlayer
class MusicPlayerr extends Thread{

    int type;
    MusicBox musicBox;

    // 생성자로 부터 musicBox와 정수를 하나 받아들여서 필드를 초기화
    MusicPlayerr(int type , MusicBox musicBox){
        this.type = type;
        this.musicBox = musicBox;
    }
    // type이 무엇이냐에 따라서 musicBox가 가지고 있는 메소드가 다르게 호출

    @Override
    public void run() {
        switch(type){
            case 1 : musicBox.playMusicA();
            break;
            case 2 : musicBox.playMusicB();
            break;
            case 3 : musicBox.playMusicC();
            break;
        }
    }

}

class MusicBoxExan1{
    public static void main(String[] args){

        MusicBox box = new MusicBox();      //MusicBox 인스턴스

        MusicPlayerr kim = new MusicPlayerr(1, box);
        MusicPlayerr lee = new MusicPlayerr(2, box);
        MusicPlayerr kang = new MusicPlayerr(3, box);

        kim.start();    //MusicPlayer 쓰레드를 실행합니다
        lee.start();
        kang.start();

    }
}


//쓰레드와 상태제어(join)
//join메소드는 쓰레드가 멈출때까지 기다리게 한다.
//일단 0.5초씩 쉬면서 숫자를 출력하는 MyThread5를 작성해보자.

class MyThread5 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++){
            System.out.println("MyThread5 : " + i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class joinExam{
    public static void main (String[] agrs){
        MyThread5 thread5 = new MyThread5();

        thread5.start();
        System.out.println("Thread가 종효 될 때가지 기다립니다.");
        try{
            thread5.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread가 종료되었습니다.");

    }
}


//쓰레드와 상태제어(wait,notify)
//wait와 notify는 동기화된 블록안에서 사용해야 한다.
// wait를 만나게 되면 해당 쓰레드는 해당 객체의 모니터링 락에 대한
// 권한을 가지고 있다면 모니터링 락의 권한을 놓고 대기한다.

// 해당 쓰레드가 실행되면 자기 자신의 모니터링 락을 획득
// 5번 반복하면서 0.5초씩 쉬면서 total에 값을 누적
// 그후에 notify()메소드를 호출하여 wait하고 있는 쓰레드를 깨움
class ThreadB extends Thread {
    int total;

    @Override
    public void run() {
        synchronized(this){
            for (int i = 1; i <= 10; i++){
                System.out.println(i  + "를 더합니다.");
                total += 1;
                try {
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            notify();
        }
    }
}

class ThreadA{
    public static void main(String[] args){
        // 앞에서 만든 쓰레드 B를 만든 후 start
        // 해당 쓰레드가 실행되면, 해당 쓰레드는 run메소드 안에서 자신의 모니터링 락을 획득
        ThreadB threadB = new ThreadB();
        threadB.start();

        // b에 대하여 동기화 블럭을 설정
        // 만약 main쓰레드가 아래의 블록을 위의 Thread보다 먼저 실행되었다면 wait를 하게 되면서 모니
        synchronized(threadB){
            try{
                System.out.println("b가 완료 될 때까지 기다립니다.");
                threadB.wait();
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        //깨어난 후 결과를 출력
        System.out.println("Total is: " + threadB.total);
    }
}



class DaemonThread implements Runnable {    // Runnable을 구현하는 DaemonThread클래스를 작성

    // 무한루프안에서 0.5초씩 쉬면서 데몬쓰레드가 실행중입니다를 출력하도록 run()메소드를 작성
    @Override
    public void run() {
        while (true) {
            System.out.println("데몬 쓰레드가 실행중입니다");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;       //Exception발생시 while 문 빠wl도록
            }
        }
    }


    public static void main(String[] args) {
        // Runnable을 구현하는 DaemonThread를 실행하기 위하여 Thread 생성
        Thread thread = new Thread(new DaemonThread());
        // 데몬쓰레드로 설정
        thread.setDaemon(true);
        // 쓰레드를 실행
        thread.start();

        // 메인 쓰레드가 1초뒤에 종료되도록 설정.
        // 데몬쓰레드는 다른 쓰레드가 모두 종료되면 자동종료.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("메인 쓰레드가 종료됩니다. ");
    }
}