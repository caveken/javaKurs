package javaKurs.day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C11_Soru2 {
    public static void main(String[] args) {
        /*
        verilen bir array'deki unique (benzersiz) elementleri
        yeni bir aray olarak döndüren method oluşturunuz
         */
        Integer [] sayilar ={ 1,2,5,6,4,7,4,5,2,14,5,2,1,5,2,1,4,3,5,8,1,2,4};


       // int [] sonucUniqueElementler = uniqueElementler(sayilar);

        List<Integer> sonucUniqueElementler = sonucUniqueElementler(sayilar);

        System.out.println(sonucUniqueElementler);

    }

    private static List<Integer> sonucUniqueElementler(Integer[] sayilar) {
        List<Integer> sonuc= new ArrayList<Integer>();

        for (int i = 0; i < sayilar.length ; i++) {
            if (!sonuc.contains(sayilar[i])){

                sonuc.add(sayilar[i]);
            }

        }


        return sonuc;
    }


}
