package day05_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate=50;
        int weeklyHours=45;
        int stateTaxRate=6;
        int federalTaxRate=26;


        int salaryBeforeTax=52*hourlyRate*weeklyHours;

        int stateTax=salaryBeforeTax*stateTaxRate/100;

        int federalTax=salaryBeforeTax*federalTaxRate/100;
        int totalTax=stateTax+federalTax;
        int netIncome=salaryBeforeTax-totalTax;
        System.out.println("Gross pay is: $"+salaryBeforeTax);
        System.out.println("Federal tax is: $"+federalTax);
        System.out.println("State tax is: $"+stateTax);
        System.out.println("Total tax is: $"+totalTax);
        System.out.println("Net income is: $"+netIncome);



    }
}
