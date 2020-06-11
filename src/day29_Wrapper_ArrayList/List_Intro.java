package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Intro {

    public static void main(String[] args) {

                     // MUST                              Optional
    //     ArrayList<DataType> ListName =  new ArrayList<DataType>();

        ArrayList <Integer> scores = new ArrayList<>(); // size: 0
                                    // add five elements, size:5
                                   // remove two elements, size:3 Autmaticaly

        scores.add(10); // autoboxing size:1
        scores.add(20); // autoboxing size:2
        scores.add(30);  // autoboxing size:3


        System.out.println(scores);
        System.out.println("__________________________________________");

         Integer a1= scores.get(2); // none
         int a2= scores.get(2);    // unboxing
         double a3 = scores.get(2); // unboxing

        System.out.println(a1);





    }


}
