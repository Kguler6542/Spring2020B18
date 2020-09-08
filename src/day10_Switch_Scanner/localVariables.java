package day10_Switch_Scanner;

public class localVariables {
    public static void main(String[] args) {
     // declare variable : DateType  variableName;
        int a=0; // this is a local variable because it is declared within this block {    }

        System.out.println(a);

        if (true){
            System.out.println(a);
            int b=10;

        }

       // System.out.println(b); // local variables cannot be used outside its block
    }


}
