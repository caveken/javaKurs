package javaKurs.day18_whileDoWhile;

public class C02_WhileLoopTekrar {
    public static void main(String[] args) {
        /*
        Soru 7 ) Kullanicidan bir sayi alin
        ve bu sayinin rakamlari toplamini yazdirin
         */

        int input=5214850;

        int birler=0;
        int rtoplam=0;

        int temp=input;

        while (temp>0){

            birler=temp%10;
            rtoplam+=birler;
            temp/=10;
        }

        System.out.println(input+" rakamlari toplami "+rtoplam);
    }
}
