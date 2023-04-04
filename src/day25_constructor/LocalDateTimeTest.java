package day25_constructor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {
    public static void main(String[] args) {



        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE, h:ss a, MMM/dd/y");

        LocalDateTime today=LocalDateTime.now();

        System.out.println(today.format(dtf));



    }




}
