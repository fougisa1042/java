package 기초1;

import java.util.Scanner;

public class buffer1 {
    public static void main(String[] args) {

        String name;
        int age;
        double height;
        String intro;
        String buffer;

        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요");
        name = sc.next();
        System.out.println("나이를 입력하세요");
        age = sc.nextInt();
        System.out.println("키를 입력하세요");
        height = sc.nextDouble();
        System.out.println("자기소개를 입력하세요");
        buffer = sc.nextLine();
        intro = sc.nextLine();

        System.out.println("이름은 "+name+"나이는 "+age+",키는 "+height+"입니다.");
        System.out.println(intro);


























        /*String 유저입력 = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("-----소집문자가 왔다-----");  // 누른 버튼으로 이동
        System.out.println("1. 입영연기");
        System.out.println("2. 입영");
        System.out.println("3. 안가");

        유저입력 = sc.nextLine();


        if (유저입력.equals("1")) {
            System.out.println("1");
            if (유저입력.equals("1")){
                System.out.println("1");
            }

            if (유저입력.equals("2")){
                System.out.println("2");
            }


        }else if (유저입력.equals("2")){
            System.out.println("2");
        }else if (유저입력.equals("3")){
            System.out.println("3");
        }*/

    }
        }

