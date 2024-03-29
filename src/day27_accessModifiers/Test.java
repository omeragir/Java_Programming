package day27_accessModifiers;

public class Test {
    public static void main(String[] args) {

        //new StaticInitializationBlock();

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);
        System.out.println("----------------------------------");

        System.out.println(AccessModifier.publicData);

        System.out.println(AccessModifier.protectedData);

        System.out.println(AccessModifier.defaultData);

       // System.out.println(AccessModifier.privateData); not accessible

        new AccessModifier();

        AccessModifier.publicMethod();


    }
}
