package Program612;

import java.util.Scanner;

public class ArmstrongNumberFinder 
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end number: ");
        int end = scanner.nextInt();

        printArmstrongNumbers(start, end);
    }

    public static void printArmstrongNumbers(int start, int end) 
    {
        for (int num = start; num <= end; num++)
        {
            if (isArmstrongNumber(num)) 
            {
                System.out.println(num);
            }
        }
    }

    public static boolean isArmstrongNumber(int num)
    {
        int originalNum = num;
        int sum = 0;
        int numDigits = (int) Math.log10(num) + 1;

        while (num > 0) 
        {
            int digit = num % 10;
            int cube = 1;
            for (int i = 0; i < numDigits; i++)
            {
                cube *= digit;
            }
            sum += cube;
            num /= 10;
        }

        return sum == originalNum;
    }
}