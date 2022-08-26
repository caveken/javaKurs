package javaKurs.day09_ternary;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        //Kullanicidan bir harf isteyin
        // kucuk harf ise consola “Kucuk Harf” ,
        // buyuk harfse consola “Buyuk Harf”
        // yoksa “girdiginiz karakter harf degil” yazdirin.

        Scanner scan=new Scanner (System.in);
        System.out.println("lütfenbir sayi giriniz");
        char harf=scan.next().charAt(0);


      //  String sonuc=harf>'a'&&harf<'z'?("kucuk harf"):
      //          ("buyuk harf veya gecersiz karakter")


        String sonuc1=(harf>='a'&&harf<='z')?"kucuk harf":
                (harf>='A'&&harf<='Z')?"buyuk harf":"girdiğiniz karakter harf degildir";
        System.out.println(sonuc1);

        String sonuc2=(harf>='a'&&harf<='z')?("kucuk harf"):
                ((harf>='A'&&harf<='Z')?"buyuk harf":"girdiğiniz karakter harf degildir");
        System.out.println(sonuc2);



    }
}
