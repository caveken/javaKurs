package javaKurs.day09_ternary;

public class C11_EkrandaNeGoruruz2 {
    public static void main(String[] args) {

        int a=8;
        System.out.println((a>5)?(a<10?2*a:3*a):(a>10?2+a:3+a));//16

        int b=12;
        System.out.println((b>5)?(b<10?2*b:3*b):(b>10?2+b:3+b));//36

        int c=5;
        System.out.println((c>5)?(c<10?2*c:3*c):(c>10?2+c:3+c));//8


    }
}
