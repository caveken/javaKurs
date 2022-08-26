package javaKurs.day24_arrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class C02_ArraydenListOlusturmaTekrar {
    public static void main(String[] args) {
        /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazalim
         */
        Random rnd=new Random();
        int sayi;
        List<Integer> sayiList=new ArrayList<Integer>();

        while (sayiList.size()<200){
            sayi= rnd.nextInt(1000);
            if (!sayiList.contains(sayi)){
                sayiList.add(sayi);
            }
        }
        System.out.println(sayiList);
        System.out.println(sayiList.size());
    }
}
