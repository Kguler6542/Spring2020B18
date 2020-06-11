package Resources;

import day40_Encapsulation.Encapsulation;

public class Encapsulation_Test {

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();

       // Encapsulation_Test obj2 = new Encapsulation_Test();
              // obj2.SSN = 100;

        // System.out.println(obj.SSN);

       System.out.println(obj.getSSN());//0

        obj.setSSN(123);

        System.out.println(  obj.getSSN());

    }

}
