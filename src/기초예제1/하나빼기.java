package 기초예제1;

import java.util.Scanner;

class 하나빼기Main {

    public static void main(String[] args) {
        Game game=new Game(); //게임클래스의 객체생성
        System.out.println("하나뺴기 게임을 시작합니다");
        game.Startgame(); //startgame메서드를 실행시킴.

    }

}

class Game{
    String FirstPick=""; //사용자가 첫번째로 입력한것을 넣어놓기 위해 만든변수
    String TwoPick=""; //사용자가 두번째로 입력한것을 넣어놓기 위해 만든 변수
    String BotFirstPick=""; //컴퓨터가 첫번째로 고른것을 넣어놓기 위해 만든 변수
    String BotTwoPick=""; // 컴퓨터가 두번째로 고른것을 넣어놓기 위해 만든 변수
    String LastPick=""; // 사용자가 두개중 한개를 골랐을때 그걸 넣어놓기 위해 만든 변수
    String BotLastPick=""; // 컴퓨터가 두개중 한개를 골랐을때 그걸 넣어놓기 위해 만든 변수

    void Startgame() { //게임순서를 순차대로 실행시키는 메서드
        FirstPicker(); //사용자가 첫번쨰것을 고르는 곳
        TwoPicker(); //사용자가 두번쨰것을 고르는곳
        BotPicker(); //컴퓨터가 첫번쨰와 두번쨰것을 고르는곳
        Result(); //사용자와 컴퓨터가 무엇을 뽑았는지 알려주는곳
        Sub(); //하나뺴기를 하는곳
        SubResult(); //하나뺴기를 했을때의 결과를 보여주는곳
        Winner(); // 결과를 알려주는곳
    }

    void FirstPicker(){ //사용자가 첫번쨰 가위바위보를 고르는곳
        System.out.println("가위,바위,보중 한개를 고르세요(1번쨰) : ");
        Scanner scanner = new Scanner(System.in); //지역변수 스캐너를 불러옴
        FirstPick = scanner.nextLine(); //엔터를 누르면서 넘어온 문장을 사용자가 첫번쨰로 고른걸 넣어놓는곳에 넣어둠
        if(!(FirstPick.equals("가위")) && !(FirstPick.equals("바위")) && !(FirstPick.equals("보"))) { //잘못입력하지않았는지 체크함
            System.out.println("잘못입력하셨습니다 다시입력하세요");
            FirstPicker(); //메서드를 다시불러줌
        } //잘입력하면 그냥 끝남.
    }

    void TwoPicker() { //사용자가 두번쨰 가위바위보를 고르는곳
        System.out.println("가위,바위,보중 한개를 더 고르세요(2번쨰) : ");
        Scanner scanner = new Scanner(System.in); //지역변수 스캐너를 불러옴
        TwoPick = scanner.nextLine(); //엔터를 치면서 넘어온 문장을 TwoPick에 넣어둠
        if(!(TwoPick.equals("가위")) && !(TwoPick.equals("바위")) && !(TwoPick.equals("보"))) { //잘못입력했는지 체크함
            System.out.println("잘못입력하셨습니다 다시입력하세요");
            TwoPicker(); //다시 불러옴
        }
    }

    void BotPicker() { //컴퓨터가 가위바위보를 고르는곳
        int RandomF= ((int)(Math.random()*3)+1); //1부터3까지 한개를 고른후 RandomF지역변수에 넣어둠 (int형으로 형변환 안하면 소수점까지 나옴)
        int RandomT= ((int)(Math.random()*3)+1); //1부터3까지 한개를 고른후 RandomT지역변수에 넣어둠
        if(RandomF==1) { //뽑은게 1일시
            BotFirstPick="가위";
        }
        else if(RandomF==2) { //뽑은게 2일시
            BotFirstPick="바위";
        }
        else { //뽑은게 3일시
            BotFirstPick="보";
        }
        if(RandomT==1) { //두번쨰로 뽑은게 1일시
            BotTwoPick="가위";
        }
        else if(RandomT==2) { //두번째로 뽑은게 2일시
            BotTwoPick="바위";
        }
        else { //두번쨰로 뽑은게 3일시
            BotTwoPick="보";
        }
    }

