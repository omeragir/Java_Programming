package day37_exception;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            System.out.println("Runtime Exception has been caught");
            e.printStackTrace();
            //System.exit(1);  //if you want to finally block stop
        }finally {
            System.out.println("Finally block");
        }
    }
}
