package 기초예제1;
import java.util.*;

class machine {
    String[] ItemName=new String[1000]; //물건의 이름을 넣어놓는배열
    int[] ItemCost=new int[1000];//물건의 가격을 넣어놓는 배열
    int[] ItemAmount=new int[1000];//물건의 수량을 넣어놓는 배열
    int index=0; //위배열들에 알맞은 인덱스에 넣기위해 만든변수
    int endpoint=0; //완벽히구매했는지 체크하는 변수
    void show() {//출력해주는 메서드 계산대에 무엇을 인식했는지 뜨는것과 같음
        for(int i=0;i<=index-1;i++) { //배열안에 들어있는것만큼 반복. 하나라도 추가하면 인덱스는 1이다.

            System.out.println("물건명 : "+ItemName[i]+" 물건가격 : "+ItemCost[i]+" 물건수량 : "+ItemAmount[i]);
        }

    }
    void barcode() {//물건을 인식(추가)시키는 메서드
        //현실은 그냥 바코드인식해서 물건이름이랑 가격을 판단함
        Scanner scanner=new Scanner(System.in);//스캐너 객체 생성
        int amountadd=0;//기존에 있던물건에 수를 한개더할떄를 판별하는 변수 0이면 정상(같은물건이 없음)
        String UserInput=""; //사용자가 입력한것을 넣어둠
        System.out.println("물건이름을 입력하세요");
        ItemName[index]=scanner.nextLine();//사용자가 입력한 물건이름을 ItemName배열의 인덱스번째에 넣음

        System.out.println("물건가격을 입력하세요");
        UserInput=scanner.nextLine();//사용자가 입력한것을 엔터이후 가져와서 UserInput에 넣어둠
        ItemCost[index]=Integer.parseInt(UserInput); //사용자가 입력한것을 int형으로 돌려 ItemCost의 인덱스번쨰에 입력한것을 넣음

        for(int i=0;i<index;i++) { //기존인식된물건중에서 또인식한것이 같은지 체크하는 포문
            if(ItemName[i].equals(ItemName[index]) && ItemCost[i]==ItemCost[index]) {//i번째 인덱스가 새로 사용자가 입력한 물건이름과 같을때.그리고 가격도 사용자와 입력한게 같을떄 들어가게됨
                ItemAmount[i]+=1; //i번쨰에 있는물건의 수량을 한개 더늘려줌
                ItemAmount[index]=0;//사용자가 입력했던건 배열에 올라가긴올라갔으므로 0값으로 만들고 그냥 중복되는 물건의 수량을 늘려줌
                ItemCost[index]=0;//없는값으로 만듬
                ItemName[index]="0";//없는값으로 만듬
                amountadd=1;//중복되는 물건이라는것을 알려줌
                //인덱스는 더해줄필요가 없음. 사용자가 입력했던걸 없앴으니 그위에 다시입력하게 해야함
            }
        }
        if(amountadd==0) {//중복되는 물건이 없을때
            ItemAmount[index]=1;//수량을 1더해줌
            index+=1;//인덱스를 1더해줌
        }
        System.out.println("삐빅./");
    }

