package javaKurs.day22_multiDimensionalArrays;

public class C10_Soru1 {
    public static void main(String[] args) {
        /*
        Soru 1) Asagidaki multi dimensional array’in
        tum elemanlarin carpimini
        ekrana yazdiran bir method yaziniz { {1,2,3}, {4,5, 6} }
         */

        int [][] inputArr={ {1,2,3}, {4,5,6} };

        tumElemanlariCarp(inputArr);

    }

    public static void tumElemanlariCarp(int[][] inputArr) {

        int carpımSonuc=1;

        for (int i = 0; i <inputArr.length ; i++) {
            for (int j = 0; j <inputArr[i].length ; j++) {

                carpımSonuc*=inputArr[i][j]; // [0][0]*[0][1]* [0][2]* [1][0]* [1][1]* [1][2],

            }

        }
        System.out.println("tum elemanlarin carpimi: "+carpımSonuc);
    }
}
