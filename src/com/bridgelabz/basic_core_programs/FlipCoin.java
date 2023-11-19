package com.bridgelabz.basic_core_programs;


import java.util.Scanner;
import java.util.Random;

public class FlipCoin {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        // Input: Number of times to flip the coin
        System.out.print("Enter the number of times to flip the coin: ");
        int numberOfFlips = sc.nextInt();

        // Validate input
        if (numberOfFlips <= 0) {
            System.out.println("Please enter a positive integer for the number of flips.");
            return;
        }
        sc.close();
        int headsCount = 0;
        int tailsCount = 0;
        Random random = new Random();
        // Simulate coin flips
        for (int i = 0; i < numberOfFlips; i++) {

            // Randomly generate 0 or 1 (representing heads or tails)
            int result = random.nextInt(2);

            //if result==0 then head else the tail
            if (result == 0)
            {
                headsCount++;
            } else {
                tailsCount++;
            }

        }
        double headsPercentage = (double) headsCount / numberOfFlips * 100;
        double tailsPercentage = (double) tailsCount / numberOfFlips * 100;
        System.out.println();

        // Output: Display the results
        System.out.println("Results after " + numberOfFlips + " coin flips:");
        System.out.println("Heads: " + headsCount + " (" + headsPercentage + "%)");
        System.out.println("Tails: " + tailsCount + " (" + tailsPercentage + "%)");

    }

}
