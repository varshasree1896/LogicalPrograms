package com.blz.logicalprograms;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int count = 0;
        if (n == 1)
            System.out.println("not a prime number");
        else if (n == 2)
            System.out.println("is a prime number");
        else {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0)
                    count = count + 1;
                break;
            }
            if (count == 1)
                System.out.println("not a prime number");
            else
                System.out.println("is a prime number");
            sc.close();
        }
    }
}
