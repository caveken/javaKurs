package javaKurs.day16_forLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {

        //baslangıctan bitis noktasına
        // yaklasmıyorsak sonsuz loop olur

        /*
        for (int i = 0; i >-10 ; i++) {


            System.out.println(i);


        }
*/

        //eger ilk deger için bile bitiş sartı sağlanmıyorsa
        // loop calısır fakat loop body si devreye girmez

        for (int i = 0; i>5; i++) {

            System.out.println(i);

        }
    }
}
