package javaKurs.day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {


        int sayi1=130;

        //short sayi2= sayi1;
        byte sayi2= (byte) sayi1;


        /*
        geniş data türündeki değeri dar datatüründeki
        variable yeatamak isterseniz java sizingrniş data türündeki değerin
        dar data türünün sınırlarına uyup uymayacağını çalıştırana
        kadar bilemez ama java risk almaz riski sizin almanızı
        yani manuelatama yapmanızı bekler

        bu riski üstlendiğimizde 3 durum olabilir
        1- bizim

         */


        System.out.println(sayi2);
    }
}
