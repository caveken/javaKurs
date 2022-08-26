package javaKurs.day21_arrays;

import java.util.Arrays;

public class C06_ArrayeElementEkleme {
    public static void main(String[] args) {
        // C05 deki method'u kullanarak array'e eleman ekleyelim
        String [] takimListesi={"Suleyman", "Osman"};
        String eklenecekIsim="Talha";
        takimListesi= C05_ArrayeElementEklemeTekrar.ekleMetod(takimListesi, eklenecekIsim);
        System.out.println(Arrays.toString(takimListesi));
    }
}
