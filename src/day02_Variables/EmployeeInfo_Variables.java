package day02_Variables;

public class EmployeeInfo_Variables {
    /*
    Create a class called EmployeeInfo_Variables :
    print:
    your company's name
    your EmployeeName
    your EmployeeId
    Your JobTitle
    your Salary
    SSN
     */
    public static void main(String[] args) {
        String employeeName = "Fatih";
        String companyName = "Oracle";
        int employeeId = 9;
        String jobTitle = "QA";
        double salary = 100000.5;
        int ssn = 123456789;
        // employee name : Jack


        System.out.println("Employee Name:  "+ employeeName);
        System.out.println("Company Name: "+ companyName);
        System.out.println("Employee Id: "+ employeeId);
        System.out.println("Job Title :"+ jobTitle);


        System.out.println("Employee Name: "+employeeName+"\n Company Name: "+companyName
                +"\nEmployee ID: "+employeeId);

        System.out.println("===================");
        String firstName= "Zeyno";
        String lastName= "Zeynap";
        // Full Name : Zeyno Zeynap

        System.out.println("Full Name: "+ firstName+" "+lastName);


    }

}
