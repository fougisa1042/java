/*package 파석6;

    public class Timer implements Runnable {

        Monstar monstar;

        public boolean isNight = false;    // 밤과 낮을 표시함.
        public boolean isStop = false;  // Timer자체가 멈추어있다.

        public int hour = 22;                //0\8
        public boolean isLocked = false;    // 현재 Timer에 잠겨있는 쓰레드가 있다.
        public int timeValue = 10000;       // 지연시간  10000

        public synchronized void addTime() {
            if (isStop) {
                return;
            }

            ++hour;
            if (hour == 25) {
                hour = 22;       //8
            }

            //System.out.println();
            System.out.printf("현재시각 : %d시\n", hour);

        if (isLocked) {
            notifyAll();
        }

        }

    public synchronized void lockTime() {
        try {
            isLocked = true; // 특정 쓰레드를 잠금.
            wait();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public synchronized void awakeTime() {
        isStop = false;
        notify();   // 시간에 잠겨있는 특정 쓰레드를 꺠움.
    }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(timeValue / 2);

                    synchronized (this) {
                        while (isStop) {
                            wait();
                        }
                    }

                    Thread.sleep(timeValue / 2);

                    synchronized (this) {
                        while (isStop) {
                            wait();
                        }
                    }

                    addTime();
                    if (hour == 12) {        // 시간이 증가한 후에 8시면 낮.    0
                        isNight = false;
                        System.out.println();
                        System.out.println("            낮이 되었습니다.");
                        System.out.println("        .\n" +
                                           "      \\ | /\n" +
                                           "    '-.;;;.-'\n" +
                                           "   -==;;;;;==-\n" +
                                           "    .-';;;'-.\n" +
                                           "      / | \\\n" +
                                           "jgs     '");
                        System.out.println();
                    }

                    else if (hour == 24) {    // 시간이 증가한 후에 18시면 밤.   12
                        isNight = true;
                        System.out.println();
                        System.out.println("            밤이 되었습니다.");
                        System.out.println("         _.._\n" +
                                           "       .' .-'`\n" +
                                           "      /  /\n" +
                                           "      |  |\n" +
                                           "      \\  \\\n" +
                                           "jgs    '._'-._\n" +
                                           "          ```");
                        System.out.println();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/
