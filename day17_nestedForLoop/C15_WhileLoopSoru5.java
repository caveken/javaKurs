package javaKurs.day17_nestedForLoop;

import java.util.Scanner;

public class C15_WhileLoopSoru5 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int input= scan.nextInt();


        for (int i = 1; i <=10 ; i++) {
            for (int j = input; j <=input; j++) {

                System.out.print(j+"*"+i+"="+i*j+" ");
                
            }
            
        }
    }
}
