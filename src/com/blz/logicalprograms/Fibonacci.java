package com.blz.logicalprograms;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        //scanner clas declaration
        Scanner sc = new Scanner(System.in);
        //input from user
        System.out.println("Enter the limit : ");
        int lim=sc.nextInt();
        if(lim>0)
        {
            int y=0,z=1,s;
            //display starting two numbers of series
            System.out.println("Fibonacci series : "+y+" "+z+" ");
            //perform iterations till the limit entered by the user
            while(z<=lim)
            {
                s=y+z;
                y=z;
                z=s;
                //condition for forcing z that it should not be printed when its value is grater than limit
                if(z<=lim)
                    System.out.println(z+" ");
            }
        }
        else
            System.out.println("Wrong Input");
        //closing scanner class
        sc.close();
    }

    }

