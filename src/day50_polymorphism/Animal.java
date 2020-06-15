package day50_polymorphism;

public abstract class Animal { // 2 var, 2 method

    public String gender;
    public int age;

    public void eat(String food) { System.out.println("Animal is eating"); }

    public void sleep() { System.out.println("Animal is sleeping"); }

    public  static void methodA(){ // static cannot be overriting

        System.out.println("Animal class");
    }

}


