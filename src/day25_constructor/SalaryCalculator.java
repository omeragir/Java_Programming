package day25_constructor;

public class SalaryCalculator {
    public double hourlyRate;
    public double weeklyHours;
    public double stateTaxRate;
    public double federalTaxRate;

    public SalaryCalculator(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){
        return 52*hourlyRate*weeklyHours;
    }
    public double totalTax(){
        return (stateTaxRate+federalTaxRate)/100;
    }
    public double federalTax(){
        return federalTaxRate/100;
    }
    public double stateTax(){
        return stateTaxRate/100;
    }
    public double salaryAfterTax(){
        return salary()-(salary()*totalTax());
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary=" + salary() +
                ", salaryAfterTax=" + salaryAfterTax() +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                '}';
    }
}
/*
 Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): calculates the total state tax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */