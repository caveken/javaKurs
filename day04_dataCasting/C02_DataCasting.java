package javaKurs.day04_dataCasting;

public class C02_DataCasting {
    public static void main(String[] args) {

        int sayi1=23;
        int sayi2=5;
        System.out.println(sayi1/sayi2);
        /*
        böyle bir bölme işleminde bölen
        ve bölünen int data türü olduğundan sonuç
        4.6 (double) olması gereksede 4 olarak verir.
         */
        System.out.println(25*7/3);
        double sayi3=5;
        System.out.println(sayi1/sayi3);

        /*
        böyle bir bölme işleminde ise bölen
        ve bölünen double data türü olduğundan double
        daha kapsamlı olduğundan sonucu double ye göre alır.

         */

    }
}
