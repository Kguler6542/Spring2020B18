package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class DevelopersObject {

    public static void main(String[] args) {

        Developer developer1  = new Developer();
        developer1.setInfo("John", "Senior Developer", 160_000,18121993);

        System.out.println(  developer1  );

        Developer developer2 = new Developer();
        developer2.setInfo("Leon","Senior Developer",180000,12546);

        developer1.coding();
        developer2.coding();

        developer1.fixingBug();
        developer2.fixingBug();
        System.out.println("=======================================================");

        Developer[] arr = {developer1, developer2};
/*
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
 */

        for(Developer each  : arr ){
            System.out.println(each);
        }

        System.out.println("=================================================================");

        ArrayList<Developer> developers = new ArrayList<>();
        developers.addAll(Arrays.asList(developer1,developer2));

       // for (int i = 0; i <developers.size() ; i++) {
        //    System.out.println(developers.get(i));
       // }

       for (Developer each :  developers)

           System.out.println(each.name+" "+each.salary);

    }


}