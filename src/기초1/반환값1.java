package 기초1;

public class 반환값1 {
    public static void main(String[] args) {

        int a = 10;

        a = abc(a);
        System.out.println(a);
    }

    static int abc (int k) {
        k += 5;
        return k;
    }
}


/*{
    public static void main(String[] args) {

        int a = 10;

        a = abc(a);
        System.out.println(a);

        a = abc(20);
        System.out.println(a);
    }

    static int abc(int k) {
        k += 5;
        return k;
    }
}*/
