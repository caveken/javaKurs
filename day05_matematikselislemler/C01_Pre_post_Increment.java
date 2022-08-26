package javaKurs.day05_matematikselislemler;

public class C01_Pre_post_Increment {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=sayi1+1;
        System.out.println("sayi2: "+  sayi2);//sayi2=11

        int sayi3= sayi2++;
        System.out.println("post işleminden sonra sayi2: " + sayi2);//post sayi2=12
        System.out.println("sayi3: " + sayi3);//sayi3=11
        int sayi4=++sayi1;
        System.out.println("pre işleminden sonra sayi1: " + sayi1);//sayi1=11
        System.out.println("sayi4: " + sayi4); //sayi4=11

    }


}
