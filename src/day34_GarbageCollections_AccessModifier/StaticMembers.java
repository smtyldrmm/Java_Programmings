package day34_GarbageCollections_AccessModifier;

public class StaticMembers {

    // class can be static
    static class class1{

    }

    // variable can be static
    public static int num=100;

    //method can be static
    public static void method(){

    }
    // Block can be static
    static {

    }
}

class A{ // outer class can NOT be static class
    static class B{ // inner class could be static class

    }
}
