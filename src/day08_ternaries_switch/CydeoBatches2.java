package day08_ternaries_switch;

public class CydeoBatches2 {
    public static void main(String[] args) {
        String cydeoBatches="Us morning";
        String result1="";
        switch (cydeoBatches){
            case "Us morning":
                result1="Class times are 10-5 EST. M,T,Th,F. ";
                break;
            case "Us vening":
                result1="Class times are 7-10 EST. M,T,Th,F. ";
                break;
            case "EU:":
                result1="Class times are 10-5 EST. M,T,Th,F. ";
                break;
            default:
                result1="Invalid Batches";
                break;
        }
        System.out.println("result1 = " + result1);



    }
}
