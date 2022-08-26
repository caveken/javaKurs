package javaKurs.day11_stringManipulations;

import java.util.Scanner;

public class C10_OdevSoruCumleIndexOf {

    public static void main(String[] args) {
        /*
        kullanıcıdan bir cumle ve bir kelime ilteyin kelimenin cumledekikullanımına bakarak
        asagıdaki 3 cumleden uygun olanı yazdır
        -girilen kelime cumlede kullnılmamıs
        -girilen kelime cumlede1 kere kullanılmıs
        -girilen kelime cumlede birden fazla kullanılmıs
         */

        String cumle="Ahmet Selim sana oyuncakcidan aldıgım oyuncaklari neden duzgun kullanmiyorsun soyle bakalim ahmet";

        cumle=cumle.toLowerCase();

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime=scan.next();



        if(cumle.indexOf(kelime)==-1){
            System.out.println("girilen kelime kayıtlı cumlede kullanılmamıstır");
        }else if(cumle.indexOf(kelime)==cumle.lastIndexOf(kelime)){
            System.out.println("girilen kelime kayıtlı cumlede 1 defa kullanılmıstır");
        }else {
            System.out.println("girilen kelime kayıtlı cumlede birden fazla kullanılmıstır");
        }

    }
}
