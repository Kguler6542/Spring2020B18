package OfficeHours.Practice_04_22_2020;

public class return_Statement {

    public static void main(String[] args) {
/*
        if(10>9){
            return;
        } */

        method1();

        System.out.println("Hello Can ");
    }


     public static void method1 () {

         if (10 > 9) {
             // return; use for Method
             System.exit(0); // can use anywhere
             // break; This is for loop or switch statemnet only the same thing for cuntunie statement as well.
         }

         System.out.println("Hellooooo");

     }


     public static void method2 (){
        return; // exits only since its void

    }
     public static int method3(){
        return 123; // exits after returnin the value since its int

    }






}

