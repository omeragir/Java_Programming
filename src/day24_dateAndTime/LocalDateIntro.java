package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        System.out.println("************LOCAL DATE*******************");

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthDay = LocalDate.of(1988, 1, 1);

        System.out.println(birthDay);

        System.out.println("******************************************");

        System.out.println(today.getYear());

        System.out.println(today.getMonth());

        System.out.println(today.getMonthValue());

        System.out.println(today.getDayOfWeek());

        System.out.println(today.getDayOfMonth());

        System.out.println(today.getDayOfYear());

        System.out.println("********************************************");

        today.plusYears(1);//update

        System.out.println(today);

        System.out.println("********************************************");

        LocalDate graduateDate = LocalDate.of(2025, 6, 4);

        graduateDate = graduateDate.plusYears(2);//assign

        System.out.println(graduateDate);

        graduateDate = graduateDate.plusMonths(7);

        System.out.println(graduateDate);

        graduateDate = graduateDate.plusWeeks(7);

        System.out.println(graduateDate);

        graduateDate = graduateDate.plusDays(100);

        System.out.println(graduateDate);

        System.out.println("********************************************");

        LocalDate yourBirthday = LocalDate.of(2005, 4, 1);

        yourBirthday = yourBirthday.minusYears(2);

        System.out.println(yourBirthday);

        yourBirthday = yourBirthday.minusMonths(3);

        System.out.println(yourBirthday);

        yourBirthday = yourBirthday.minusWeeks(5);

        System.out.println(yourBirthday);

        yourBirthday = yourBirthday.minusDays(100);

        System.out.println(yourBirthday);
        System.out.println("********************************************");

        LocalDate birthDay1 = LocalDate.of(1994, 7, 7);
        LocalDate birthDay2 = LocalDate.of(1994, 7, 7);

        boolean r1 = birthDay1.isEqual(birthDay2);
        System.out.println(r1);

        System.out.println("********************************************");

        LocalDate graduateStudent=LocalDate.of(2023,1,1);

        System.out.println(graduateStudent.isBefore(LocalDate.of(2022,12,31)));
        System.out.println(graduateStudent.isAfter(LocalDate.of(2022,12,31)));

        System.out.println("********************************************");

        System.out.println(LocalDate.of(2022,6,16).isLeapYear());




    }
}
