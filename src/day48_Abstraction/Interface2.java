package day48_Abstraction;

public interface Interface2 {
    // Constructor WONT be in interface ,
    // instance variable WONT be in interface ,
    // instance method as well, no instance block WONT be in interface ,
    // static block WONT be in interface ,

    // We can have abstract method in Interface
    //We can have static  method in Interface

    //We can have Static and Final by default variable in Interface

    //public Interface2(){}// Constructor

    // public void method1(){}


    int a=100;

    public static void main(String[] args) {

        System.out.println(a); // by default static

       // a=200; // by default is final we cannot reassign since its final

        System.out.println(Interface2.a);
        Interface2.method4();

    }
    public static void method4(){ }
    void method();

    public default void method6(){
        System.out.println("Defualt method can be using in interface ");
    }

}
