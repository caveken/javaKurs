package javaKurs.day24_arrayListForEachLoop;

public class C15_ForEachLoopSoru4 {
    public static void main(String[] args) {
        /*
    Soru4: Bir string olusturunuz bu string'deki
    karakterleri ForEachLoop kullanarak yazdiriniz.
     */

        String str="Bugun gunlerden pazar saat:15.41";
        String [] strArr=str.split("");


        for (String each:strArr
             ) {

            if (!each.equals(strArr.length-1)) {}
            System.out.print(each+",");
        }
        System.out.println("");



        //System.out.println(Arrays.toString(strArr));
    }



}
