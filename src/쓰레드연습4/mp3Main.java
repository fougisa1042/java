package 쓰레드연습4;

import javazoom.jl.player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;

public class mp3Main {
    public static void main(String[] args) {
        MP3Player mp3player = new MP3Player();
        mp3player.start();
    }
}

class MP3Player extends JFrame {
    private JButton chooseButton;
    private JButton startButton;
    private JButton pauseButton;
    private JButton resumeButton;
    private JButton stopButton;
    private JTextField pathField;

    private static final long serialVersionUID = 1L; // 시어리얼 버전
    private String filename;
    private Player player;
    private Thread thread;

    private ActionListener action = (ActionEvent e) -> {  //액션 리스터
        if(e.getSource() == chooseButton) {     //어떤 버튼을 눌렀을 때
            JFileChooser chooser = new JFileChooser("재생할 mp3파일 고르기"); //JFile 고를수 있게끔
            chooser.showOpenDialog(null);  //고르고 난뒤 대화창 보이게 끔
            filename = chooser.getSelectedFile().toString(); //고르고나면 선택한 파일을 보여주고 텍스트 출력 이게 파일네임
            if(filename == null)
                filename = "";
            if(!filename.endsWith(".mp3")) {    //.mp3아닐 경우 출력하는 것
                JOptionPane.showMessageDialog(null, "오류", "확장자가 .mp3여야 합니다.", JOptionPane.ERROR_MESSAGE);//메세지는 오류 타이틀
                filename = "";
                return;
            }
            pathField.setText(filename);//경로파일 이름을 가지고옴 그게 Filename으로 들어감
        } else if(e.getSource() == startButton) {       //시작 버튼을 눌렀을 때
            if(filename.length() == 0) {//파일의 길이가 0일 때
                JOptionPane.showMessageDialog(null, "재생할 mp3파일을 지정해 주세요.", "오류", JOptionPane.ERROR_MESSAGE);//메세지는 파일 지정 타이틀 오류
                return;
            }

            thread = new Thread(() -> {
                try {
                    player = new Player(new FileInputStream(filename));     //플레이어가 새로운 파일의 이름을 읽는다
                    player.play();
                } catch(Exception e1) {
                }
            });
            thread.start();

            startButton.setEnabled(false);      //setEnabled : 활성화 / 비활성화를 읽옴
            stopButton.setEnabled(true);
            pauseButton.setEnabled(true);
        } else if(e.getSource() == pauseButton) {       //가지오온거와 같다면 푸시함
            thread.checkAccess();           //맞는지 체크함
            pauseButton.setEnabled(false);
            resumeButton.setEnabled(true);
        } else if(e.getSource() == resumeButton) {      //재개버튼 활성화
            thread.checkAccess();
            pauseButton.setEnabled(true);
            resumeButton.setEnabled(false);
        } else if(e.getSource() == stopButton) {      //정지버튼 활성화
            thread.checkAccess();
            startButton.setEnabled(true);
            pauseButton.setEnabled(false);
            resumeButton.setEnabled(false);
            stopButton.setEnabled(false);
            player.close();
        }
    };

    void start() {
        initialize();        //초기화
    }

    private void initialize() {     //초기화
        chooseButton = new JButton("재생할 mp3파일 고르기");
        pathField = new JTextField();
        startButton = new JButton("재생");
        stopButton = new JButton("정지");
        pauseButton = new JButton("일시정지");
        resumeButton = new JButton("다시 재생");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //닫기
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(300, 220);

        chooseButton.setBounds(5, 5, 275, 30);
        chooseButton.addActionListener(action);
        chooseButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(chooseButton);

        pathField.setBounds(5, 40, 275, 30);
        add(pathField);

        startButton.setBounds(5, 75, 275, 30);
        startButton.addActionListener(action);
        startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(startButton);

        stopButton.setBounds(5, 110, 275, 30);
        stopButton.addActionListener(action);
        stopButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        stopButton.setEnabled(false);
        add(stopButton);

        pauseButton.setBounds(5, 145, 132, 30);
        pauseButton.addActionListener(action);
        pauseButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pauseButton.setEnabled(false);
        add(pauseButton);

        resumeButton.setBounds(147, 145, 132, 30);
        resumeButton.addActionListener(action);
        resumeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        resumeButton.setEnabled(false);
        add(resumeButton);

        setVisible(true);
    }
}