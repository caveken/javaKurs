package javaKurs.day08_ifStatement;

import java.util.Scanner;

public class C08_SoruPozitifNegatifsayi {
    public static void main(String[] args) {

        /*
        kullanıcıdan iki tam sayi iste

        ikiside (+) ise toplamını yazdır

        ikiside (-) ise çarpımını yazdır

        biri (- )biri (+) ise "farklı işaretli saylarla
        işlem yapamazsın yazdır

        biri (0) ise "(0) çarpmada yutan elmandır" yazdır
         */

        Scanner scan =new Scanner (System.in);
        System.out.println("lutfen 1. sayi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("lutfen 2. sayiyi giriniz");
        int sayi2= scan.nextInt();

        if ((sayi1<0 && sayi2>0) || (sayi1>0 && sayi2<0)) {
            System.out.println("farklı işaretli saylarla işlem yapamazsın");
        }else if (sayi1>0 && sayi2>0) {
            System.out.println(sayi1+sayi2);
        }else if (sayi1<0 && sayi2<0) {
            System.out.println(sayi1*sayi2);
        } else {
            System.out.println("(0) çarpmada yutan elmandır");
        }

    }
}
