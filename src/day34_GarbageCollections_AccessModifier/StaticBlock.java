package day34_GarbageCollections_AccessModifier;

/*
Static is applicable for following
-Variables
-Methods
-Blocks
-Class
 */

public class StaticBlock {

    // used for initializing static variables
    // runs first before everything, only runs one time
    public static void main(String[] args) {
        System.out.println("Main Method");
    }
    static { // runs first before anything, and only runs one time
        System.out.println("Static Block");
    }
}
