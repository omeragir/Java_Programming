package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDate {
    public static void main(String[] args) {

        ArrayList<LocalDate>date=new ArrayList<>(Arrays.asList(LocalDate.of(2020,5,30)));

        date.removeIf(p->p.isBefore(LocalDate.of(2016,8,15)));
        System.out.println(date);

    }
}
/*
 create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016
 */