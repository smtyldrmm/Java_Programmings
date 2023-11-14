package day32_Constrcutor;

public class ConstructorCalls {
    public ConstructorCalls(){

        System.out.println("Default Constructor");
    }
    public ConstructorCalls(int a){
        this();

        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls(String str){

        this(10);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        ConstructorCalls constructorCalls1=new ConstructorCalls();
        System.out.println("--------------------------------");

        ConstructorCalls constructorCalls2=new ConstructorCalls(10);

        System.out.println("--------------------------------");

        ConstructorCalls constructorCalls3=new ConstructorCalls("JAVA");
    }
}


