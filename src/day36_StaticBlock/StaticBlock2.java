package day36_StaticBlock;

import day34_CostumClass.Tester;

public class StaticBlock2 {

    static int a;
    static  int b;
    int c;

    /*
    if(100 > 200){
            a =100;
        }else{
            b=20;
        }
     */

    static Tester tester1 = new Tester();

    public static void main(String[] args) {

      //  tester1.setTesterInfo("Ali", 123, "SDET", 12000);
        System.out.println(tester1);



    }

    static {
        a = 100;
        b = 200;
        // c= 300; static only accepts static

        if(100 > 200){
            a =100;
        }else{
            b=20;
        }
        tester1.setTesterInfo("Ali", 123, "SDET", 12000);


    }


}
