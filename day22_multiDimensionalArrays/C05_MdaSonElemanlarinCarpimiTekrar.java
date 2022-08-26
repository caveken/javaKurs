package javaKurs.day22_multiDimensionalArrays;

public class C05_MdaSonElemanlarinCarpimiTekrar {
    public static void main(String[] args) {
        /*
        Soru 2) Asagidaki multi dimensional array’in
        ic array’lerindeki son elemanlarin carpimini
        ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
         */

        int [][] sayilar={{1,2,3}, {4,5}, {6}};

        int arrayCarpim=1;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {

                if (sayilar[i].length-1==j) { // 2
                    arrayCarpim*=sayilar[i][j];
                }

            }


        }
        System.out.println(arrayCarpim);
    }
}
