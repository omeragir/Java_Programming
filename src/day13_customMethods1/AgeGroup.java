package day13_customMethods1;

public class AgeGroup {
    public static void main(String[] args) {

        agelist(25);

    }

    public static void agelist(int age) {
       if(age>0 &&age<=150){
           if (age < 21) {
               System.out.println("Teenager");
           } else if (age >= 21 && age < 55) {
               System.out.println("Adult");
           } else {
               System.out.println("Senior");
           }

       }else {
           System.out.println("invalid age");
       }

    }

}
/*
Create a method named AgeGroup that can print the age group of the person

	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )
 */