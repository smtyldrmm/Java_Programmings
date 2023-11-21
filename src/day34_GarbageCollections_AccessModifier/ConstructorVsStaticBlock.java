package day34_GarbageCollections_AccessModifier;

public class ConstructorVsStaticBlock { static {
    System.out.println("Static Block");
}
    public ConstructorVsStaticBlock(){

    System.out.println("Constructor");
    }

    public static void main(String[] args) {

    System.out.println("Main Method");
    }
}