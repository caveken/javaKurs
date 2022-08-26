package javaKurs.day12_stringManipulations;

public class C05_Soru1 {
    public static void main(String[] args) {

        String cumle=" Java ogrenmek123 cok guzel@ ";

        cumle=cumle.replaceAll(" ", "x");
        cumle=cumle.replaceAll("\\d", "");
        cumle=cumle.replaceAll("x", " ");
        cumle=cumle.replace("@",".");

        System.out.println(cumle);


    }
}
