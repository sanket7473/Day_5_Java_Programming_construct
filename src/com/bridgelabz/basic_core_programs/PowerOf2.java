package com.bridgelabz.basic_core_programs;
import java.util.Scanner;

public class PowerOf2 {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
       //Take a user input as a N
        System.out.println("Please provide a value for N in the range 0 <= N < 31.");
        int N = sc.nextInt();
        if(N<0 && N>=31)
        {
             System.out.println("Please provide a value for N in the range 0 <= N < 31.");
             return;
        }
        // Print the table of powers of 2
        System.out.println("Powers of 2 up to 2^" + N + ":");
        for (int i = 0; i <= N; i++) {
            int result = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + result);
        }
    }


    }


