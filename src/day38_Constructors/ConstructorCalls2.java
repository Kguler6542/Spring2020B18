package day38_Constructors;

public class ConstructorCalls2 {


    public ConstructorCalls2(){

        System.out.println("Default Constructor");

    }

    public ConstructorCalls2(int a ){
        this();// "Default Constructor"
        System.out.println("Constructor with int argument ");

    }

    public ConstructorCalls2(String str){
       //  System.out.println("hello"); // contructor calls first
        this(10);
        System.out.println("Constructor with String argument");
       //  this(); only use one time to call constructor
    }

    public static void main(String[] args) {
        
        ConstructorCalls2 obj = new ConstructorCalls2("Hello");


    }

    public void method1(){

        // ConstructorCalls2();

    }

    {

    }

}
