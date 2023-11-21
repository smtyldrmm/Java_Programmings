package day34_GarbageCollections_AccessModifier;

public class AccessModifierTest {
    public static void main(String[] args) {

        System.out.println(AccessModifier.publicData);

        System.out.println(AccessModifier.defaultData);

        // System.out.println(AccessModifiers.privateData);

        // Aynı package içerisinde public ve default erişilibilinirken
        // private aynı package içerisinde olsa bile erişilemez.
        // Default değerine farklı package içerisinden ulaşamayız.


    }
}

