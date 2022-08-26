package javaKurs.day17_nestedForLoop;

public class C12_WhileLoopSoru2 {
    public static void main(String[] args) {
        /*
        for ve while loop kullanarak 3 basamaklı sayılardan
        15, 20 ve 90 na tam bölünebilen sayilari yazdırın
         */
        int ucBasamaklıEnKucuk=100;
        int ucBasamaklıEnBuyuk=999;
        int temp=0;

        for (int i = ucBasamaklıEnKucuk; i <=ucBasamaklıEnBuyuk ; i++) {

            if (i%15==0&&i%20==0&&i%90==0){
                System.out.print(i+" ");
            }

        }

        System.out.println("");

        while (ucBasamaklıEnKucuk<=ucBasamaklıEnBuyuk){
            if (ucBasamaklıEnKucuk%15==0&&ucBasamaklıEnKucuk%20==0&&ucBasamaklıEnKucuk%90==0){
                System.out.print(ucBasamaklıEnKucuk+" ");
            }
            ucBasamaklıEnKucuk++;
        }

    }
}
