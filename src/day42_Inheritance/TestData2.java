package day42_Inheritance;

public class TestData2 extends Accessmodifiers{
    /*
    publicVariable --> inherited, can always inherited any classes
    protectedVariable ---> inherited can always inherited any classes
    defaultVariable --> inherited
    publicMethod --->

     */

    public static void main(String[] args) {

        System.out.println(TestData2.publicVariable );
        System.out.println(TestData2.protectedVariable);
        System.out.println(TestData2.defaultVariable);

        TestData2.publicMethod();
        TestData2.protectedMethod();
        TestData2.defaultMethod();


    }
}
