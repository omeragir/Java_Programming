package day08_ternaries_switch;

public class CydeoBatches3 {
    public static void main(String[] args) {
        String cyeoBatches = "Us ";

        String result = (cyeoBatches == "Us morning") ? "Class times are 10-5 EST. M,T,Th,F. " : (cyeoBatches == "Us evening") ? "Class times are 7-10 EST. M,T,Th,F."
                : (cyeoBatches == "EU:") ? "Class times are 10-5 EST. M,T,Th,F." : "Invalid Batches";

        System.out.println("result = " + result);

    }
}
