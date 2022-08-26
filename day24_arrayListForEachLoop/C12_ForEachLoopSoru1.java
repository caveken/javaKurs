package javaKurs.day24_arrayListForEachLoop;

public class C12_ForEachLoopSoru1 {
    public static void main(String[] args) {
        /*
        Soru1: Bir integer array olusturunuz ve bu array'deki tum sayilarin carpimini
        For-Each Loop kullanarak bulunuz. sonucu ekrana yazdiriniz.
         */

        int [] sayilarArr={2, 3, 5};
        int carpim=1;

        for (int each:sayilarArr
             ) {
            carpim*=each;

        }

        System.out.println("sayilarArr isimli Array'in elementleri carpımı: "+carpim);
    }
}
