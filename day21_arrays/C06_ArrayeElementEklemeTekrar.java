package javaKurs.day21_arrays;

import java.util.Arrays;

public class C06_ArrayeElementEklemeTekrar {
    public static void main(String[] args) {
        // C05 deki method'u kullanarak array'e eleman ekleyelim

        String[]urunler={"ekmek", "su", };
        String eklenecekUrun="kola";

        urunler=C05_ArrayeElementEklemeTekrar.ekleMetod(urunler, eklenecekUrun);
        System.out.println(Arrays.toString(urunler));
    }
}
