package day24_dateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {

        System.out.println("**********Local Time*************");

        LocalTime starting_time = LocalTime.of(10, 30);

        System.out.println(starting_time);

        LocalTime rightTime = LocalTime.now();

        System.out.println(rightTime);

        System.out.println("-----------------------");

        LocalTime time1=LocalTime.of(23,25,59);

        System.out.println(time1);

        time1=time1.plusHours(1);

        System.out.println(time1);

        time1=time1.plusMinutes(45);

        System.out.println(time1);




    }
}
