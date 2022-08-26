package javaKurs.day08_ifStatement;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {

        /* emeklilik kontrolu yapan bir program yaziniz

cinsiyet olarak E (ERKEK) veya K (KADIN) degiskenlerini
kabul etsin farkli bir harf veya sembol girilirse hata
mesajı versin

emeklilik icin kadinlarda yas siniri 60

erkeklerde 65 olsun

negatif yas veya 80'den buyuk yas
girilirse hata mesaji versin
 */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi giriniz\nErkek için 'E' harfi Kadın için 'K' harfi giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("yaşınızı giriniz");
        double yas = scan.nextDouble();


        if (cinsiyet=='E'){
            if (yas<0||yas>80){
                System.out.println("gecerli bir yas giriniz");
            }else if (yas>65){
                System.out.println("emekli olabilirsin");
            }else {
                System.out.println("emekli olamazsın");
            }


        }else if (cinsiyet=='K'){
            if (yas<0||yas>80){
                System.out.println("gecerli bir yas giriniz");
            }else if (yas>60){
                System.out.println("emekli olabilirsin");
            }else {
                System.out.println("emekli olamazsın");
            }

        }else {
            System.out.println("Lutfen gecerli bir cinsiyet tercihi giriniz");
        }

    }
}
