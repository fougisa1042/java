package 기초1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class 입력구구단 {
    public static void main(String[] args) {

                /*javax.swing.UIManager.put("OP.mF", new java.awt.Font("굴림", Font.PLAIN,14));*/
        try {

            int iDan;
            String sDan = showInputDialog("출력할 단");

            if (sDan != null){
                iDan = Integer.valueOf(sDan);

                for (int i=2; i<=9; i++) {
                    System.out.println(iDan * i);
                }
            }
        }catch (Exception e){
            showMessageDialog(null, e);
        }

            }
        }
