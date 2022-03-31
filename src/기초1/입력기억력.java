package 기초1;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class 입력기억력 {
    public static void main(String[] args) {

        javax.swing.UIManager.put("OptionPane.messgeFont" ,
        new java.awt.Font("굴림", Font.PLAIN,18));

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력하셈");
        String sc = scanner.nextLine();


        try {
            int[] q = new int[5];
            int[] a = new int[5];
            int cnk = 0;

            for (int i = 0; i <= 4; i++ ){
                String sQue =  showInputDialog("---임의의 숫자 만큼 하나씩 입력하세요---");
                int iQue = Integer.valueOf(sQue);
                q[i] = iQue;
            }

            for (int i = 0; i <= 4; i++) {
                String sAns = showInputDialog("|||방금 적었던 숫자를 만큼 적어주세요|||");
                int iAns = Integer.valueOf(sAns);
                a[i] = iAns;
            }

            for (int i = 0; i <= 4; i++){
                if (q[i] == a[i]){
                    cnk++;
                }
            }


            if (cnk == 5){
                showMessageDialog(null , "긋긋긋");
            }else {
                showMessageDialog(null , "놉");
            }
        } catch(Exception e){
            //showMessageDialog(null, e);
        }


    }
}
