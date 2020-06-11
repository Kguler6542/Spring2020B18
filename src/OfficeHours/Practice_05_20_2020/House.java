package OfficeHours.Practice_05_20_2020;

public class House {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Karabas",5,"Black","Large","Husky");

          // dog1.setInfo("Karabas",5,"Black","Large","Husky");

        Dog dog2 = new Dog("Cann", 4,"White","Huge","Kangal");

        System.out.println(dog1);
        System.out.println(dog2);

        dog2.bark();

        System.out.println("========================================================");

        Cat cat1 = new Cat("Muffin",7,"white","medium","Ragdoll");
          //cat1.setInfo("Muffin",7,"white","medium","Ragdoll");

        System.out.println(cat1);
        System.out.println("============================================================");

        Bunny bunny1 = new Bunny("Pamuk",1,"white","small","Holland lop");
        System.out.println(bunny1);
        bunny1.dig();


    }



}
