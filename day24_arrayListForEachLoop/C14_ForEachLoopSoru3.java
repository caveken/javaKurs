package javaKurs.day24_arrayListForEachLoop;

public class C14_ForEachLoopSoru3 {
    public static void main(String[] args) {
        /*
        Soru3: İki String Array oluşturunuz ve bu arraylerdeki ortak elemanlari
        ForEachLoop kullanarak bulunuz.
        Ortak eleman yoksa ekrana ortak eleman yok yazdiriniz.
         */

        String [] arr1={"Ahmet", "Sefa", "Zeynep", "Zehra"};
        String [] arr2={"Elif", "Sefa", "Merve", "Zehra"};

        for (String each1:arr1
             ) {
            for (String each2:arr2
                 ) {
                if (each1.equals(each2)){
                    System.out.print(each1+" ");
                }
            }
        }



    }
}
