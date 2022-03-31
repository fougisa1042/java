package 기초2;

public class 별3 {
    public static void main(String[] args) {
        int i= 0, j = 0, k = 0, n;

        /*Scanner sc =new Scanner(System.in);*/
        /*n = sc.nextInt();*/


        //1
        for (i=1; i <=20; i ++){
            for (j=1; j <=(70-i); j ++)
                System.out.print(" ");
            for (k=1; k <=(2*i); k ++)
                System.out.print("*");

            System.out.println();
        }

        //2
        int 별수=(--j);
        int 별수2=(--k);
        int 최대값;
        for (최대값=별수2+10,별수2=2*별수+별수2,
                     별수=0; 별수2>최대값;
                     별수2-=10, 별수+=5){
            for (j=1; j<=별수; j++)
                System.out.print(" ");
            for (k=1; k <=별수2; k++)
                System.out.print("*");
            System.out.println();
        }


        //3
        for (최대값=별수2+10; 별수2<=최대값;
             별수2+=2,별수-=1){
            for (j=1; j<별수; j++)
                System.out.print(" ");
            for (k=1; k<=별수2; k++)
                System.out.print("*");

            System.out.println();
        }



        //4
        for (int 공백=0, scout=별수2; scout>0;
             별수2+=2,별수-=1,공백+=6){
            for (j=1; j<=별수;j++)
                System.out.print(" ");
            scout=별수2-공백;
            for (k=1; k<=(scout/2); k++)
                System.out.print("*");
            for (k=1; k<=공백; k++)
                System.out.print(" ");
            for (k=1; k<=(scout/2); k++)
                System.out.print("*");

            System.out.println();


        }






    }
}
