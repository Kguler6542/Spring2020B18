package day04_JavaRecap;

public class Variable_Practice {
    public static void main(String[] args) {
     // Data Type variableName  = Date;
        byte num1= 127;
        short num2=num1; // double>float>long>int>short>byte

       //  byte num3=num2; // compiler error why since short cannpt assignt to byte

        int num4=num2; // int is prefered by compiler
        long num5= 999999999999L;

        float num6= 100L;
        System.out.println(num6);
        float num7= 0.5f; // 0.5
        System.out.println(num7);

        double num8 = 0.5f;
        double num9 = 999999L;
        System.out.println();
        double num10 = 100.5;

        System.out.println(num10);

        char ch1 ='$'; // everysingle character has a corresponding number
        System.out.println(ch1); // $

        char ch2= 1200; // 0 to 65565
        System.out.println(ch2);

        int a1='8';
        System.out.println(a1); // 56

        int a2= 'z'; // 122
        System.out.println(a2);

        double d1 = 'z' + '8';
        System.out.println(d1);

        char ch3 =178;
        System.out.println(ch3);

        char ch4= 'z' + '8';
        System.out.println(ch4);

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(9>10); // false
        System.out.println(bool2); //true
        System.out.println(9<=10); // true
        System.out.println('a' == 'b'); // false
        //System.out.println('a' == "a"); // '' does not match ""

        System.out.println('a'=='b'-1); // true
                            // 97 == 98-1
                            // 97 == 97

        System.out.println(  "Muhtar" == "Good Guy"  ); // False
        System.out.println("Muhtar" != "Good Guy"); // True
        System.out.println("Muhtar" == "muhtar"); // False

        // System.out.println( " Cybertek" == 10000); data must matches

        System.out.println("=======================");

        boolean r1 = !true; // false
        System.out.println(r1);
        System.out.println(!r1);
        System.out.println(!true == false); // true

        System.out.println( !true  != !false); // true








































    }

}
