package 클래스연습;

import javax.swing.*;

class Word extends Thread{
    static int result = 0; //공유자원(static)
    @Override
    public void run(){
        System.out.println("60초 동안 문제를 맞추세요");
        while(true){
            int first = (int)(Math.random()*8+2);
            int second = (int)(Math.random()*9+1);

            String inputdata = JOptionPane.showInputDialog(first+" * "+second+" = "+" ?? ");

            int answer = Integer.parseInt(inputdata);
            if(answer == (first*second)){
                result++;
                System.out.println("[ "+first+" * "+second+" = "+answer+" ]");
            }else{
                System.out.println("당신의 답은 : "+inputdata+"\n 틀렸습니다. 답은"+first*second);
                System.out.println("지금까지 맞춘 갯수는 : "+result);
                System.exit(0);
            }
        }
    }
}
class Time extends Thread{
    @Override
    public void run(){
        for(int i=60; i>0; i--){
            try{
                System.out.println("시간 : "+i);
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("정답 맞춘 갯수 : "+Word.result);
        System.exit(0);
    }
}

class Game99 {
    public static void main(String[] args) {
        Word w = new Word();
        Time t = new Time();

        w.start();
        t.start();
    }

}

