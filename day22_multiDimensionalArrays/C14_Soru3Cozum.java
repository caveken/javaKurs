package javaKurs.day22_multiDimensionalArrays;

public class C14_Soru3Cozum {
    public static void main(String[] args) {

        int [][] arr1 = {{1,2},{3,4,5},{6}};
        int [][] arr2 = {{7,8,9},{10,11},{12}};


        if (arr1.length<arr2.length){

            for (int i = 0; i < arr1.length ; i++) {

                int elemansayisi;

                if (arr1[i].length < arr2[i].length) {

                    elemansayisi = arr1[i].length;

                }else {

                    elemansayisi = arr2[i].length;
                }

                for (int j = 0; j < elemansayisi ; j++) {

                    System.out.print(arr1[i][j] + arr2[i][j]+ " ");
                }
            }

        }else {
            for (int i = 0; i < arr2.length ; i++) {

                int elemansayisi;

                if (arr1[i].length < arr2[i].length) {

                    elemansayisi = arr1[i].length;

                }else {

                    elemansayisi = arr2[i].length;
                }

                for (int j = 0; j < elemansayisi ; j++) {

                    System.out.print(arr1[i][j] + arr2[i][j]+ " ");
                }
            }
        }

    }
}
