package 파석6;

import static 파석6.Time.sec;
import static 파석6.Time.time;

public class Timeshow extends Thread{
    Monstar monstar;

    Timeshow(Monstar monstar){
        this.monstar = monstar;
    }

    @Override
    public void run() {
        while (true) {
            if (time == 0 && sec == 1 ) { //30초동안 낮지속

            } else if (time == 1 && sec == 1) { //30초동안 밤 지속

            }else if (time == 0 && sec <= 2){      //낮에 스텟 증가
                monstar.setHp(monstar.getHp() - 9);
                monstar.setMaxHp(monstar.getMaxHp() - 9);
                monstar.setAd(monstar.getAd() - 9);

                /*monstar.stateShow(monstar);
                System.out.println();*/
            }

            else if (time == 1 && sec <= 1){      //밤에 스텟 증가
                monstar.setHp(monstar.getHp() + 9);
                monstar.setMaxHp(monstar.getMaxHp() + 9);
                monstar.setAd(monstar.getAd() + 9);

               /* monstar.stateShow(monstar);
                System.out.println();*/
            }

            //예외처리0
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
