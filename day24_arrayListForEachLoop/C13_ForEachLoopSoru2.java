package javaKurs.day24_arrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C13_ForEachLoopSoru2 {
    public static void main(String[] args) {
        /*
        Soru2: Bir integer list olusturunuz ve bu list'teki tum sayilarin
        karesinin toplamini ForEachLoop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
         */
        List<Integer> sayilarArrList = new ArrayList<Integer>();
        sayilarArrList.add(2);
        sayilarArrList.add(3);
        sayilarArrList.add(5);
        int kareleriToplami=0;

        for (int each:sayilarArrList
             ) {
            kareleriToplami+=each*each;
        }

        System.out.println("sayilarArrList isimli Array List'in elementleri kareleri toplami: "+kareleriToplami);
    }
}
