package Program612;

import java.util.Scanner;

public class EmployeeSalary 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter the basic salary of the employee: ");
            double basicSalary = scanner.nextDouble();

            double HRA, DA, grossSalary;

            if (basicSalary > 15000) 
            {
                HRA = basicSalary * 0.20; 
                DA = basicSalary * 0.60;  
            } else 
            {
                HRA = 3000; 
                DA = basicSalary * 0.70; 
            }

            grossSalary = basicSalary + HRA + DA;

            System.out.println("Gross salary of the employee: " + grossSalary);

            System.out.print("Enter -1 to continue or any other number to exit: ");
            int choice = scanner.nextInt();

            if (choice != -1) {
                break;
            }
        }
        scanner.close();
    }
}
