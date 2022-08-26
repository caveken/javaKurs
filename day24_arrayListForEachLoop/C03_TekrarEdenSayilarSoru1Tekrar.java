package javaKurs.day24_arrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_TekrarEdenSayilarSoru1Tekrar {
    public static void main(String[] args) {
        // Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.

        int[] arr ={2,3,5,6,3,5,4,1,9,6,3,5,5};

        List<Integer> tekrarEdenler= new ArrayList<>();

        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j] && !tekrarEdenler.contains(arr[i])){
                    System.out.print(arr[i]+ " ");
                    tekrarEdenler.add(arr[i]);
                }

            }

        }
    }
}
