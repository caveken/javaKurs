package javaKurs.day07_ifStatements;

public class C01_AndOperatörleri {
    public static void main(String[] args) {

        int a =10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b);//true
        System.out.println(a<0 && b<20 && c>=b);//false


        /*java and operatörü konusunda bize iki seçenek sunar
         && Kullanırsak ilk false bulduğunda sonucun false
         olduğunu bilir ve geriye kalan şartları incelemez
         & Tek kullanırsak tüm şartları kontrol eder ve
        sonucu öyle belirler o yüzden performansı düşürür.
        */

        System.out.println(a<0 & b<20 & c>=b);//false







    }
}
