package javaKurs.day17_nestedForLoop;

public class C05_NestedForLoopTekrar {
    public static void main(String[] args) {

        /*
        verilen input'a gore
        * lardan olusan asagidaki sekli olusturun
        input=4
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
         */
        // artan kismi nested forloop ile yapalim

        int sayii=5;

        for (int i = 1; i <=sayii ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");
            }
            System.out.println("");

        }


        for (int i = sayii-1; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");

            }
            System.out.println("");


        }



    }
}
