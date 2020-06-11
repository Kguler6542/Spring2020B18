package OfficeHours.Practice_04_22_2020;

public class void_Method {


    public static void main(String[] args) {
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");

        System.out.println("====================================");

        print();

        System.out.println("============================================");
        boolean UScitizen = true;
        int age= 21;

        Vote(age, UScitizen);

        Vote(35, false);

        System.out.println("============================================");
        //28

        EligibleToBuCig(age);

    }

    public static void print(){

        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");



    }

    // write a function that can idenfiy if a person is eligible to vote
    // MUST know: age, UScitizen


    public static void Vote(int age, boolean UScitizen){

        boolean eligibleToVote= age>= 18 && UScitizen == true;
        if(eligibleToVote){
            System.out.println("You are eligible to vote");

        }else {

            System.out.println(" You are not eligible to vote yet");
        }

    }




    // write a program if a person is eligible to smoke
    // MUST know; age

    public static void EligibleToBuCig (int age){

        if( age> 18){
            System.out.println("Eligible to buy");

        } else{
            System.out.println("Not eligible to buy");

        }


    }

}
