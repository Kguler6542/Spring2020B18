package day23_methods;

public class Methods_WithParamters2 {

    // 3. create a function that can reverse any string

    // "Muhtar" ==> rathuM,    "Cybertek" ==> ketrebyC

    public static void main(String[] args) {
        // create a function that can reverse any string

        // first we ask: Do we need a parameter for creating this method??
        // do we need any extra information to perform the function? if yes ==> parameter
        // If name is "Reem" ==> function will print "meeR"
        // based on the info given ==> result different

        String name1 = "Kamuran";
        ReverseString(name1);

        String name2 = "Cybertek School";
        ReverseString(name2);

    }


    public static void ReverseString(String str){
        // how do we right the function to reverse it? by using loop starting from last index with decrement iterator

        for(int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }

        System.out.println();

    }



}