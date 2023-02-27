package day09_scanner;

public class CrewAndPassenger {
    public static void main(String[] args) {
        int num = 75;

        String result1="Total, 50 crew:30,passengers:70";

        if (num >= 50 ||num==75|| num <= 100) {

            if (num == 100) {
            result1=result1;
            } else if (num==75) {
                result1="Total 50 crew:25,passengers:50";
            } else if (num==50) {
                result1="Total 50 crew:20,passengers:30";

            }else {
                result1="Invalid";
            }
        }
        System.out.println("result1 = " + result1);
        System.out.println("-------------------------------------------------------------");

switch (num){
    case 50:
        System.out.println("Total 50 crew:20,passengers:30");
        break;
    case 75:
        System.out.println("Total 50 crew:25,passengers:50");
        break;
    case 100:
        System.out.println("Total, 50 crew:30,passengers:70");
        break;
    default:
        System.out.println("Invalid");
}
        System.out.println("-----------------------------------------------------------------");


    }
}
