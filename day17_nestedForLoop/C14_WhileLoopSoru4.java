package javaKurs.day17_nestedForLoop;

public class C14_WhileLoopSoru4 {
    public static void main(String[] args) {
        char bas='a';
        char bitis='z';
        String sonuc="";

        while (bas<=bitis) {
            sonuc=sonuc+(bas+" ");
            bas++;
        }
        System.out.println(sonuc.toUpperCase());
    }
}
