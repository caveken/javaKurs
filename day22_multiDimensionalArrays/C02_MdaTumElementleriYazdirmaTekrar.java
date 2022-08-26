package javaKurs.day22_multiDimensionalArrays;

public class C02_MdaTumElementleriYazdirmaTekrar {
    public static void main(String[] args) {
        // verilen bir multi-dimensional array'in
        // tum elementlerini yazdiran bir method olusturun

        int[][] sayilar = {{1,5,6,9,4},{2,5,5,8},{3,1,6}};

        elementleriYazdiralim(sayilar);
    }

    private static void elementleriYazdiralim(int[][] sayilar) {

        for (int i = 0; i < sayilar.length ; i++) { // burada length inner arrays indexi kadar olur 0, 1, 2
            for (int j = 0; j < sayilar[i].length ; j++) { // burada ise i. inner arrayin indexi kadar olur

                System.out.print(sayilar[i][j]+ " ");

            }

        }
    }
}
