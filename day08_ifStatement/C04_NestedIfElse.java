package javaKurs.day08_ifStatement;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {

       /*
       Kullanıcıdan 4 basamakli bir sayi girmesini
       isteyin.

       Girdiği sayi 5’e  bölünüyorsa son rakamını
       kontrol edin.

       Son rakamı 0 ise ekrana “5’e bölünen
       çift sayı” yazdırın.

       Son rakamı 0 değil ise “5’e
       bölünen tek sayı” yazdırın.

       Girdiği password 5’e
       bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı bir tam sayı giriniz");
        int sayi=scan.nextInt();

        if (sayi>9999 || sayi<1000){
            System.out.println("lutfen 4 basamaklı bir tam sayı giriniz");

        }else if (sayi%5==0) {
            if (sayi%10==0) {
                System.out.println("girdiginiz rakam 5 e bölünebilen bir çift sayidir");
            }else {
                System.out.println("girdiginiz rakam 5 e bölünebilen bir tek sayidir");
            }
        }else {
            System.out.println("Tekrar deneyiniz");
        }






    }
}
