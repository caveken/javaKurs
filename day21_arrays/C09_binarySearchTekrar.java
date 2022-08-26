package javaKurs.day21_arrays;

import java.util.Arrays;

public class C09_binarySearchTekrar {
    public static void main(String[] args) {
        /*
         binarySearch method'u siralanmis array'de aradigimiz elementin index'ini dondurur
         Ya aradigimiz element array'de yoksa ?
         (String'de indexOf() bize olmayan elementler icin -1 donduruyordu)
        Aradigimiz element array'de yoksa Java hem olmadigini,
        hem de olsaydi nerede olacagini bize dondurur
        olmadigini ifade icin - kullanir
        olsaydi nerede olacagini belirtmek icin index degil siralama kullanir
         */

        int [] sayilar={5, 8, 4, 3, 1, 7};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));//[1, 3, 4, 5, 7, 8]

        System.out.println(Arrays.binarySearch(sayilar, 4));//2
        System.out.println(Arrays.binarySearch(sayilar, 8));//5

        System.out.println(Arrays.binarySearch(sayilar, -20));//-1

        System.out.println(Arrays.binarySearch(sayilar, 15));//-7

        System.out.println(Arrays.binarySearch(sayilar, 6));//-5

    }
}
