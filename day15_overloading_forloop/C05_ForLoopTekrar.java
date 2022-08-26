package javaKurs.day15_overloading_forloop;

public class C05_ForLoopTekrar {
    public static void main(String[] args) {
        // 1'den 5 e kadar(5 dahil) olan tamsayilari toplayalim
        int toplam=0;

        for (int i = 1; i <=5 ; i++) {

            toplam+=i;

        }
        System.out.println("1 den 5'e kadar sayilarin toplami: "+toplam);

        // 10 dahil - 20 dahil aradaki sayilari toplayin
        toplam=0;
        for (int i = 10; i <=20 ; i++) {

            toplam+=i;
        }
        System.out.println("10 den 20'e kadar sayilarin toplami: "+toplam);

        // 30 dagil 50 dahil, aradaki cift sayilari toplayin
        toplam=0;

        for (int i = 30; i <=50 ; i+=2) {

            toplam+=i;

        }
        System.out.println("30 den 50'ye kadar cift sayilarin toplami                 : "+toplam);
        //2.yontem
        toplam=0;
        for (int i = 30; i <=50 ; i++) {

            if (i%2==0) {
                toplam+=i;
            }

        }
        System.out.println("30 den 50'ye kadar cift sayilarin toplami (modulus yontemi): "+toplam);


        // 1500 ile 1600 (sinirlar dahil) arasinda 7 ile bolunebilen sayilari toplayin
        toplam=0;

        for (int i = 1500; i <=1600 ; i++) {

            if (i%7==0) {
                toplam+=i;
            }

            System.out.println("1500 den 1600'e kadar 7 ye bölünebilen sayilar: "+toplam);

        }
        System.out.println("1500 den 1600'e kadar 7 ye bölünebilen sayilarin toplami (modulus yontemi): "+toplam);




    }
}
