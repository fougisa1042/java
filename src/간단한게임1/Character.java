package 간단한게임1;

public class Character {


    //이름이 존재


    String name;

    int maxHp; //최대체력

    int hp; // 체력

    int maxMp; // 최대마나

    int mp; //마나

    int att; // 공격력

    int def; //방어력

    int exp; // 경험치

    int level; // 레벨

    Item[] items; //보유 아이템

    //지금은 컴파일에러가 나지만 Item이라는 클래스를 만들면 사라질 것이다.


    //변수를 초기화해야하는데 생성자를 통해 초기화를 해줄거야.


    //생성자는 클래스이름과 동일한


    Character(String name, int hp, int mp, int att, int def) {

        this.name = name;

        this.maxHp = hp;

        this.hp = this.maxHp;

        this.mp = this.maxMp;

        this.att = att;

        this.def = def;

        this.level = 1;

        this.exp = 0;

        this.items = new Item[10];


    }

    //상태를 볼 수 있는 화면

    void showInfo() {

        System.out.println("=================================================");

        System.out.println("-------------------상태---------------------------");

        System.out.println("이름 : " + name);

        System.out.println("레벨 : " + level + "(" + exp + "/100)");  //100이 넘어가면 레벨업을 해주는걸 표현

        System.out.println("체력 : " + maxHp);

        System.out.println("마나 : " + maxMp);

        System.out.println("공격 : " + att);

        System.out.println("방어 : " + def);

        System.out.println("-------------------아이템---------------------------");

        for (int i = 0; i < items.length; i++) {

            if (items[i] != null) {

                System.out.println(items[i].itemInfo());

            }

        }

        System.out.println("=================================================");


    }


    void attack(Monster m) {

        int damage = att - m.def;

        //(공격력에서 - 방어력 뺴기)

        damage = damage <= 0 ? 1 : damage;

        m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage;

        System.out.println(name + "가 공격으로" + m.name + "에게" + damage + "만큼 데미지를 주었습니다.");


        System.out.println(m.name + " 의 남은 hp : " + m.hp);

        //m.은 몬스터

    }


    //경험치 획득


    void getExp(int exp) {

        System.out.println(exp + "의 경험치를 획득하셨습니다.");

        this.exp += exp;

        while (100 <= this.exp) {

            levelUp();

            this.exp -= 100;

            //레벨업을 할때 마다 100씩 감소 ( 100이상이되면 1씩 레벨업 )

        }


    }


    void levelUp() {

        level++;

        maxHp += 10;

        maxMp += 5;

        att += 2;

        def += 2;

        hp = maxHp; // 게임에서 레벨업이 되면 체력을 100프로로 체워주고 시작하는것.

        mp = maxMp;

        System.out.println("LEVEL UP !!");

    }


    void getItem(Item item) {

        System.out.println(item.name + " 을 획득하였습니다. ");

        for (int i = 0; i < items.length; i++) {

            if (items[i] == null) {

                items[i] = item;

                break;

            }

        }


        maxHp += item.hp;

        maxMp += item.mp;

        att += item.att;

        def += item.def;


    }


}
