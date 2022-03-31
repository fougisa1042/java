package 기초1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class 입력제곱수 {
    public static void main(String[] args) {


        int i = 0;

        /*javax.swing.UIManager.put("OP.mF", new java.awt.Font("굴림", Font.PLAIN,14));*/

        try {

            int iDan;
            String sDan = showInputDialog("출력할 단");

            if (sDan != null){
                i = Integer.valueOf(sDan);

                System.out.println(i * i);
            }
        }catch (Exception e){
            showMessageDialog(null, e);
        }

    }
}
