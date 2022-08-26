package javaKurs.day45;

import java.util.ArrayList;
import java.util.List;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {
         /*
          Collections <dataTuru> nu Object secmeniz durumunda
          Collection'a farkli data turlerinden objeler koymaniza izin verir
          Bu depolama acisindan bize esneklik saglar
          Ancak islem yaparken tum objeleri Object olarak tanimladigimizdan
          cok fazla casting yapmamiz gerekebilir
         */
        List<String> liste=new ArrayList();
        //liste.add(5);
        //liste.add('s');
        //liste.add(true);

        List list=new ArrayList();//collections farklı data turlerini barındırır.
                                    // sadece depolama amaclı kullanılacaksa mantıklı
                                    // yoksa islem yapmak zor farklı tiplerle
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("ali");

        System.out.println(list);

        list.set(0,(Integer)list.get(0)+5);//java izin vermiyor casting yapmadan
                                            // islem zorlugu var
        list.set(3,list.get(3)+" can");
        list.set(2,!(Boolean)list.get(2));


    }
}
