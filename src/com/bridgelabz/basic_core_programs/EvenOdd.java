package com.bridgelabz.basic_core_programs;
import java.util.Scanner;
public class EvenOdd {
    public static void main (String [] args)
    {
        System.out.println("Enter a number to check even or odd");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number%2==0)
        {
            System.out.println("Number is a Even "+number);
        }
        else
        {
            System.out.println("Number is odd number "+number);
        }
    }

}
