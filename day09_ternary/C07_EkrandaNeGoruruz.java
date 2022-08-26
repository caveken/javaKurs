package javaKurs.day09_ternary;

public class C07_EkrandaNeGoruruz {
    public static void main(String[] args) {


        int y =112;
        System.out.println((y>5)?"inek":"koyun");//inek

        System.out.println((y<91)?9:11);//11

        int a=1;
        int b=1;
        int c=(a<10)?a++:b++;
        System.out.println(a+","+b+","+c);//4
    }
}
