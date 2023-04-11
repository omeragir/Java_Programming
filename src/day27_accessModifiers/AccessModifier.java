package day27_accessModifiers;

public class AccessModifier {

    public static int publicData = 200;

    protected static int protectedData = 100;

    static int defaultData = 400;

    private static   int privateData=500;

    protected AccessModifier(){

    }

    public static void publicMethod(){
        System.out.println("public");
    }
    protected  void protectedDataMethod(){
        System.out.println("protected");
    }
     static void defaultDataMethod(){
        System.out.println("default");
    }
    private static void privateMethod(){
        System.out.println("private");
    }


    public static void main(String[] args) {


        System.out.println(publicData);

        System.out.println(protectedData);

        System.out.println(defaultData);

        System.out.println(privateData);

        new AccessModifier();


    }

}
