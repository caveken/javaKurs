package javaKurs.day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str = "1Bu2gu3n Ja*va- cok g3uz/el";

        str=str.replaceAll(" ","x");
        str=str.replaceAll("\\W", "");
        str=str.replaceAll("\\d","");
        str=str.replaceAll("x"," ");

        str=str.toUpperCase();


        System.out.println(str);

    }
}
