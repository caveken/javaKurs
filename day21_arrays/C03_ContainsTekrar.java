package javaKurs.day21_arrays;

import java.util.Scanner;

public class C03_ContainsTekrar {
    public static void main(String[] args) {
        // Soru 3- Kulanicidan aldiginiz bir ismin,verilen array’de olup olmadigini kontrol edip,
        // bize true veya false sonucu donen bir method olusturun.

        String[] kelimeler ={"ekran", "fare", "klavye", "bilgisayar", "harddisk", "anakart"};
        Scanner scan=new Scanner(System.in);
        System.out.println("aradıgınız kelimeyi giriniz");
        String arananKelime= scan.next();

        boolean sonuc=contains(kelimeler, arananKelime);
        if (sonuc) {
            System.out.println("aranan kelime kelimeler icinde var");
        }else System.out.println("aranan kelime kelimeler icinde yok");

    }

    private static boolean contains(String[] kelimeler, String arananKelime) {

        boolean sonucDon=false;


        for (int i = 0; i <kelimeler.length ; i++) {

            if (kelimeler[i].equalsIgnoreCase(arananKelime)) {
                sonucDon=true;
            }
        }

        return sonucDon;
    }
}
