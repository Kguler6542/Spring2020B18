package day44_Exceptions;

import java.util.NoSuchElementException;

  public class finally_Block {

    public static void main(String[] args) {   try {
        System.out.println(9/0);
        System.out.println("Try block");

    }catch(NoSuchElementException e){
        System.out.println("Catch Block");

    }finally { // Finally will get excutated always
        System.out.println("Finally");
    }




    }
}
