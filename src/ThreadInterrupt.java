public class ThreadInterrupt extends Thread{
    public static void main(String[] args) {

        ThreadInterrupt threadInterrupt = new ThreadInterrupt("zz");
        threadInterrupt.start();
        try {
            Thread.sleep(3000);

        }catch (InterruptedException e){        }
        threadInterrupt.interrupt();
    }


    // 출력 생성자
    ThreadInterrupt(String s)
    {
        super(s);
    }

    public void run()
    {
        try
        {
            for (int i = 0 ; i < 10 ; i++)
            {
                Thread.sleep(1000);
                System.out.println(getName() + i + "번쨰 수행");
            }
        }catch(InterruptedException e)
        {    // 인터럽트 걸릴시
            System.out.println("스레드 강제 종료");
            return;
        }
    }
}

