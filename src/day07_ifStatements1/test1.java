package day07_ifStatements1;

public class test1 {
    public static void main(String[] args) {
       int vehicleYear=1999;
        String result = "";
        if (vehicleYear >= 1995 && vehicleYear <= 1998) {
            result = "Your vehicle needs to be recalled";

        }if (vehicleYear >= 2001 && vehicleYear <=2002) {
            result = "Your vehicle needs to be recalled";
        }if (vehicleYear >= 2004 && vehicleYear <= 2006) {
            result = "Your vehicle needs to be recalled";
        } if (vehicleYear >= 2015 && vehicleYear <= 2017) {
            result = "Your vehicle needs to be recalled";}
        else {
            result = "Your vehicle is fine, enjoy!";
        }

        System.out.println(result);
    }


}

