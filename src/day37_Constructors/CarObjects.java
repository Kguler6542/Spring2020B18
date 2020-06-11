package day37_Constructors;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Nissan", "Altima",2020,32000);

        System.out.println(car1.brand);
        System.out.println(car1.model);

         System.out.println(car1);

         Car car2 = new Car("Merecedes", "C300", 2018, 4500);
          System.out.println(car2);
    }


}
