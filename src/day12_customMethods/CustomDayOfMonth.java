package day12_customMethods;

import java.util.Locale;

public class CustomDayOfMonth {
    public static void main(String[] args) {
        dayOfMonth("january");
        System.out.println("--------------------------------");
        monthName("January");


    }

    public static void dayOfMonth(String month){
        if(month.equalsIgnoreCase("January")){
            System.out.println(month.toUpperCase().charAt(0)+month.substring(1)+" has 31 days");
        } else if (month.equalsIgnoreCase("February")) {
            System.out.println(month.toUpperCase().charAt(0)+month.substring(1)+" has 28 days");

        } else if (month.equalsIgnoreCase("March")) {

            System.out.println(month.toUpperCase().charAt(0)+month.substring(1)+" has 31 days");
        } else if (month.equalsIgnoreCase("April")) {

            System.out.println(month.toUpperCase().charAt(0)+month.substring(1)+" has 30 days");
        } else if (month.equalsIgnoreCase("May")) {

            System.out.println(month.toUpperCase().charAt(0)+month.substring(1)+" has 31 days");
        } else if (month.equalsIgnoreCase("June")) {

            System.out.println(month.toUpperCase().charAt(0)+month.substring(1)+" has 30 days");
        } else if (month.equalsIgnoreCase("July")) {

            System.out.println(month.toUpperCase().charAt(0)+month.substring(1)+" has 31 days");
        } else if (month.equalsIgnoreCase("August")) {

            System.out.println(month.toUpperCase().charAt(0)+month.substring(1)+" has 31 days");
        } else if (month.equalsIgnoreCase("September")) {

            System.out.println(month.toUpperCase().charAt(0)+month.substring(1)+" has 30 days");
        } else if (month.equalsIgnoreCase("October")) {

            System.out.println(month.toUpperCase().charAt(0)+month.substring(1)+" has 31 days");
        } else if (month.equalsIgnoreCase("November")) {

            System.out.println(month.toUpperCase().charAt(0)+month.substring(1)+" has 30 days");
        } else if (month.equalsIgnoreCase("December")) {

            System.out.println(month.toUpperCase().charAt(0)+month.substring(1)+" has 31 days");
        }else {
            System.err.println("Invalid");
        }



    }
    public static void monthName(String name){
        String result="";
        switch (name){
            case "January": case "March": case"May": case "July": case "August": case "October": case "December":
                result=name+" has 31 days";
                break;

            case "April": case "June": case "September": case "November":
                result=name+" has 30 days";
                break;
            case "February":
                result=name+" has 28 dasy";
            default:
                result="Invalid";

        }
        System.out.println(result);
    }
}
