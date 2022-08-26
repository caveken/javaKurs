package javaKurs.day10_stringManipulations;

public class C06_indexOf {
    public static void main(String[] args) {
        String str= "java ogrenmek cok güzel";


        String str1="ckdcjdhcjdcmlkdwjcıodhwcndn dmncbcdb";

        System.out.println(str1.indexOf("o"));//19
        System.out.println(str1.indexOf('g'));//-1
        System.out.println(str1.indexOf("t"));//-1

        if(str1.indexOf("a")==-1){
            System.out.println("yoktur");
        }else {
            System.out.println(str1.indexOf("h"));
        }




    }
}
