package javaKurs.day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("ilk tarihSaat = " + tarihSaat);//ilk tarihSaat = 2022-07-25T21:41:01.640359700

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yy hh:mm");
        System.out.println("dtf = " + dtf.format(tarihSaat));

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm");
        System.out.println("dtf1 = " + dtf1.format(tarihSaat));


    }
}
