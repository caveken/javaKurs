package javaKurs.day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf='a';
        //char yeniharf=harf+1;
        //char variable yıkarıdaki gibi işlem yabarak
        //alamaz aşağıdaki doğruolanı

        char yeniHarf= (char) (harf+1);
        System.out.println(yeniHarf);

        /*
        Bazen bir variableye
        oluşturulduğu data türü dışında değer atanabilir
        bunlaedan bazılarını java otomatşk kabul eder
         */
        int sayi1= (int) 7.3;
        System.out.println(sayi1);
        double sayi2=10;
        System.out.println(sayi2);//10.0
        int sayi3='c';
        System.out.println(sayi3);//99
        char harf2=98;
        System.out.println(harf2);//b


    }
}
