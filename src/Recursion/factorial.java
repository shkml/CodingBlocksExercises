package Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = input.nextInt();

        System.out.println(factorial(n));

        System.out.println(fibonacci(n));
    }

    // Factorial
    public static int factorial(int n) {
        if (n == 1)
            return 1;
        return n*factorial(n-1);
    }

    // Fibonacci number
    public static int fibonacci(int n){
        if (n == 1 || n==0){
            return n;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }
}
