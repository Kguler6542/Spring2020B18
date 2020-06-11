package day37_Constructors;

public class StudentsObject {

    public static void main(String[] args) {

        Student student1 = new Student("Can", 34, 'F', "Okul");

        // student1.setInfo("Can", 34, 'F', "Okul");

        System.out.println(student1);

        Student student2= new Student ("Ali", 15, 'M',"Van Okul");

        System.out.println(student2);
    }



}
