package javaKurs.day17_nestedForLoop;

public class C04_NestedForLoopTekrar {
    public static void main(String[] args) {
        /*
        verilen input'a gore *'lardan olusan bir ucgen olusturun
        ornek input =4 ise
                 *
                 * *
                 * * *
                 * * * *
        */

        int inputt=8;

        for (int i = 1; i <=inputt ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");

            }
            System.out.println("");

        }

    }
}
