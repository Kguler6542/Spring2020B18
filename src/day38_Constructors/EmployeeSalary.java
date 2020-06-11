package day38_Constructors;

public class EmployeeSalary {
    public static void main(String[] args) {

        SalaryCalculator Can = new SalaryCalculator(45,48,6.75/100,0.2);

       // System.out.println(Can.salary());
        // System.out.println(Can);

        SalaryCalculator Ali = new  SalaryCalculator(60, 40,8.75/100, 0.26);

        System.out.println(Ali);
        System.out.println(Ali.salaryAfterTax());

    }
}
