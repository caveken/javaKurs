package javaKurs.day21_arrays;

public class C01_ArraysMaximumSayiyiBulmaTekrar {
    public static void main(String[] args) {
        //Soru 1- Verilen bir int array’deki
        // en buyuk sayiyi yazdiran bir method olusturun.

        int [] sayilar={8, 7, 5, 2, 51, 47, 9, 2, 1};

        enbuyukSayiYaz(sayilar);

    }

    public static void enbuyukSayiYaz(int[] sayilar) {

        int enbuyukbul=sayilar[0];

        for (int i = 1; i < sayilar.length ; i++) {

            if (sayilar[i]>enbuyukbul) {

                enbuyukbul=sayilar[i];
            }

        }
        System.out.println(enbuyukbul);

    }
}
