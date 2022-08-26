package javaKurs.day30_immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();

        System.out.println(tarihSaat);//2022-07-23T19:45:53.999455


        System.out.println(tarihSaat.plusYears(11).plusMonths(11).plusDays(11));//2034-07-04T19:45:53.999455


        System.out.println(tarihSaat.getDayOfWeek());//SATURDAY

        System.out.println(tarihSaat.toLocalDate());//2022-07-23

    }
}
