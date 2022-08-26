package javaKurs.day15_overloading_forloop;

public class C01_ReturnMethod {
    public static void main(String[] args) {

        //verilen iki sayiyi carpıp
        //bize döndüren bir method olusturun

        int sayi1=10;
        int sayi2=5;

        int sonuc=carpGetir(sayi1, sayi2);
        System.out.println("sonuc: "+sonuc);

    }

    public static int carpGetir(int sayi1, int sayi2) {

        return sayi1*sayi2;
    }
}
