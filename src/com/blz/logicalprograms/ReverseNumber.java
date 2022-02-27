package com.blz.logicalprograms;
import java.util.Scanner;
public class ReverseNumber {
    public static void main (String[]args)
    {
        //scanner class declaration
        Scanner sc = new Scanner (System.in);

        //input from user
        System.out.print ("Enter a number : ");

        int number = sc.nextInt ();
        System.out.print ("Reverse of " + number + " is :");

        int reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }

        //display the reversed number
        System.out.print (reverse);

        //closing scanner class(not compulsory, but good practice)
        sc.close ();
    }
}
