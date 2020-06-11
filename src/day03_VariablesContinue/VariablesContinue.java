package day03_VariablesContinue;

public class VariablesContinue {

    /*
    >=: greater or equal   9 >= 9 ==> true
    <: less   10 < 20 ==>true
    <=: less or equal  10 <= 10 ==>true
    == : equal  8 == 8 ==> true
    != : not equal  10 != 10 ==> false
     */
    public static void main(String[] args) {
        boolean result1 = true;
         boolean result2 = false;

       boolean result3 = 10 > 9; // true
        System.out.println( result3);

        System.out.println( true == false);
        System.out.println("Sergen"=="Good guy"); // Bad guy == Good guy== > False
        System.out.println("Sergen"!= "Good guy"); //True
        boolean r1 = true != true; // False
        System.out.println(r1);

        System.out.println("==============================");

      char ch1='A';
        System.out.println(ch1); //A
        char ch2=4500;
        System.out.println(ch2);

        char ch4=100; // d ASCII Table
        System.out.println(ch4);







    }


}
