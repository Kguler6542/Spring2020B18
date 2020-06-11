package day29_Wrapper_ArrayList;

import com.sun.org.apache.xerces.internal.impl.dv.xs.BooleanDV;

import java.util.Arrays;

public class ValueOfMethods {

    public static void main(String[] args) {

        String str = "123";

        Integer a = Integer.valueOf(str); // Integer, 123

        System.out.println(a);

        String str2= "15.5";

        double d1= Double.parseDouble(str2);
        // double = double // none

        double d2= Double.valueOf(str2);
           // double = Double // Unboxing

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1==d2);


        System.out.println("============================================");

        String r1= "true";

        Boolean t1= Boolean.valueOf(r1); // Boolean , true
                  // Boolean== Boolean //none


        boolean  t2 = Boolean.valueOf(r1); //  boolean , true
                     // oolean== Boolean // unboxing

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("============================================");

        int maxNum= Integer.MAX_VALUE;
        System.out.println(maxNum);

        int miNum= Integer.MIN_VALUE;
        System.out.println(miNum);


        double maxNum2 = Double.MAX_VALUE;
        System.out.println(maxNum2);

        byte maxNum3= Byte.MAX_VALUE;
        System.out.println(maxNum3);

        byte minNum3= Byte.MIN_VALUE;
        System.out.println(minNum3);

        int[] arr = new int [2];
        System.out.println(Arrays.toString(arr));

        Integer[] arr2= new Integer[2];
        System.out.println(Arrays.toString(arr2));


    }


}
