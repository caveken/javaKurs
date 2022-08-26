package javaKurs.day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_PeriodZuliAs {
    public static void main(String[] args) {
        LocalDate tarih1=LocalDate.of(2000,7,9);
        LocalDate tarih2=LocalDate.of(2012,6,20);

        Period period=Period.between(tarih1,tarih2);
        System.out.println(period);

        System.out.println(period.getYears());

    }
}
