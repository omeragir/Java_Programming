package day17_customClass;

public class SalaryCalculator {
    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public double weeklyHours;

    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double stateTax(double hourlyRate, double stateTaxRate, double weeklyHours) {
        double stateTaxIn = (52 * weeklyHours * hourlyRate) * stateTaxRate / 100;
        return stateTaxIn;

    }

    public double federalTax(double hourlyRate, double federalTaxRateTaxRate, double weeklyHours) {
        double federalTaxIn = (52 * weeklyHours * hourlyRate) * federalTaxRate / 100;
        return federalTaxIn;
    }

    public double salaryAfterTax(double federalTax, double stateTaxRate, double weeklyHours){
        double salaryAfterTaxIn=(52* this.weeklyHours *hourlyRate)-federalTax-stateTaxRate;
        return salaryAfterTaxIn;
    }

    public double salary(double weeklyHours,double hourlyRate){
        double salaryIn=52*weeklyHours*hourlyRate;
        return salaryIn;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", salary=" + salary(weeklyHours,hourlyRate) +
                ", federalTax=" + federalTax(hourlyRate,federalTaxRate,weeklyHours) +
                ", salaryAfterTax=" + salaryAfterTax(weeklyHours,federalTax(hourlyRate,federalTaxRate,weeklyHours),salaryAfterTax(hourlyRate,stateTaxRate,weeklyHours)) +
                '}';
    }
}




/*
Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage, you will responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */