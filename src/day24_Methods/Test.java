package day24_Methods;

import Resources.Library;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;

//import java.util.Arrays;
//import Resources.Library;

public class Test {

    public static void main(String[] args) {
       String str = "Kamuran";
          String RevStr = Library.Reverse(str);
        System.out.println(RevStr);

        int []arr = {5,9,10,3,2,-1};
        arr= Library. sortDesending(arr);
        System.out.println(Arrays.toString(arr));



        /*


        String str = "Cybertek";

        String RevStr = Library.Reverse(str);

        System.out.println(  str.equalsIgnoreCase(RevStr)    );

        int[] arr = {100, 300, 200, 40000, 50000,10000000};

        arr =    Library.sortDesending(arr);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
  */






    }

}