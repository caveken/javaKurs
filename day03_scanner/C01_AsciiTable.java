package javaKurs.day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {
        int sayi=10;
        char harf='a';
        String str="banan";
        System.out.println(sayi+harf); // 10a değil 107 oldu
        System.out.println(sayi*harf); //
        System.out.println(str+harf); // banana
        System.out.println(harf+2); // 99
        System.out.println(str+sayi+harf); //banan10a
        System.out.println(""+sayi+harf); //10a

    }
}
