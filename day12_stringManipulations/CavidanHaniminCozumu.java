package javaKurs.day12_stringManipulations;

import java.util.Scanner;

public class CavidanHaniminCozumu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 8 karekterli bir sifre giriniz");
        String sifre = scan.nextLine();
        char ilkHarf = sifre.charAt(0);
        char sonHarf = sifre.charAt(sifre.length() - 1);

        if ((sifre.length() < 8)) System.out.println("girdiginiz sifre 8 karakterden kısa");
        else if ((ilkHarf >= 'A' && ilkHarf <= 'Z')
                && (sonHarf >= 'a' && sonHarf <= 'z')
                && (!sifre.contains(" ")))
            System.out.println("girdiginiz sifre basarılı");
        else System.out.println("işlem basarısız yeni sifre giriniz");
    }
}
