package javaKurs.day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
          String mi yoksa StringBuilder mi daha hizlidir ?
          bunun icin bir String olusturup, 1000 kere sonuna . ekleyelim
          oncesinde ve sonrasinda zamani alip
          aradaki farki bulalim
          ayni islemi string builder icin de yapalim
         */

            LocalTime basTime = LocalTime.now();
            String str = "ah java";
            for (int i = 0; i < 1000; i++) {
                str += ".";
            }
            LocalTime bitTime = LocalTime.now();
            System.out.println("fark: " + (bitTime.getNano() - basTime.getNano()));


            LocalTime basTime2 = LocalTime.now();
            StringBuilder sb =new StringBuilder( "ah java");
            for (int i = 0; i < 100000; i++) {
                sb.append(".");
            }
            LocalTime bitTime2 = LocalTime.now();
            System.out.println("fark: " + (bitTime2.getNano() - basTime2.getNano()));

        }
    }

