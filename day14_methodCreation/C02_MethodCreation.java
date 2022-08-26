package javaKurs.day14_methodCreation;

import javaKurs.day13_methodCreation.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //verilen 3 basamaklı bir sayıını
        // rakamlarını toplayan bir metod oluşturun
        int input = 423;

        rakamlariTopla(input);
        C04_MethodCreation.topla(25, 47);


    }

    public static void rakamlariTopla(int input) {

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        int temp=input;

        //input *** basamak
        birlerBasamagi = input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;
        //10 bölümden sonra ** basamak
        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;
        //10 a bölümden sonra * basamak
        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("verilen "+temp+" sayısının rakamları toplamı: "+rakamlarToplami);


    }
}
