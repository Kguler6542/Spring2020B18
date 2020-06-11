package day25_MethodsRecap;
/*
 // 3. create a function that can reverse any string

    // "Muhtar" ==> rathuM,    "Cybertek" ==> ketrebyC
 */

public class Test222 {

    public static void main(String[] args) {

   String str = " Muhtar";

 reversed(str);

    }
     public static void reversed (String str){

         for (int i=str.length() -1; i>=0; i--)
             System.out.print(str.charAt(i));
     }

}