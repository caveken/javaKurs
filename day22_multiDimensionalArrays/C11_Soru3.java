package javaKurs.day22_multiDimensionalArrays;

public class C11_Soru3 {
    public static void main(String[] args) {
        /*
        Soru 3) Asagidaki multi dimensional array’lerin iç arraylerindeki
        aynı index e sahip elemanlarin toplamini
        ekrana yazdiran bir program yaziniz
        arr1 { {1,2}, {3,4,5}, {6} }

        arr2 { {7,8,9}, {10,11}, {12} }
         */

        int [][] arr1 ={ {1,2}, {3,4,5}, {6} };
        int [][] arr2 ={ {7,8,9}, {10,11}, {12} };


        int istenenToplam=0;

        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                if (i==j){

                    istenenToplam+=arr1[i][j];

                }

            }

        }




        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j < arr2[i].length; j++) {

                if (i==j){

                    istenenToplam+=arr2[i][j];

                }

            }

        }



        System.out.println("multi dimensional array’lerin iç arraylerindeki \n" +
                "        aynı index e sahip elemanlarin toplami: "+istenenToplam);

    }
}
