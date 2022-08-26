package javaKurs.day21_arrays;

import java.util.Arrays;

public class C08_binarySearchTekrar {
    public static void main(String[] args) {
        /*
         Binary search java da eleman aramanin kisa yoludur
         Ancak binary searc'un calismasi icin once
         array'in sirali hale getirilmesi gerekir
         Eger siralama yapmadan binarySearch yaparsaniz
         sonucu bulamayabilir veya yanlis bulabilir

         */

        String [] harfler={"q", "c", "s", "t", "m", "w", "p", "f"};
        String arananHarf="q";
        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler, arananHarf));
    }
}
