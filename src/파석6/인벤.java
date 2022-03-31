package 파석6;
import java.util.ArrayList;
import java.util.Scanner;

public class 인벤 {
    public static void main(String[] args) {

        ArrayList<String> 인벤 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("상점 입장");

        while(true) {
            System.out.println("1. 파란 2. 빨간 3. 암거 4. 인벤 5. 지우기");
            String number = scanner.nextLine();
            switch (number) {
                case "1":
                    if(인벤.get(0) == null){
                        인벤.add("파란");
                        인벤.add("1");
                        break;
                    }
                    else if(인벤.get(0).equals("파란")){
                        인벤.add(1, String.valueOf(Integer.parseInt(인벤.get(0)) + 1));
                        break;
                    }
                    break;

                case "2":
                    인벤.add("빨간");
                    인벤.add("1");
                    break;

                case "3":
                    인벤.add("암거");
                    인벤.add("1");
                    break;

                case "4":
                    System.out.println(인벤);
                    break;

                case "5":
                    인벤.remove(0);
                    System.out.println("포션 마시기");
                    System.out.println(인벤);
                    break;

                default:
                    System.out.println("다시 입력해");
                    break;
            }
        }


    }
}
