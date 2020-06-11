package OfficeHours.Practice_05_13_2020;

public class Students {

    String name;
    long id;
    static String schoolName= "Cybertek";

    public String toString(){

        return "Name: "+name+" , id: "+id+ " , School name: "+schoolName;

    }

    public static void printSchoolName(){
        System.out.println(schoolName+" School");

    }
}

 class studentObjects{

     public static void main(String[] args) {

         Students student1 = new Students();
           student1.name = "Can";
           student1.id = 123;

         Students student2 = new Students();
           student2.name = "Ali";
           student2.id = 654;

         System.out.println(student1);
         System.out.println(student2);

     }
 }