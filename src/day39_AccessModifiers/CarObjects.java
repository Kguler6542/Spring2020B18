package day39_AccessModifiers;

public class CarObjects {

    public static void main(String[] args) {
        // new Cunstructor

        Car car1 =new Car("Mercedes");
        System.out.println(car1);

        Car car2= new Car("Toyota", "Prius");
        System.out.println(car2);

        Car car3 = new Car("Nissan","Sentra", 2020);
        System.out.println(car3);

        Car car4 = new Car("BMW", "X5",2015,35000);
        System.out.println(car4);

    }
}
