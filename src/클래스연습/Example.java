package 클래스연습;

public class Example {
    public static void main(String[] args) {

        Student a_student = new Student(17);// 학생 클래스 a학생 = 뉴 학생 (숫자 17 선언
        Teacher b_teacher = new Teacher();  // 선생님 클래스 b선생님 = 뉴 선생님
        System.out.println(a_student.getNumber()); // a학생.겟넘버 호출하기
        System.out.println();// 하나더 쓰지 않으면 씹히기 떄문에 써ㅏ준다ㅡ
        System.out.println(b_teacher.getNumber());// b선생님의 겟넘버 호출해주기
    }
}

class Student {
    private int m_number; // m 숫자 변수 선언해주기 _num를 m 변수에 넣어주기 위해 그리고 이 값은 출력하기 위해 리턴된다
    public Student(int _num){ //아까 학생 생성자 매개 변수 인트값으로 다시 선언
        super();  // 부모
        m_number= _num; //M 숫자 변수에 학생 생성자 매개변수 인트값 넣어주기
    }
    public int getNumber(){  // 겟넘버 > a학생 >
        return m_number; // 출력을 해주기 위해 리턴을한다
    }
}


class Teacher {
    public String getNumber() {
        return "손바닥 대 ";
    }
}
