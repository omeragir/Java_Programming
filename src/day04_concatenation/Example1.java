package day04_concatenation;

public class Example1 {
    public static void main(String[] args) {
        String firstName = "Noah",
                lastName = "Smith",
                companyName = "Apple";
        int salary = 20_000;
        int startDay = 10;
        int startMonth = 1;
        int startYear = 2022;
        boolean fullTime = true;
        String jobTitle = "SDET";
        String officeAddress = "One Apple Park Way, Cupertino, CA 95014";
        char at = '@';
        String com=".com";


        String fullName = firstName+lastName;
        String fullStartDate = startMonth+"/"+startDay+"/"+startYear;
        String email = firstName+startDay+at+companyName+com;
        int salaryAfter2Years=salary+(salary*15/100);
        System.out.println("Employee Information");
        System.out.println("We have "+firstName+" "+lastName+" joining "+companyName);
        System.out.println(firstName+" will start on "+fullStartDate+" as full time: "+fullTime);
        System.out.println(firstName+" here is some information about your employment");
        System.out.println("Your email is "+email);
        System.out.println("Your base salary is $"+salary+" and after 2 years it will be $"+salaryAfter2Years);
        System.out.println("Welcome aboard, see you at "+officeAddress);




    }
}
