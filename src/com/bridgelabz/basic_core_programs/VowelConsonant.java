package com.bridgelabz.basic_core_programs;
import java.util.Scanner;
public class VowelConsonant {
    public static void main(String args[])
    {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter an alphabet to check the vowels and Consonants");

        // Extract the first character from the string
        String input = Sc.next();

        System.out.println("You entered the character: " +input);
        // Extract the first character from the string
        char userChar = input.charAt(0);
        if(userChar=='a' || userChar=='e' || userChar=='i' || userChar=='o' ||userChar=='u'|| userChar=='A' || userChar=='E' || userChar=='I' || userChar=='O' ||userChar=='U' )
        {
            System.out.println("Character is a Consonants "+userChar);
        }
        else
        {
            System.out.println("Character is a Vowels "+userChar);
        }
    }

}
