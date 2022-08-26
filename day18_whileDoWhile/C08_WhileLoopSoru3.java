package javaKurs.day18_whileDoWhile;

import java.util.Scanner;

public class C08_WhileLoopSoru3 {
    public static void main(String[] args) {
        /*
        kullanıcıdan toplamak uzere pozitif sayılar isteyin
        işlemi bitirmek için 0 a basmasını soyleyin
        kullanıcı 0 a bastıgında toplam kac pozitif sayi girdigini ve
        girdiği pzitif sayiların toplamının kac oldugunu yazdırın
         */
        Scanner scan =new Scanner(System.in);
        int pozitifSayiAdedi=0;
        int pozitifSayiToplami=0;
        int sayi=0;

        do {
            System.out.println("lutfen pozitif tam sayi giriniz\ngireceginiz sayilar bitince 0'a basiniz");
            sayi= scan.nextInt();
            if (sayi>0) {
                pozitifSayiAdedi++;
                pozitifSayiToplami = pozitifSayiToplami + sayi;
            }

        }while (sayi!=0);

        System.out.println("toplam "+pozitifSayiAdedi+" adet pozitif sayi girdiniz girdiginiz " +
                "sayilarin toplami: "+pozitifSayiToplami);

    }
}
