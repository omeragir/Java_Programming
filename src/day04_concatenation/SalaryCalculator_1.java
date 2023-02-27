package day04_concatenation;

public class SalaryCalculator_1 {
    public static void main(String[] args) {
        int hourlyRate=50;
        int weeklyHours=45;
        double salaryBeforeTax=52*hourlyRate*weeklyHours;
        double stateTax=salaryBeforeTax*6/100;
        double federalTax=salaryBeforeTax*26/100;
        double totalTax=stateTax+federalTax;
        double netIncome=salaryBeforeTax-totalTax;
        System.out.println("Gross pay is: $"+salaryBeforeTax);
        System.out.println("\t Federal tax is: $ "+federalTax);
        System.out.println("\t State tax is: $"+stateTax);
        System.out.println("\t Total ta is: $"+totalTax);
        System.out.println("\t\t Net income is: $"+netIncome);


        }




    }

