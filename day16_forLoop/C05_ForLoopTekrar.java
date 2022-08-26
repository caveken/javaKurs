package javaKurs.day16_forLoop;

import java.util.Scanner;

public class C05_ForLoopTekrar {
    public static void main(String[] args) {

        /*
        Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve
        aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir
         program yaziniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 adet tam sayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        girileVeAradakileriTopla(sayi1, sayi2);



    }

    public static void girileVeAradakileriTopla(int sayi1, int sayi2) {

        int toplam=0;

        if(sayi1<=sayi2){
            for (int i = sayi1; i <=sayi2 ; i++) {

                toplam+=i;
            }
            System.out.println(toplam);

        }else {
            for (int i = sayi2; i <=sayi1 ; i++) {

                toplam+=i;

            }
            System.out.println(toplam);
        }


    }
}
