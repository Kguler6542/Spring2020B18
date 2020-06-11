package day07_IfStatements;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        double gpa;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the GPA , please: ");
        gpa=scan.nextDouble();

        if(gpa>4.0){ System.out.println("Invalid GPA"); }

        else if(gpa==4.0){
            System.out.println("A+"); }

        else if(gpa >= 3.75 && gpa < 4.0){
            System.out.println("A"); }

        else if(gpa >=3.5 && gpa<3.75){
            System.out.println("A-"); }

        else if(gpa >=3.25 && gpa<3.5){
            System.out.println("B+"); }

        else if(gpa >=3.0 && gpa<3.25){
            System.out.println("B"); }

        else if(gpa >=2.75 && gpa<3.0){
            System.out.println("B-"); }

        else if(gpa >=2.0 && gpa<2.75){
            System.out.println("C"); }

        else if(gpa >=0 && gpa<2.0){
            System.out.println("F"); }

        else { System.out.println("Invalid GPA"); }

}

}
