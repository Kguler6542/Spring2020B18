package day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {

        String str= "123";

       int a1=Integer.parseInt(str); //123

        System.out.println(str + 1);//test
        // "123" + 1 ===> "1231"

        System.out.println(a1 + 1);//number
       // 123+1==>124


      byte b1 = Byte.parseByte(str); // byte=123

        System.out.println(b1 +1 );

        Integer I1= (int) Byte.parseByte(str); // Autoboxing



        String str2= "10.5";

         float f1 = Float.parseFloat(str2); // float 10.5

        System.out.println(f1 + 5);

        double f2 = Double.parseDouble(str2); // double 10.5
        System.out.println(f2 +1 );



        String str3= "3147483647";

        long num1= Long.parseLong(str3); //3147483647
        System.out.println(num1);

        Long num2 = Long.parseLong(str3);
        System.out.println(num2);


        String result1 = " true ";

        boolean r1 =Boolean.parseBoolean(result1);

        System.out.println(r1);


        String result2 = "fALsE";

               boolean r2 = Boolean.parseBoolean(result2);
                 System.out.println(r2);



    }
}
