package day34_GarbageCollections_AccessModifier;

public class AccessModifier {
    public static int publicData=100;

    static int defaultData=200;

    private static int privateData=300;

    public static void main(String[] args) {

        System.out.println(publicData);

        System.out.println(defaultData);

        System.out.println(privateData);
    }
}
