package javaKurs.day29;

public class C05_Immutable {
    public static void main(String[] args) {
        String isim="mine";
        isim=isim.toUpperCase();
        System.out.println(isim);
        isim="Mevlut";
        System.out.println(isim); // Mevlut
        for (int i = 0; i <100 ; i++) {
            isim += ".";
        }
        System.out.println(isim);
    }
}
