package com.bridgelabz.basic_core_programs;
import java.util.Scanner;
public class LargestINThreeNumbers {
    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value of a b c ");

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter a value of a b c "+" a value is "+ a + " b value is"+ b +" c value is "+c);

        if (a>b && a>c)
        {
            System.out.println(" a is a largest element "+ a);
        }
        else if(b>a && b>c)
        {
            System.out.println(" b is a largest element "+ b);
        }
        else
        {
            System.out.println("c is a largest element "+ c);
        }

    }

}
