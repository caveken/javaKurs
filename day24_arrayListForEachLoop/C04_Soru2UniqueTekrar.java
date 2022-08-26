package javaKurs.day24_arrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_Soru2UniqueTekrar {
    public static void main(String[] args) {
        // Soru 2) Verilen bir array’deki unique elementleri
        // yeni bir array olarak donduren bir method olusturun

        int [] arr={2,3,5,6,3,5,4,1,9,6,3,5,5};

        int[] unique=yeniArr(arr);

    }

    public static int[] yeniArr(int[] arr) {
        int[] uniqueSonuc=new int[arr.length];

        List<Integer> sonuc=new ArrayList<Integer>();
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length ; j++) {

                if (!sonuc.contains(arr[j])) {}

            }
            for (int j = i-1; j >=0 ; j--) {

                if (sonuc.contains(arr[j])) {}

            }

        }


        return uniqueSonuc;
    }
}
