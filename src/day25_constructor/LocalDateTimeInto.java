package day25_constructor;

import java.time.LocalDateTime;

public class LocalDateTimeInto {
    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts);

        LocalDateTime ends = LocalDateTime.of(1988, 1, 1, 12, 50);

        System.out.println(ends);

        System.out.println(starts.getDayOfWeek());

        System.out.println(starts.getHour());


    }
}
