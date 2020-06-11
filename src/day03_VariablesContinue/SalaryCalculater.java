package day03_VariablesContinue;

public class SalaryCalculater {
/*

    warmup task:Create a class called salary calculator,
        write a program that can calculate the tax, and salary after tax based on the hourly rate & tax rates
        ex:
             if:
                    rate = 55;
                    stateTaxRate = 0.04;
                    federalTaxRate =0.22;
                    weeklyHours = 40;

 */

    public static void main(String[] args) {
        // DataType  variableName = Data;
       double hourlyRate= 45.5;
       double stateTaxRate= 0.04;
       double federalTaxRate= 0.22;
       byte weeklyHours= 40;
       byte totalWeekinAYear= 52;

       // salary = hourlyRate* weeklyHours*52
        double salary = hourlyRate*weeklyHours*totalWeekinAYear;
        // gross salary before tax

        // stateTax= salary * stateTaxRate
        double stateTax= salary*stateTaxRate;


       // federalTax = salary * federalTaxRate;
        double federalTax= salary*federalTaxRate;

        // TotalTax= stateTax + FederalTax
        double totalTax= stateTax + federalTax;

        // salaryAfterTax=salary-stateTax-FederalTax;
        double salaryAfterTax= salary- (stateTax+federalTax);


        System.out.println("Your salary is: $ " + salary); // concatenation
        System.out.println("State tax is : $" + stateTax);  // Cancatenation
        System.out.println("Federal tax is $ " + federalTax); // Cancatenation
        System.out.println("Total Tax is: $ " + (totalTax) ) ;
        System.out.println(" Salary After Tax is $ :" + salaryAfterTax );



        //System.out.println("9" + 3 ); //concatenation
       /// System.out.println(9+"3"); //concatenation
       /// System.out.println(9 + 3); // 12 addition






            }



      }