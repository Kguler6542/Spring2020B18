package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class ArrayList_Methods {

    /*
   Arraylist doesnt support primitive, size is auto adjust
   arraylist has index number
    add (), get(), size(), set(), remove(), clear(), indexof(), lastIndexof()
     // list2: {A,B,E C,D}; replace C with F
      // add()inserting but set() replacing

     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

           list.add(10);
           list.add(20); //{10,20}

           list.add(1 ,30); // adds elelement at the given index

        System.out.println(list);
        System.out.println(list.size());

        //[10,30,20]

         int num1 = list.get(2);

        System.out.println(num1);

        ArrayList<String> list2 = new ArrayList<>();
              list2.add("A");
             list2.add("B");
             list2.add("C");
             list2.add("D"); // ABCD

            list2.add(2,"E");
             System.out.println(list2);

        for (int i = 0; i < list2.size(); i++) {

            String str= list2.get(i);
            System.out.println(str);
        }


        System.out.println("===================================");

        for(String each :list2){

            System.out.println(each);// print each element
        }


        list2.set(3,"F");
        System.out.println(list2);


        list2.remove(3);
        System.out.println(list2);

        boolean r1=list2.remove("A");
        System.out.println(list2);

        System.out.println(r1);
         list2.clear();
        System.out.println(list2.size());
        System.out.println(list2);



    }





}
