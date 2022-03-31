package 기초1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 과목평균내기 {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int math, kor, eng;
    final static int SUBJECT = 3;

    void input() {
        System.out.println(SUBJECT + "개의 과목 점수를 입력하시오.");
        try {
            System.out.print("국어: ");
            String line = reader.readLine();

            math = Integer.parseInt(line);
            System.out.print("수학: ");

            line = reader.readLine();
            kor = Integer.parseInt(line);

            System.out.print("영어: ");
            line = reader.readLine();
            eng = Integer.parseInt(line);
        } catch (IOException ie) {
        }
    }

    int sum(int kor, int math, int eng) {
        return kor + math + eng;
    }

    double avg(int sum, int subject) {
        return (double) sum / (double) subject;
    }

    void grade(double avg) {
        double grade = avg;
        if (grade >= 90.0)
            System.out.print("A");
        else if (grade >= 80.0)
            System.out.print("B");
        else if (grade >= 70.0)
            System.out.print("C");
        else if (grade >= 60.0)
            System.out.print("D");
        else
            System.out.print("F");
    }

    void print(int sum, double avg) {
        System.out.println("=====================");
        System.out.println("총점: " + sum + "점");
        System.out.printf("평균: %.2f점\n", avg);
        System.out.print("학점: ");
        grade(avg);
    }

    public static void main(String[] args) {
        과목평균내기 과목평균내기 = new 과목평균내기();
        과목평균내기.input();
        int sum = 과목평균내기.sum(과목평균내기.math, 과목평균내기.kor, 과목평균내기.eng);
        double avg = 과목평균내기.avg(sum, SUBJECT);
        과목평균내기.print(sum, avg);
    }
}
