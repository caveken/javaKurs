package javaKurs.day12_stringManipulations;

import java.util.Scanner;

public class C10_Soru6 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("\tLutfen 8 karekter veya daha uzun bir sifre giriniz\n\tNot: " +
                "sifrenizin ilk karakteri buyuk harf olmalı,\n\tson karakteri kucuk " +
                "harf olmalı, ve sifreniz bosluk içermemelidir");
        String sifre=scan.nextLine();

        if(!(sifre.length()>=8)) {
            System.out.println("girdiginiz sifre 8 karakterden kısa");
        }else {
            char ilkHarf = sifre.charAt(0);
            char sonHarf = sifre.charAt(7);

            if((ilkHarf>='A'&&ilkHarf<='Z')&&(sonHarf>='a'&&sonHarf<='z')&&(!sifre.contains(" "))){
                System.out.println("sifre başari ile tamamlandi");
            }else {
                System.out.println("islem basarisiz lutfen yeni bir sifre giriniz");
            }
        }
    }
}
