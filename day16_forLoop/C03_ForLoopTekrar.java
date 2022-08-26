package javaKurs.day16_forLoop;

public class C03_ForLoopTekrar {
    public static void main(String[] args) {

        int bas =10;
        int son=30;


        for (int i = bas; i <=son ; i++) {

            if (i<son) {
                System.out.print(i+", ");
            }else {
                System.out.print(i);
            }
        }
    }
}
