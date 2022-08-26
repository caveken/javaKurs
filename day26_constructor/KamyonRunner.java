package javaKurs.day26_constructor;

public class KamyonRunner {
    public static void main(String[] args) {

        Kamyon kamyon1=new Kamyon();
        System.out.println("kamyon1 ozellikleri: "+kamyon1.toString());

        Kamyon kamyon2=new Kamyon("mercedes","4140",2005,500000);
        System.out.println("kamyon2 bilgileri: "+kamyon2.toString());

        Kamyon kamyon3=new Kamyon("MAN","as900",2007,40000);
        System.out.println("kamyon3 bilgileri: "+kamyon3.toString());


        Kamyon kamyon4=new Kamyon("scania","s540");
        System.out.println("kamyon4 bilgileri: "+kamyon4.toString());

    }
}
