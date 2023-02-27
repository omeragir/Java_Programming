package day07_ifStatements1;

public class Test {
    public static void main(String[] args) {
        int vehicleYear = 1995;

        String result = "";
        if (vehicleYear >= 1995 && vehicleYear <= 1998) {
            result = "Your vehicle needs to be recalled";


        } else {
            result = "Your vehicle is fine, enjoy!";
        }

        System.out.println(result);
    }


}
