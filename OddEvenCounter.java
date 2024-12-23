package Program612;

import java.util.Scanner;

public class OddEvenCounter 
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, evenCount = 0, oddCount = 0;

        System.out.println("Enter numbers (-1 to stop):");

        while (true) {
            number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);

        scanner.close();
    }
}