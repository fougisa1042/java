package 쓸것;
import java.util.ArrayList;
import java.util.Scanner;

public class Tips {

    // Tips 클래스는, 랜덤으로 팁을 가지고 있습니다.
    // 1. 가진 Information 중에서 랜덤으로 팁을 출력하는 역할을 합니다.
    // 2. 한번 출력된 Information은 isShowed 상태가 됩니다.
    // 3. 모든 팁을 출력했을 경우, isShowed인 Information은 전부 표시되고, 그렇지 않은 것은 ?로 표시됩니다.


    //Information 클래스에 대한 설명.
    //information은 특정 text가 노출되었는지 저장된 Data 클래스입니다.

public class Information {
        public String text;                 // 정보의 내용이 담긴 변수입니다.
        public boolean isShowed = false;    // 정보를 본 적이 있는지 확인하는 변수입니다. 기본 false고, 확인 후에 true가 됩니다.

        public Information(String text) {
            this.text = text;
        }
}


    public ArrayList<Information> information = new ArrayList<Information>(){};

    //사용 예제
    /*
    public ArrayList<Information> information = new ArrayList<Information>(
            Arrays.asList(new Information("1. 스킬에는 단일 대상과 전체 대상 스킬이 있습니다."),
                    new Information("2. 고블린이 드랍한 아이템은 버리세요. 복용시 피해에 대해선 책임지지 않습니다."),
                    new Information("3. 전투 중에는 단일 대상 소비 아이템만 사용할 수 있습니다."),
                    new Information("4. 필드에 나가서 사냥을 하다보면 확률적으로 다음 지역이 해금됩니다."),
                    new Information("5. 모든 영웅이 쓰러지면 게임에서 패배합니다."),
                    new Information("6. 쓰러진 영웅은 여관에서 치료해야 합니다. 길거리 휴식으로는 일어나지 않습니다. "),
                    new Information("7. 사망한 영웅은 모든 경험치를 잃습니다."),
                    new Information("8. 길거리에서 휴식을 취하면 Gold 소비 없이 체력을 회복할 수 있습니다."),
                    new Information("9. 맵에 끝에는 고블린 로드가 살고 있습니다."),
                    new Information("10. 쓰러진 영웅은 회복 전까지, 레벨만 확인할 수 있습니다."),
                    new Information("11. 전투시에는 제한된 정보만 확인할 수 있습니다."),
                    new Information("12. 스텟은 순수 스텟만 표시되며, 장비 스텟은 아래에 따로 표기됩니다."),
                    new Information("13. 장비 스텟은 데미지 계산시 합산합니다."),
                    new Information("14. 장비는 영웅 당 하나 밖에 사용할 수 없습니다."),
            )
    );
*/
    // 한 줄짜리 팁을 랜덤으로  출력하는 함수입니다.
    public void printTips() {
        int num = (int) (Math.random() * 100) % information.size(); // 가진 Information 전체 중에서 랜덤으로 하나를 선택합니다.
        System.out.print("[Tip] ");
        System.out.println(information.get(num).text);     //선택한 Information을 출력합니다.
        information.get(num).isShowed = true;   // 출력 이후에, 해당 information을 isShowed로 바꿉니다.
    }

    // 현재까지 보았던 Tip을 볼 수 있는 UI 입니다.
    public void printAction() {
        int num;
        int page = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------------------");
        System.out.println("이곳에서는 현재까지 봤던 팁을 모아서 볼 수 있습니다.");
        System.out.println("-------------------------------------------");
        while (true) {
            printAllTip(page);
            System.out.println();
            System.out.println("7. 이전 페이지    9. 다음페이지    (다른숫자) 나가기");
            num = scanner.nextInt();
            switch (num) {
                case 7:
                    if (page == 0) {            // 첫 페이지에서 이전페이지로 갈 경우, 마지막 페이지가 출력됩니다.
                        page = getPageMax();
                    } else {
                        --page;
                    }
                    continue;
                case 9:
                    if (page >= getPageMax()) { // 마지막 페이지에서 다음 페이지로 갈 경우, 첫 페이지가 출력됩니다.
                        page = 0;
                    } else {
                        ++page;
                    }
                    continue;
                default:
                    break;
            }
            break;
        }

    }

    public int pageCount = 10; // 한 페이지에 얼만큼의 Informtaion을 출력할 것인가?

    public int getPageMax() {
        int pageMax = information.size() / pageCount - 1;
        if (information.size() % pageCount != 0) {
            pageMax += 1;
        }

        return pageMax;
    }

    // 전체 Tip을 출력함.
    public void printAllTip(int page) {
        int startPage = page * pageCount;
        int endPage = Math.min(page * pageCount + pageCount, information.size());
        System.out.println();
        System.out.println("==================================================================");
        System.out.println("                    (> TIP <)");
        System.out.println();
        for (int i = startPage; i < endPage; ++i) {
            if (information.get(i).isShowed) {
                System.out.println(information.get(i).text);
            } else {
                System.out.print(i + 1);
                System.out.print(". ");
                System.out.println("????");
            }
        }
        System.out.println();
        System.out.printf("                     -%d-\n", page + 1);
        System.out.println("==================================================================");
    }
}


