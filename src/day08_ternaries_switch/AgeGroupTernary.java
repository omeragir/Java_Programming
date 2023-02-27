package day08_ternaries_switch;

public class AgeGroupTernary {
    public static void main(String[] args) {
        int age = 858;
        String result = (age >= 1 && age <= 2) ?"Infant":(age>=3&&age<=5)?"Toddler":(age>=6&&age<=9)?"Kid"
                :(age>=10&&age<=12)?"Pre-Teen":(age>=13&&age<=17)?"Teenager":(age>=18&&age<=20)?"Young Adult"
                :(age>=21&&age<=39)?"Adult":(age>=40&&age<=49)?"Young Middle-Adult":(age>=50&&age<=54)?"Very Young Senior Citizen"
                :(age>=65&&age<=74)?"Young Senior Citizen":(age>=75&&age<84)?"Senior Citizen":(age>=85&&age<=150)?"Old Senior Citizen":"Invalid";
        System.out.println("result = " + result);
    }
}