    void Result() { //컴퓨터와 사용자가 무엇을 뽑았는지 보여줌
        System.out.println("나 : "+FirstPick+" , "+TwoPick);
        System.out.println("봇 : "+BotFirstPick+" , "+BotTwoPick);
    }

    void Sub() { //하나뺴기를 하는곳
        System.out.println(FirstPick+"와 "+TwoPick+"중 한개를 고르세요");
        Scanner scanner=new Scanner(System.in); //스캐너를 불러옴
        LastPick=scanner.nextLine(); //엔터후에 넘어온문장을 LastPick에 넣어둠
        if(!(LastPick.equals(FirstPick)) && !(LastPick.equals(TwoPick))) { //잘못입력하지않았는지 체크
            System.out.println("잘못입력하셨습니다 다시입력하세요");
            Sub(); //다시 메서드 실행
        }
        int Random=(int)(Math.random()*2)+1; //1부터 2까지 랜덤수를 뽑아서 Random지역변수에 넣어둠
        if(Random==1) { //뽑은게 1일시
            BotLastPick=BotFirstPick; //첫번쨰로 컴퓨터가 뽑은걸 하나빼기문장으로 정함
        }
        if(Random==2) { //뽑은게 2일시
            BotLastPick=BotTwoPick; //두번쨰로 컴퓨터가 뽑은걸 하나빼기문장으로 정함
        }

    }

    void SubResult() { //하나빼기의 결과를 보여주는곳
        System.out.println("나 : "+LastPick);
        System.out.println("컴퓨터 : "+BotLastPick);
    }

    void Winner() { //누가이겼는지 판단해주는곳
        if(LastPick.equals("가위")) { //가위를 사용자가 하나빼기문장으로 선택했을떄
            if(BotLastPick.equals("가위")) { //컴퓨터가 가위를 냈는지 체크
                System.out.println("똑같은걸 냈습니다!.. 게임끝");
            }
            else if(BotLastPick.equals("바위")) { //컴퓨터가 바위를 냈는지 체크
                System.out.println("사용자가 패배하였습니다.. 컴퓨터승!");
            }
            else if(BotLastPick.equals("보")) { //컴퓨터가 보를 냈는지 체크
                System.out.println("사용자가 승리하였습니다.. 사용자승!");
            }
        }
        else if(LastPick.equals("바위")) { //바위를 사용자가 하나빼기문장으로 선택했을떄
            if(BotLastPick.equals("가위")) { //컴퓨터가 가위를 냈는지 체크
                System.out.println("사용자가 승리하였습니다.. 사용자승!");
            }
            else if(BotLastPick.equals("바위")) { //컴퓨터가 바위를 냈는지 체크
                System.out.println("똑같은걸 냈습니다!.. 게임끝");
            }
            else if(BotLastPick.equals("보")) { //컴퓨터가 보를 냈는지 체크
                System.out.println("사용자가 패배하였습니다.. 컴퓨터승!");
            }
        }
        else if(LastPick.equals("보")) { //보를 사용자가 하나빼기문장으로 선택했을떄
            if(BotLastPick.equals("가위")) { //컴퓨터가 가위를 냈는지 체크
                System.out.println("사용자가 패배하였습니다.. 컴퓨터승!");
            }
            else if(BotLastPick.equals("바위")) { //컴퓨터가 바위를 냈는지 체크
                System.out.println("사용자가 승리하였습니다.. 사용자승!");
            }
            else if(BotLastPick.equals("보")) { //컴퓨터가 보를 냈는지 체크
                System.out.println("똑같은걸 냈습니다!.. 게임끝");
            }
        }
    }

}



