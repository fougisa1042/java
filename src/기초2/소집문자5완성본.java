package 기초2;

import java.util.Scanner;

public class 소집문자5완성본 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String 유저입력 = "";
        int 개월입력 = 0;
        String 개월출력 = "";

        System.out.println("---선택해 주세요---");
        System.out.println("1. 입영연기 ");
        System.out.println("2. 입영 후 ");
        System.out.println("3. 안가 ");

        유저입력 = sc.nextLine();

        //2-1 입영연기
        if (유저입력.equals("1")) {
            System.out.println("---입영연기---");
            System.out.println("1. 산업체");
            System.out.println("2. 전문연");
            유저입력 = sc.nextLine();

            //3-1 산업체 자격증
            if (유저입력.equals("1")){
                System.out.println("---산업체 자격증---");
                System.out.println("1. 산업체 취득 ");
                System.out.println("2. 산업체 탈락 ");
                유저입력 = sc.nextLine();

                //4-1 면접
                if (유저입력.equals("1")){
                    System.out.println("---산업체 면접---");
                    System.out.println("1. 입사");
                    System.out.println("2. 실패");

                    유저입력 = sc.nextLine();

                    //5-1 산업체 입사 성공 후
                    if (유저입력.equals("1")){
                        System.out.println("---산업체 입사 성공 후---");
                        System.out.println("1. 정상복무");
                        System.out.println("2. 탈영");
                        System.out.println("3. 퇴사");
                        유저입력 = sc.nextLine();

                        //6-1 퇴사 후
                        if (유저입력.equals("3")){
                            System.out.println("---퇴사 후---");
                            System.out.println("1. 면접");
                            System.out.println("2. 안가");
                            System.out.println("3. 입영");
                            유저입력 = sc.nextLine();
                        }else if (유저입력.equals("1")){
                            System.out.println("면접");
                        }else if (유저입력.equals("2")){
                            System.out.println("안가");
                        }
                    }
                }
                }

            //3-2 전문연 학위
            else if (유저입력.equals("2")){
                System.out.println("---전문연 학위---");
                System.out.println("1. 전문연 취득 ");
                System.out.println("2. 전문연 탈락 ");
                유저입력 = sc.nextLine();

                //4-1 전문연 면접
                if (유저입력.equals("1")){
                    System.out.println("---전문연 면접---");
                    System.out.println("1. 입사");
                    System.out.println("2. 실패");
                    유저입력 = sc.nextLine();

                    //5-2 입사 성공 후
                    if (유저입력.equals("1")){
                        System.out.println("---입사 성공 후---");
                        System.out.println("1. 정상복무");
                        System.out.println("2. 탈영");
                        System.out.println("3. 퇴사");
                        유저입력 = sc.nextLine();

                        //6-2 퇴사 후
                        if (유저입력.equals("3")){
                            System.out.println("---퇴사 후---");
                            System.out.println("1. 면접");
                            System.out.println("2. 안가");
                            System.out.println("3. 입영");
                            유저입력 = sc.nextLine();
                        }else if (유저입력.equals("2")){
                            System.out.println("안가");
                        }else if (유저입력.equals("1")){
                            System.out.println("면접");
                        }
                    }


                }

            }

        }

//1-2 입영 후
        else if (유저입력.equals("2")) {
            System.out.println("---입영 후---");
            System.out.println("1.정상복무");
            System.out.println("2.탈영");
            유저입력 = sc.nextLine();
            //2-1
            if (유저입력.equals("1")){
                System.out.println("정상복무");
            }
            else if (유저입력.equals("2")){
                System.out.println("탈영");
            }
        }

// 1-3 안가
        else if (유저입력.equals("3")) {
            System.out.println("병무청 : 언제 오시나요? (1 ~ 12");
            개월입력 = sc.nextInt();
            System.out.println("정명수 : "+ 개월입력 +"월에 갈거임");
            /*유저입력 = sc.nextLine();*/
                switch (개월입력) {
                    case 1:  개월출력 = "January";
                        break;
                    case 2:  개월출력 = "February";
                        break;
                    case 3:  개월출력 = "March";
                        break;
                    case 4:  개월출력 = "April";
                        break;
                    case 5:  개월출력 = "May";
                        break;
                    case 6:  개월출력 = "June";
                        break;
                    case 7:  개월출력 = "July";
                        break;
                    case 8:  개월출력 = "August";
                        break;
                    case 9:  개월출력 = "September";
                        break;
                    case 10: 개월출력 = "October";
                        break;
                    case 11: 개월출력 = "November";
                        break;
                    case 12: 개월출력 = "December";
                        break;
                    default: 개월출력 = "그냥 기다려";
                        break;
                }
                System.out.println(개월출력);

        }
    }
}
