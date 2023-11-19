package com.bridgelabz.basic_core_programs;
import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int p = 2;
        while (n > 1) {
            if (n % p == 0) {
                System.out.print(p + ", ");
                n /= p;
            }
            else {
                p++;
            }
        }
        }
    }

