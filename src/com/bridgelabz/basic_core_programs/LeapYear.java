package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class LeapYear {
    public static void main(String [] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = Sc.nextInt();
        // Validate input
        if (year <= 0) {
            System.out.println("Please enter a valid positive year.");
        } else {
            // Check if it's a leap year
            boolean isLeapYear = checkLeapYear(year);

            // Output: Display the result
            if (isLeapYear) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }

        Sc.close();
    }
    private static boolean checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
