package javaKurs.day24_arrayListForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenleriSilSoru4Tekrar {
    public static void main(String[] args) {
        // Soru 4) Verilen bir array’de istenmeyen harf iceren kelimeleri silip,
        // kalan elementleri yeni bir array yapin

        String [] isimler={"Ahmet", "Sefa", "Zeynep", "Zehra"};
        String harf="a";

        List<String> verilenHarfiIcermeyenler= new ArrayList<String>();

        for (int i = 0; i < isimler.length ; i++) {
            if (!isimler[i].contains(harf)) {

                verilenHarfiIcermeyenler.add(isimler[i]);

            }
        }

        String [] isimlerYenihali= new String[verilenHarfiIcermeyenler.size()];

        for (int i = 0; i <verilenHarfiIcermeyenler.size(); i++) {

            isimlerYenihali[i]=verilenHarfiIcermeyenler.get(i);

        }

        System.out.println("List verilenHarfiIcermeyenler: " + verilenHarfiIcermeyenler);
        System.out.println("yeni Array "+ Arrays.toString(isimlerYenihali));





    }
}
