package javaKurs.day46_maps;

import java.util.*;

public class C01_Map {
    public static void main(String[] args) {
        Map<Integer,String> sinifList=new HashMap<>();

        sinifList.put(101,"ali, can, jdev");
        sinifList.put(102,"veli, kan, qa");
        sinifList.put(103,"deli, yan, cdev");
        sinifList.put(104,"jeli, san, dev");

        System.out.println(sinifList);
        // {101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}

        System.out.println(sinifList.keySet());// [101, 102, 103, 104]

        System.out.println(sinifList.values());// [ali,can,jdev, veli,kan,qa, deli,yan,c++dev, jeli,san,dev]

        System.out.println(sinifList.values().size());// 4

// tum ogrencilerin isim ve soyisimlerini sira no ile alt alta yazdirin

        Collection<String> tumValueColl=sinifList.values();

        String[] eachArr;
        int sira=1;
        for (String each:tumValueColl) {// her each icinde 3 bilgiyi de tasıyan (aynı sıralı) virgullerle ayrılmıs görünen ama tek bir string
            eachArr=each.split(", ");// 4 array olusturduk 3 elemanlı burdaki "," iç arraylerin 3 elemanı birbirinden ayıran split
            System.out.println(sira+"- "+eachArr[0]+" "+eachArr[1]);//her arrayin 1. ve 2. elemanlarını yazdırdık
            System.out.println(each);
            sira++;
        }
// Map'de bulunan ogrencilerin, isim ve soyisimlerini birlestirerek
        // bir sinif listesi olusturun
        List<String> sinifIsimSoyisimList= new ArrayList<>();
        for (String each : tumValueColl
        ) {
            eachArr=each.split(", ");// 4 array olusturduk
            sinifIsimSoyisimList.add(eachArr[0] + " " + eachArr[1]);// her arrayin 1. ve 2. elemanlarını birlestirip bir liste atadık
        }                                                           //4 elemanlı bir list oldu
        System.out.println(sinifIsimSoyisimList);

        // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin
        List<String> bransList= new ArrayList<>();
        for (String each : tumValueColl
        ) {
            eachArr = each.split(", ");// 4 array olusturduk
            bransList.add(eachArr[2]);
            System.out.println(bransList);
        }

        }
    }

