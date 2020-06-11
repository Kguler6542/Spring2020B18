package day45_Exceptions;


class BreakTimeException extends RuntimeException{ // custom unchecked exception

 public BreakTimeException(){
     super("its break time");
 }
 public BreakTimeException(String str){
     super(str);

 }
}

public class CustomException {

    public static void main(String[] args) {

        boolean breakTime = true;

        if(breakTime){
            throw new BreakTimeException("lets eat something");

        }else {

            System.out.println("Going to run");
        }

        //throw new RuntimeException(" its break time");
    }


}
