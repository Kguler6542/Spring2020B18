package day41_Inheritance;

public class Fish extends Animal {

    public void swim(){

        System.out.println(name+" is swiming ");
    }

    public static void main(String[] args) {


  Fish obj = new Fish();
        obj.name = " Silly";
        obj.weight= 5;
        obj.size="Small";

        obj.eat();
        obj.move();
        obj.swim();
        // obj.bark();




    }
}
