package day37_Constructors;

public class ConstructorIntro {


    // publci method (){} constructor name MUST be same with the class name

    public ConstructorIntro(int a){ // constructor with argument

        System.out.println("Constructor with argument of int");

    }

    public static void main(String[] args) {

       //  ConstructorIntro obj = new ConstructorIntro(); // object must be created with existing constructor

        ConstructorIntro obj2 = new ConstructorIntro(10);
        ConstructorIntro obj3 = new ConstructorIntro(10);



    }



}

