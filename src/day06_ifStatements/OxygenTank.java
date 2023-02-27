package day06_ifStatements;

public class OxygenTank {
    public static void main(String[] args) {
        int number = 40;
        String result = "";
        if (number >= 90) {
            result = "Your tank is full";
        }
        if (number >= 80 && number < 90) {
            result = "Still okay";
        }
        if (number >= 70 && number < 80) {
            result = "Don`t go to far";
        }
        if (number >= 60 && number < 70) {
            result = "Start to head back";
        }
        if (number >= 50 && number < 60) {
            result = "Be careful now you at %50";
        }if(number<50){
            result=" Please Tank ";
        }
        System.out.println("result = " + result);
    }
}
