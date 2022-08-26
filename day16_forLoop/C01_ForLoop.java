package javaKurs.day16_forLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        //verilen bir pozitif tam sayının popzitif tam bolenlerini yazdıralım

        int input=20;

        int toplam=0;

        for (int i = 1; i <=input ; i++) {

            if (input%i==0) {

                toplam+=i;
                System.out.print(i+" ");
                System.out.println(toplam);

            }



        }

    }
}
