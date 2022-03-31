package 파석6;
import java.util.ArrayList;
import java.util.Scanner;

public class 인벤2 {
    public static void main(String[] args) {

    ArrayList<String> 가방 = new ArrayList<>();
    ArrayList<String> 장비 = new ArrayList<>();
    ArrayList<String> 무기 = new ArrayList<>();
    ArrayList<String> 갑옷 = new ArrayList<>();
    ArrayList<String> 악세 = new ArrayList<>();
    ArrayList<String> 포션 = new ArrayList<>();
    ArrayList<String> 소지품 = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
        System.out.println("입력을 해주세요");

        while(true){
            System.out.println("1.상태보기 2. 전장으로 3. 상점으로 4. 인벤토리 5. 스토리 보기");
            String number = scanner.nextLine();
            switch(number){
              case  "1":
                  System.out.println("[상태보기]");
                break;

                case  "2":
                    System.out.println("[전장으로]");
                    break;

                case  "3":
                    System.out.println("[상점으로]");
                    System.out.println("1. 장비 2. 포션 3. 아이템 4. 나가기");
                    number = scanner.nextLine();
                    switch(number){
                      case  "1":
                          System.out.println("[장비]");
                          System.out.println("1. 무기 2. 갑옷 3. 악세 4. 나가기 ");
                          number = scanner.nextLine();
                          switch(number){
                            case "1" :
                                System.out.println("[무기]");
                                System.out.println("1. 왕 무기 2. 중간 무기 3. 소무기 4. 나가기");
                                number = scanner.nextLine();
                                switch(number){
                                    case "1" :
                                        무기.add("왕 무기");
                                        break;
                                    case "2" :
                                        무기.add("중간 무기");
                                        break;
                                    case "3" :
                                        무기.add("소무기");
                                        break;
                                    default:
                                        System.out.println("나가기");
                                        break;
                                }
                              break;

                              case "2" :
                                  System.out.println("[갑옷]");
                                  System.out.println("1. 왕 갑옷 2. 중간 갑옷 3. 소 갑옷 4. 나가기");
                                  number = scanner.nextLine();
                                  switch(number){
                                      case "1" :
                                          갑옷.add("왕 갑옷");
                                          break;
                                      case "2" :
                                          갑옷.add("중간 갑옷");
                                          break;
                                      case "3" :
                                          갑옷.add("소 갑옷");
                                          break;
                                      default:
                                          System.out.println("나가기");
                                          break;
                                  }
                                  break;

                              case "3" :
                                  System.out.println("[악세]");
                                  System.out.println("1. 왕 악세 2. 중간 악세 3. 소 악세 4. 나가기");
                                  number = scanner.nextLine();
                                  switch(number){
                                      case "1" :
                                          악세.add("왕 악세");
                                          break;
                                      case "2" :
                                          악세.add("중간 악세");
                                          break;
                                      case "3" :
                                          악세.add("소 악세");
                                          break;
                                      default:
                                          System.out.println("나가기");
                                          break;
                                  }
                                  break;

                            default:
                                System.out.println("나가기");
                              break;
                          }
                          break;

                        case  "2":
                            System.out.println("[포션]");
                            System.out.println("1. 왕 포션 2. 중간 포션 3. 경험치 포션 4. 나가기 ");
                            number = scanner.nextLine();
                            switch(number){
                                case "1" :
                                    포션.add("왕 포션");
                                    break;
                                case "2" :
                                    포션.add("중간 포션");
                                    break;
                                case "3" :
                                    포션.add("경험치 포션");
                                    break;
                                default:
                                    System.out.println("나가기");
                                    break;
                            }
                            break;

                        case  "3":
                            System.out.println("[아이템]");
                            System.out.println("1. 복조리 2. 메추리 폭탄 3. 거위알 폭탄 4. 나가기 ");
                            number = scanner.nextLine();
                            switch(number){
                                case "1" :
                                    소지품.add("복조리");
                                    break;
                                case "2" :
                                    소지품.add(" 메추리 폭탄");
                                    break;
                                case "3" :
                                    소지품.add("거위알 폭탄");
                                    break;
                                default:
                                    System.out.println("나가기");
                                    break;
                            }
                        break;

                      default:
                          System.out.println("나가기");
                        break;
                    }
                    break;

                case  "4":
                    System.out.println("[인벤토리]");
                    System.out.println("장비 착용 상태 " );
                    System.out.println("무기 : " + 무기);
                    System.out.println("갑옷 : " + 갑옷);
                    System.out.println("악세 : " + 악세);
                    System.out.println("[아이템]");
                    System.out.println("포션 : " + 포션 );
                    System.out.println("소지품 : " + 소지품);
                    System.out.println("[가방] : " + 가방);
                   /* number = scanner.nextLine();
                    switch (number) {
                        case "1" -> System.out.println(장비);
                        case "2" -> System.out.println(포션);
                        case "3" -> System.out.println(아이템);
                        default -> System.out.println("나가기");
                    }*/
                    break;

                case  "5":
                    System.out.println("스토리 보기");
                    break;

              default:
                  System.out.println("나가기");
                break;
            }



        }

    }
}
