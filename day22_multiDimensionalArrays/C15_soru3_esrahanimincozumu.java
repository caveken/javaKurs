package javaKurs.day22_multiDimensionalArrays;

public class C15_soru3_esrahanimincozumu {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

        String toplam =" ";

        int sonuç = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    for (int l = 0; l < arr2[k].length; l++) {
                        if (i == k && j == l)
                            toplam+=" "+(arr1[i][j] + arr2[k][l]);
                    }
                }
            }
        }
        System.out.print(toplam);

    }

}
