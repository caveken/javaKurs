package javaKurs.day23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_Soru1 {
    public static void main(String[] args) {
        /*
        verilen bir array'deki tekrar eden elementleri yazdirin
         */
        int [] sayilar ={ 1,2,5,6,4,7,4,5,2,14,5,2,1,5,2,1,4,3,5,8,1,2,4};

        int [] temp=sayilar;

        List<Integer> tekrarEdenElementler = new ArrayList<Integer>();


        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 1; j < temp.length ; j++) {

                if (sayilar[i]==temp[j]){
                    if (!tekrarEdenElementler.contains(temp[j])){

                        tekrarEdenElementler.add(temp[j]);

                    }

                }

            }

        }


        System.out.println(Arrays.toString(sayilar));
        System.out.println(tekrarEdenElementler);



    }

   // [1, 4, 2, 3, 5]
    // { 6,7,14,8,3,};
    //1=1,1,1,1,
    //4=4,4,4,4
    //2=2,2,2,2,2,
    //3=
    //5=5,5,5,5,5,
}
