package Pogram312;

import java.util.Scanner;

public class Calculator 
{
    public int add(int a, int b) 
    {
        return a + b;
    }

    public int add(int a, int b, int c) 
    {
        return a + b + c;
    }

    public double add(double a, double b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // First add() method
        System.out.print("Enter two integers: ");
        System.out.println();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum1 = calculator.add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum1);

        // Second add() method
        System.out.print("Enter three integers: ");
        System.out.println();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int sum2 = calculator.add(num3, num4, num5);
        System.out.println("Sum of " + num3 + ", " + num4 + ", and " + num5 + " is: " + sum2);

        // Third add() method
        System.out.print("Enter two decimal numbers: ");
        System.out.println();
        double num6 = scanner.nextDouble();
        double num7 = scanner.nextDouble();
        double sum3 = calculator.add(num6, num7);
        System.out.println("Sum of " + num6 + " and " + num7 + " is: " + sum3);
        scanner.close();
    }
}