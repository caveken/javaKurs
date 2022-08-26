package javaKurs.day21_arrays;

import java.util.Arrays;

public class C07_sortTekrar {
    public static void main(String[] args) {
        String[] isimler ={"Erdal", "Onur", "Mehmet", "Hayrullah", "Mihrican"};
        System.out.println(Arrays.toString(isimler));
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));

    }



}
