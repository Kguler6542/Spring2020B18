package day01_FirtsProgramming;

public class Palindrom {

    public static void main(String[] args) {
        String str="mam mam";
        System.out.println(isPal(str));

    }
    public static boolean isPal(String inputStr) {
        inputStr = inputStr.toLowerCase();
        String str = inputStr.replaceAll("\\s","");

        int i = 0,

        j = inputStr.length() - 1;

        while (i < j) {
            if (inputStr.charAt(i) != inputStr.charAt(j))

                return false;
            i++;
            j--;
        }
       return true;
    }

}
