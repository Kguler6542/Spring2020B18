package day38_Constructors;

public class ConstructorCalls3 {

    public ConstructorCalls3(){
        //this(9); // int arg
        System.out.println("default");

    }

    public ConstructorCalls3(int a ){
        //  this(10); // constructor can not call itself
        this();
        System.out.println("Int Argument");

    }

    public ConstructorCalls3(String str){
        this();

    }

    public static void main(String[] args) {

        new ConstructorCalls3();


    }

    public void method1(){
        // this();
        method1();// method can call itself

    }

}
