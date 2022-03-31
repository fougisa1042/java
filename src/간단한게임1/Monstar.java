package 간단한게임1;

class Monster {


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


    //생성자 만들기 - 여러종류의 몬스터가 하나의 클래스를 사용, 이름이 달라지고 능력치 속성이 달라짐 -> 한번에 하려고 생성자


    Monster(String name, int hp, int mp, int att, int def, Item[] items) {

        this.name = name;

        this.maxHp = hp;

        this.hp = this.maxHp;

        this.mp = this.maxMp;

        this.att = att;

        this.def = def;

        this.items = items;

    }


    void attack(Character m) {

        int damage = att - m.def;

        //(공격력에서 - 방어력 뺴기)

        damage = damage <= 0 ? 1 : damage;

        m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage;

        System.out.println(name + "가 공격으로" + m.name + "에게" + damage + "만큼 데미지를 주었습니다.");


        System.out.println(m.name + " 의 남은 hp : " + m.hp);

        //m.은 몬스터

    }


    Item itemDrp() {

        return items[(int) (Math.random() * items.length)];


        // 가지고있는 아이템중에 무작위로 하나를 떨어트려줌 .


    }


}