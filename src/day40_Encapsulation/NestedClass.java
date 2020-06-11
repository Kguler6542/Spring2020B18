package day40_Encapsulation;

// this for info only we will not use anywhere
// if class can be static yes only inner class

public class NestedClass {



   static class  data{ // nested inner class can be static
       static int a = 100;
       static int b = 300;

    }

    public static void main(String[] args) {

        System.out.println(NestedClass.data.a);

    }
}
