package 쓰레드연습4;

public class StatePrintThread extends Thread {
    private Thread targetThread;

    public StatePrintThread(Thread targetThread) { // 상태를 조사할 스레드
        this.targetThread = targetThread;
    }

    public void run() {
        while (true) {
            Thread.State state = targetThread.getState();       // 스레드 상태 얻기
            System.out.println("타겟 스레드 상태: " + state);
            if (state == Thread.State.NEW) {
                targetThread.start();       //객체 새성 상태일 경우, 실행 대기 상태로 만듬

            }
            if (state == Thread.State.TERMINATED) {
                break;      // 종료 상태일 경우 while문을 종료
            }
            try {
                //0.5초간 일시 정지듬
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}


class TargetThread extends Thread {
    public void run() {
        for (long i = 0; i < 1000000000; i++) {
        }
        try {
            Thread.sleep(1500);         //1.5초간 일시 정지
        } catch (Exception e) {
        }
        for (long i = 0; i < 1000000000; i++) {
        }
    }
}


//실행 클래스
class ThreadStateExample {
    public static void main(String[] args) {
        StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
        statePrintThread.start();
    }
}