    void delete() { //전체삭제 메서드
        index=0;//인덱스를 초기값으로 변경.
        for(int i=0;i<ItemName.length;i++) { //배열의 길이만큼 반복.

            ItemName[i]="0"; //모두 초기화
            ItemCost[i]=0;
            ItemAmount[i]=0;


        }
    }
    void ListDelete() { //리스트삭제해주는 메서드
        Scanner scanner=new Scanner(System.in); //스캐너 객체 생성
        String UserInput="";//사용자가 입력한것을 넣어놓는변수
        int UserInput2=0;//사용자가 입력한것을 숫자로 변환하여 넣어놓는변수
        System.out.println("몇번쨰것을 삭제할것인지 선택하세요");
        UserInput=scanner.nextLine();//사용자가 입력한것을 엔터친후에 가져와서 UserInput에 넣음
        UserInput2=Integer.parseInt(UserInput);//UserInput을 int로 형변환하여 UserInput2에 넣음
        for(int i=(UserInput2-1);i<=index-1;i++) {//사용자가 선택한것을 없애고 그자리를 매꿔주는 포문
            ItemName[i]=ItemName[i+1];//처음에는 i가 사용자가 고른것이니 고른것 +1인덱스에 있는걸 고른것에 매꾸고 그다음에 i+1자리에 i+2를 넣고 한다.
            ItemCost[i]=ItemCost[i+1];
            ItemAmount[i]=ItemAmount[i+1];
        }
        index-=1;//제일 마지막 i자리가 비어버리고 그자리에 사용자가 입력한것을 넣어야하니 인덱스에 1을빼준다
    }
    void buy() {//결제메서드
        Scanner scanner=new Scanner(System.in);//스캐너 객체 생성
        String UserInput="";//사용자가 입력한것을 넣어놓는변수
        int UserInput2=0;//사용자가 입력한것을 숫자로 변환하여 넣어놓는변수
        int money=0;//총합을 넣어놓기 위한 변수
        for(int i=0;i<=index-1;i++) { //배열에 들어있는 수만큼 반복하는 포문
            money+=ItemCost[i]*ItemAmount[i];//물건가격과 수량을 곱한것을 더한다.

        }
        System.out.println("결제하시겠습니까?(네/아니요)");
        UserInput=scanner.nextLine();//사용자가 입력한것을 엔터친후에 가져와서 UserInput에 넣음
        if(UserInput.equals("네")) { //결제 하려할때
            while(money>UserInput2) { //투입된돈이 넣어야돈보다 작으면 반복됨
                System.out.println("투입된돈 : "+UserInput2);
                System.out.println("투입해야되는돈 : "+money);
                System.out.println("몇원을 넣으시겠습니까?");
                UserInput=scanner.nextLine(); //사용자가 입력한것을 엔터친후에 가져와서 UserInput에 넣음
                UserInput2+=Integer.parseInt(UserInput); //UserInput을 int로 형변환하여 UserInput2에 넣음
                if(money>UserInput2) {//투입된돈이 넣어야돈보다 작으면 들어가게됨
                    System.out.println("돈이 부족합니다 더넣어주세요");
                }
            }
            if(money!=0) { //인식한것이 있을때
                System.out.println("계산되었습니다 이용해주셔서 감사합니다");

                System.out.println("영수증");
                System.out.println("총액 : "+money+"원");
                endpoint=1;//끝내라는변수를 1로해줌
            }

        }

    }
}


class Mains {

    public static void main(String[] args) {
        machine machine=new machine(); //머신객체 생성
        Scanner scanner=new Scanner(System.in);//스캐너 객체 생성
        String UserInput="";//사용자가 입력한것을 넣어놓는변수
        System.out.println("무인판매점입니다 물건을 인식시켜주세요");
        while(true) {//무한반복문
            machine.show();//머신의 show메서드실행. 인식한물건품목을 보여줌
            System.out.println("1.바코드찍기 2.전체삭제 3.리스트삭제 4.결제");
            UserInput=scanner.nextLine();//사용자가 입력한것을 엔터친후에 가져와서 UserInput에 넣음
            if(UserInput.equals("1")) { //바코드를 찍으려할떄
                machine.barcode();//머신의 barcode실행. 물건인식을 시킴
            }
            else if(UserInput.equals("2")) { //전체삭제를 하려할떄
                machine.delete();//머신의 delete실행. 전체삭제를함
            }
            else if(UserInput.equals("3")) {//리스트를 삭제하려할떄
                machine.ListDelete(); //머신의 ListDelete메서드실행시켜 리스트삭제를 시킴
            }
            else if(UserInput.equals("4")) {//결제하려할때
                machine.buy();//머신의 buy메서드 실행.
                if(machine.endpoint==1) {//끝내라는변수가 1일떄
                    break;//무한반복문 나감
                }

            }

        }

    }

}





