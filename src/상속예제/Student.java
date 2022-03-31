package 상속예제;

public class Student extends person {


    private final double GPA;
    private int grade;
    private String studentID;
    private double gPA;

    public Student(String name, int age, int height, int weight,
                   String studentID, int grade, double gPA) {
        super(name, age, height, weight);
        this.studentID = studentID;
        this.grade = grade;
        GPA = gPA;
    }


    public String getStudentID(){
        return studentID;
    }
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

    public int getGrade(){
        return grade;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }

    public double getGPA(){
        return gPA;
    }
    public void setGPA(double gPA){
        this.gPA = gPA;
    }

    public void show(){
        System.out.println("________________");
        System.out.println("학생 이름 :" +getName());
        System.out.println("학생 나이 :" +getAge());
        System.out.println("학생 키 :" +getHeight());
        System.out.println("학생 몸무게 :" +getWeight());

        System.out.println("학생 학번 :" +getStudentID());
        System.out.println("학생 학년 :" +getGrade());
        System.out.println("학생 학점 :" +getGPA());
        System.out.println("-------------------");
    }





}

