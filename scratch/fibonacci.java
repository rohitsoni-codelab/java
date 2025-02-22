package scratch;

import java.io.*;
import java.util.Scanner;

public class fibonacci {
    // Function to print N Fibonacci Number
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;

        for (int i = 0; i < N; i++) {
            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number=");
        int N=sc.nextInt();

        // Function Call
        Fibonacci(N);
        sc.close();
    }
}




