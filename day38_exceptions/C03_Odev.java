package javaKurs.day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Odev {
    public static void main(String[] args) {
        /*
          Marketteki tum urunleri bir array'de tuttugumuzu varsayalim
          Kullaniciya index sorup, o index'deki urunu yazdiran bir
          program hazirlayalim
          Kullanici urun sayisindan buyuk bir index girerse
          exception vermesinin onune gecelim
          while ile
         */
        String[] urunler={"Nutella","Cokokrem","Sut","Cay","Findik"};
        int istenenSira=0;
        boolean hata=false;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Istediginiz urunun sira nosunu giriniz");
            try {
                istenenSira =scan.nextInt();
                hata=false;
            } catch (InputMismatchException deneme) {
                System.out.println("Urun indexi icin bir tam sayi girmeniz gerekli");
                hata=true;
            }
        if (hata==false){
            try {
                System.out.println("Aradiginiz urun : " + urunler[istenenSira-1] );
                hata=false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Girdiginiz sira listemizde bulunmuyor" +
                        "\nSira numarasi en fazla : " + urunler.length  + " olabilir" );
                hata=true;
            }}}
        while (hata);
    }
}
