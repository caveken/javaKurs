package javaKurs.day17_nestedForLoop;

public class C11_WhileLoopSoru1 {
    public static void main(String[] args) {
        /*
        whileloop kullanarak 3 ten 13 e kadar
        tüm tek sayilari ekrana yazdiriniz
         */
        int uc=3;
        int onuc=13;

        while (uc<=onuc){
            if (!(uc%2==0)){
                System.out.print(uc+" ");

            }
            uc++;
        }
    }
}
