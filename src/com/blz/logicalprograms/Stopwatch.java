package com.blz.logicalprograms;
import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        elapsedTime();
    }

    public static void elapsedTime() {
        Scanner sc = new Scanner(System.in);
        // Ask user to press any key to start the stop watch
        System.out.println("Enter key to start the timer");
        char ch = sc.next().charAt(0);
        Long start = System.currentTimeMillis();

        // Ask user to press any key to stop the stop watch
        System.out.println("Enter key to stop the timer");
        char stopch = sc.next().charAt(0);
        Long stop = System.currentTimeMillis();

        // Condition to calculate the Elapsed time
        float timeElapsed = (float) (stop - start) / 1000;
        System.out.println("Time= " + timeElapsed + "Seconds");
        sc.close();
    }
}

