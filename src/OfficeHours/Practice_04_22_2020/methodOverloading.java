package OfficeHours.Practice_04_22_2020;

public class methodOverloading {

    public static void main(String[] args) {

        //method1();
       int num1=  method1(10); // Helloo2 first and then retrun 10
       System.out.println(num1);

    }

    public static void method1(){
        System.out.println("Helloo1");

     }
    public static int method1(int a){

        // System.out.println("Helloo2");
        return 10;

     }
    public static void method1(int a , int b){

        System.out.println("Helloo3");
     }
}
