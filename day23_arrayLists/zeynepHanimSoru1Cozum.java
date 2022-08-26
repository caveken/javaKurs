package javaKurs.day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class zeynepHanimSoru1Cozum {
    public static void main(String[] args) {

        // Verilen bir arraydeki tekrar eden elementleri yazdirin

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Kahve");
        urunler.add("Cekirdek");
        urunler.add("Cay");
        urunler.add("Nutella");
        urunler.add("Cay");
        urunler.add("Cay");
        System.out.println(urunler);

        String tekrarEden="";

        for (int i = 0; i <= urunler.size(); i++) {
            for (int j = i+1; j < urunler.size() ; j++) {
                if(urunler.get(i)==urunler.get(j)){
                    if(!tekrarEden.contains(urunler.get(j))) {
                        tekrarEden = tekrarEden + " " + urunler.get(j);
                    }
                }
            }
        }
        System.out.println(tekrarEden);
    }
}
