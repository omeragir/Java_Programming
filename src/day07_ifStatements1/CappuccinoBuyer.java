package day07_ifStatements1;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "grande";

        String result = "";

        if (size == "tall" || size == "grande" || size == "venti") {
            if(size=="tall"){
                result="price is $3.69\n90 calories";
            } else if (size=="grande") {
                result="price is $3.99\n120 calories";

            }else {
                result="price is $4.29\n150 calories";
            }


        }else{
            System.out.println("invalid size");
        }
        System.out.println(result);
    }
}