package com.bridgelabz.basic_core_programs;
import java.util.Scanner;
import java.util.Scanner;

public class QuotientRemainder {
    public static void main (String [] args)
    {
        Scanner Sc= new Scanner(System.in);
        // Prompt the user to enter dividend and divisor
        System.out.print("Enter the dividend: ");
        int dividend = Sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = Sc.nextInt();
        // Validate the divisor to avoid division by zero
        if (divisor == 0) {
            System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
        }
        else
        {
            // Compute quotient and remainder
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            // Display the result
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        }
        Sc.close();
    }
}
