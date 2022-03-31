package 상속예제;

import java.util.Scanner;

public class 메인 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println( " 총 몇명? (배열수 )");
        int n = sc.nextInt();


        //학생
        Student student1 = new Student("조재석",32 ,163 ,55 , "1111048" ,3 ,4.1 );
        Student student2 = new Student("김석영",31 ,167 ,47 , "1311051" ,3 ,3.8 );
        Student student3 = new Student("정명수",21 ,169 ,55 , "0010713" ,1 ,3.8 );


        //선생님
        Teacher teacher1 = new Teacher("이숭인", 38 , 171 , 55 , 44512587, 400 , 5);
        teacher1.show();

        Teacher teacher2 =new Teacher("감스트", 34 , 180 , 90 , 20202202,500 ,10);
        teacher2.show();

        student1.show();
        student2.show();
        student3.show();

        Student[] students = new Student[100];

        for(int i = 0; i< n ; i++){
            students[i].show();
            String name;
            int age;
            int height;
            int weight;
            String studentID;
            int grade;
            double gPA;


            System.out.println("학생 이름을 입력하세요 ");
            name = sc.next();
            System.out.println("학생 나이를 입력하세요 ");
            age = sc.nextInt();
            System.out.println("학생 키를 입력하세요 ");
            height = sc.nextInt();
            System.out.println("학생 몸무게 입력하세요 ");
            weight = sc.nextInt();

            System.out.println("학생 학번 입력하세요 ");
            studentID = sc.next();
            System.out.println("학생 학년 입력하세요 ");
            grade = sc.nextInt();
            System.out.println("학생 학점  입력하세요 ");
            gPA = sc.nextInt();
        }





    }
}
