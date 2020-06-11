package day42_Inheritance.Task01;
/*

create a sub class of person called Employee
				attributes: name, age, gender, Salary, employeeID, jobTitle
				methods: work, setEmployeeInfo, toString
 */

public class Employee extends Person {
    /*
    name, inherited
    age, inherited
    gender, inherited
    Salary,
    employeeID,
     jobTitle


    setPersonInfo(), inherited
     eat (), inherited
     sleep (), inherited
     walk (), inherited
     drink(), inherited

      setEmployeeInfo, inherited
       work,
       toString

     */

    public double salary;
    public long employeeID;
    public String jobTitle;

    public void setEmployeeInfo (String name,int age,char gender,double salary,long employeeID,String jobTitle){
        //this.name=name;
        //this.age = age;
       // this.gender =gender;
        setPersonInfo(name, age, gender);
        this.employeeID=employeeID;
        this.jobTitle =jobTitle;
        this.salary = salary;

    }

    public void work(){
        System.out.println(name+" is working");
    }

    public String toString(){
        return "Name: "+name+", Job Title: "+jobTitle+", ID: "+employeeID+", Salary: "+salary+", age: "+age+", gender: "+gender;
    }
}
