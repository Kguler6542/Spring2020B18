package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainsAll {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
                    list1.add(10);
                    list1.add(20);
                    list1.add(30);
                    list1.add(40);

                    // if 10,20,60 ,if all objects are exit in Arraylist its true if not its false
/*
                 boolean r1= list1.contains(10);
                   boolean r2= list1.contains(20);
                   boolean r3= list1.contains(60);
                     boolean result= r1==true && r2==true && r3==true;
                     System.out.println(result);

 */

                boolean result2=list1.containsAll(Arrays.asList(10,2,60));
                System.out.println(result2);

                // lets see 10,20,40 contain in arraylist or not

                Integer [] data= {10,2,80};

                boolean result3=list1.containsAll(Arrays.asList(data));

               System.out.println(result3);




    }

}
