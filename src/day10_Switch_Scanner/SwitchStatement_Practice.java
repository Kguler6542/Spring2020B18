package day10_Switch_Scanner;


public class SwitchStatement_Practice {

    public static void main(String[] args) {
        int day = 8;

        switch(day) {
            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:// No matter where you place default
                System.out.println("Invalid");

            case 7:
                System.out.println("Sunday");
                break;


        }




    }


}