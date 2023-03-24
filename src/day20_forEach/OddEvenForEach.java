package day20_forEach;

public class OddEvenForEach {
    public static void main(String[] args) {

        int[] numbers={5,15,20,63,98};
        for (int each : numbers) {

            if(each%2==0){
                System.out.println(each+" even number");
            }else {
                System.out.println(each+" odd number");
            }

        }




    }
}
