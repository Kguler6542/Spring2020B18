package OfficeHours.Practice_05_27_2020;

public class methodOverriding2 {

    protected void method1(){ }

    public static void method2(){ }

    public methodOverriding2 (){}

}

 /// OONLy instance method can be overrriidng

class TestClass extends methodOverriding2{

    @Override
    protected  void method1(){ }

      // @Override
    // public  static void method2(){} Sttaic cannot be overriidng

    // public  methodOverriding2(){} constructor cannot be overriidng

}
