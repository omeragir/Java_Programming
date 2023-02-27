package day08_ternaries_switch;

public class CydeoBatches1 {
    public static void main(String[] args) {
        String cydeoBatches1 = "Us morning";
        String result = "";
        if (cydeoBatches1 == "Us morning") {
            result = "Class times are 10-5 EST. M,T,Th,F. ";
        } else if (cydeoBatches1 == "Us evening") {
            result = "Class times are 7-10 EST. M,T,Th,F. ";
        } else if (cydeoBatches1 == "EU:") {
            result = "Class times are 10-5 EST. M,T,Th,F. ";
        } else {
            result = "Invalid Batches";
        }
        System.out.println("result = " + result);

    }
}
