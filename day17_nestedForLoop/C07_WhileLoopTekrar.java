package javaKurs.day17_nestedForLoop;

public class C07_WhileLoopTekrar {
    public static void main(String[] args) {

        // 20'den 50'ye kadar(sinirlar dahil) cift sayilari yazdiralim
        // for loop ile yapalim

        int bas=20;
        int son=50;

        for (int i = bas; i <=son ; i++) {

            if (i%2==0) {

                System.out.print(i+ " ");

            }
        }
        System.out.println("");

        while (bas <=son) {

            if (bas%2==0) {

                System.out.print(bas+" ");

            }

            bas++;


        }

    }
}
